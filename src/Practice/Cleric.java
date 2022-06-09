package Practice;

public class Cleric {
	String name;
	int Hp;
	final int maxHp = 50;
	int Mp;
	final int maxMp = 10;
	
	Cleric(String name, int Hp, int Mp){
		this.name = name;
		this.Hp = Hp;
		this.Mp = Mp;
	}
	public void printInfo() {
		System.out.println("名前："+ this.name);
		System.out.println("HP:" + this.Hp);
		System.out.println("maxHP：" + this.maxHp);
		System.out.println("MP：" + this.Mp);
		System.out.println("maxMP：" + this.maxMp);
	}
	public void selfAid() {
		this.Mp -= 5;
		this.Hp = this.maxHp;
	}
	
}
