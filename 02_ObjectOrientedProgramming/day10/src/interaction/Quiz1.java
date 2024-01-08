package interaction;

class Unit{
	String charactor;
	int hp, atk;
	Unit(String charactor, int hp, int atk){
		this.charactor = charactor;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showInfo(){
		String msg = "%s(hp %d, atk %d)\n";
		System.out.printf(msg,charactor,hp,atk);
	}
	
	void attack(Unit tar) {
		System.out.printf("%s가 %s를 공격\n",this.charactor,tar.charactor);
		tar.hp -= this.atk;
		String msg = "%s(hp %d, atk %d)\n";
		System.out.printf(msg,tar.charactor,tar.hp,tar.atk);
		
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Unit war = new Unit("전사", 100, 10);		// 이름, hp, atk
		Unit wiz = new Unit("마법사", 70, 15);
		
		war.showInfo();		// 전사(hp 100, atk 10)
		wiz.showInfo();		// 마법사(hp 70, atk 15)
		
		war.attack(wiz);	// 전사가 마법사를 공격
							// 마법사 ( hp 60, atk 15)
		
		wiz.attack(war);	// 마법사가 전사를 공격
							// 전사 (hp 85, atk 10)
	}
}
