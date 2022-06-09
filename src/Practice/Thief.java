package Practice;

public class Thief {
	String name;
	int hp; 
	int mp;
	
	Thief(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	Thief(String name, int hp){
		this(name, hp, 5);
	}
	
	public void printInfo() {
		System.out.println("名前：" + this.name);
		System.out.println("HP：" + this.hp);
		System.out.println("MP：" + this.mp);
	}
	
}
