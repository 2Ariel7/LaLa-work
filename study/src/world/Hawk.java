package world;
public class Hawk extends Animal {
	 public void go() {
		 System.out.println(this.name + "は大空をとんだ。");
		 System.out.println("hpを5使った。");
		 this.hp = this.hp -5;
		 super.go();
	 }
 }

