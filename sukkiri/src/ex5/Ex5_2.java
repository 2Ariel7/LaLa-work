package ex5;

public class Ex5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "お誘い";
		String address ="今度、飲みに行きませんか";
		email(title, address, text);

	}
	public static void email(String title,String address,String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名" + title);
		System.out.println("本文" + text);
	
	}
////	
//	public static vold email(String address, String text) {
//		System.out.println(address + "に以下のメールを送信しました");
//		System.out.println("件名:無題" );
//		System.out.println("本文" + text);
//
//	}

}
