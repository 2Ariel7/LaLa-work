package world;

public class SuperHero extends Hero {
	public boolean flying;

	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	public SuperHero(String name) {
		super(name);
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("到着した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した。");
	}
}
