import java.util.*;

public class Lotto {
	Vector<Integer> lotto;
	
	public Lotto() {
		lotto = new Vector<Integer>();

		Random r = new Random();
		while(lotto.size()<6) {
			int number = r.nextInt(46);
			if(number != 0 && !lotto.contains(number)) {
				lotto.add(number);
			}
		}
		Collections.sort(lotto);
	}
	public Vector<Integer> getNumber() {
		return lotto;
	}
	
}

