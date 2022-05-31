package world;

public class Item {
	String name;
	int price;
	
	//引数のないコンストラクタ
	public Item() {}
	
	//名前をもつコンストラクタ
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}
	//名前と値段をもつコンストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
}
