package kita7;

public class Rensyu7_5 {

	public static void main(String[] args) {
		//7_5
		System.out.println("7-5");
		CoinCase cc=new CoinCase();
		cc.AddCoins(500, 4);
		cc.AddCoins(100, 3);
		cc.AddCoins(50, 7);
		cc.AddCoins(10, 9);
		cc.AddCoins(5, 6);
		cc.AddCoins(1, 3);
		cc.AddCoins(124, 43);
		cc.AddCoins(500, 2);
		cc.AddCoins(5, 3);
		cc.AddCoins(8, 2);
		
		System.out.println("500円:"+cc.GetCount(500)+"枚");
		System.out.println("100円"+cc.GetCount(100)+"枚");
		System.out.println("50円"+cc.GetCount(50)+"枚");
		System.out.println("10円"+cc.GetCount(10)+"枚");
		System.out.println("5円"+cc.GetCount(5)+"枚");
		System.out.println("1円"+cc.GetCount(1)+"枚");
		
		System.out.println("総額:"+cc.GetAmount()+"円");

	}

}
