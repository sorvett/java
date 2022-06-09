package Practice;

 class Matango {
	int hp = 50;
	char suffix;
	
	Matango(char suffix) {
		this.suffix = suffix;
		this.hp = 50;
	}
	 /*void attack(Hero h) {
		System.out.println();
		System.out.println();
		h.hp -= 10;
	}*/
	
}

 class PoisonMatango extends Matango{
	
	int poisonCount = 5;
	
	public  PoisonMatango(char suffix) {
		super(suffix);
	}
	
	/* void attack(Hero h) {
		System.out.println(); //super.attack(h);で書ける
		System.out.println();
		h.hp -= 10;
		
		if( poisonCount < 0) {
			System.out.println("");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "");
			this.poisonCount--;
		}
	}*/
}
