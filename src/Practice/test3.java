package Practice;
class VirtualPet{
	private String name;
	private int HP;
	private int maxHP;
	
	VirtualPet(String name){
		this.name = name;
		this.HP = 50;
		this.maxHP = 100;
	}
	
	public void setName(String name) {this.name = name;}
	
	public String getName(){return this.name;}
	
	public void setHp(int HP) {this.HP = HP;}
	
	public int getHp(){return this.HP;}
	
	public void setMaxHp(int maxHP) {this.maxHP = maxHP;}
	
	public int getMaxHp(){return this.maxHP;}
	
	public void printInfo() {
		System.out.println("名前：" + getName());
		System.out.println("体力：" + getHp());
		System.out.println("最大体力：" + getMaxHp());
	}
}

class VirtualRat extends VirtualPet{
	VirtualRat(String name){
		super(name);
	}
}


public class test3 {
	public static void main(String[] args) {
		VirtualRat rat = new VirtualRat("ラット");
		rat.printInfo();
	

	}

}
