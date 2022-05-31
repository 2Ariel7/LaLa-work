package world;

public class Animal {
	public String name;
	public int hp = 10;
	public boolean life = true; 
	
	//コンストラクタ使った場合
	public Animal() {
		this.name = "アニマル";
	}
	public Animal(String name) {
		this.name = name;
	}
	
	
	public void eat() {
		System.out.println(this.name + "は食べた。");
		System.out.println("HPが10上がった。");
		this.hp = this.hp + 10;
	}
	
	public void go() {
		System.out.println(this.name + "は走った。");
		System.out.println("HPを5使った。");
		this.hp = this.hp - 5;
		if (this.hp < 1) {
			dead();
		}
		
	}
	public void dead() {
		life = false;
		System.out.println(this.name + "は死んだ。");
	}
}