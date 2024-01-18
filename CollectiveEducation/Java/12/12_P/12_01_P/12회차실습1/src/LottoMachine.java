import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class LottoMachine extends JFrame implements ActionListener {

	JComboBox<Integer> game; 
	JButton start = new JButton("Start");
	JPanel output;
	JLabel info = new JLabel("게임 수를 선택하세요!", JLabel.CENTER);
	
	public LottoMachine() {
		super("Lotto");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container frame = getContentPane();
		
		start.addActionListener(this);
		
		Integer[] count = { 1,2,3,4,5 };
		game = new JComboBox<Integer>(count);
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(new JLabel("게임 수 : "));
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(game);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.add(start);
		p.add(Box.createRigidArea(new Dimension(10,0)));
		p.setBorder(new EtchedBorder(BevelBorder.LOWERED));
		
		output = new JPanel();
		output.setLayout(new BoxLayout(output, BoxLayout.Y_AXIS));

		frame.add(p, BorderLayout.NORTH);
		frame.add(output, BorderLayout.CENTER);
		frame.add(info, BorderLayout.PAGE_END);
	}
	public void actionPerformed(ActionEvent e) {
		Integer count = (Integer)game.getSelectedItem();

		ArrayList<Lotto> list = new ArrayList<Lotto>();
		for(int i=0; i<count; i++) {
			list.add(new Lotto());
		}

		output.removeAll();
		for(Lotto lotto : list) {
			LinePanel line = new LinePanel(lotto.getNumber());
			output.add(line);
			output.validate();
		}

		Calendar now = Calendar.getInstance();
		String msg = "";
		msg += now.get(Calendar.YEAR)+" 년 ";
		msg += now.get(Calendar.MONTH)+1+" 월 ";
		msg += now.get(Calendar.DATE)+" 일 (";
			
		msg += now.get(Calendar.HOUR_OF_DAY)+" 시 ";
		msg += now.get(Calendar.MINUTE)+" 분 ";
		msg += now.get(Calendar.SECOND)+" 초)";
		
		info.setText(msg);
	}
	
	public class LinePanel extends JPanel {
		public LinePanel(Vector<Integer> numbers) {
			setLayout(new GridLayout(1,6));

			for(Integer value : numbers) {
				JLabel text = new JLabel(value.toString(), JLabel.CENTER);
				text.setForeground(Color.blue);
				JPanel p = new JPanel();
				p.setLayout(new BorderLayout());
				p.setBorder(new EtchedBorder(BevelBorder.LOWERED));
				p.setBackground(Color.white);
				p.add(text);
				add(p);
			}
		}
	}
	public static void main(String[] args) {
		LottoMachine app = new LottoMachine();
		app.setSize(400,400);
		app.setVisible(true);
	}

}
