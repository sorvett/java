package Practice;

public class test5 {
	public static void email(String title, String address, String text) {
		System.out.println(address);
		System.out.println(title);
		System.out.println(text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
		
	}

	public static void main(String[] args) {
	
		email("お誘い", "@xxxx.com", "今度、飲みに行きませんか");
		
		email("@yyy.com", "こんにちは");
	}

}
