package chap09;

import world.Hero;
import world.Sword;

public class Main343 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name  = "鉄砕牙";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "犬夜叉";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
		
	}
}
		
