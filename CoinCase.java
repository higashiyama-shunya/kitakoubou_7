package kita7;

public class CoinCase {
	private int Fivehundred=0;
	private int Onehundred=0;
	private int Fifty=0;
	private int ten=0;
	private int five=0;
	private int one=0;
	
	public void AddCoins(int coin,int num) {
		if(coin==500) {
			Fivehundred+=num;
		}else if(coin==100) {
			Onehundred+=num;
		}else if(coin==50) {
			Fifty+=num;
		}else if(coin==10) {
			ten+=num;
		}else if(coin==5) {
			five+=num;
		}else if(coin==1) {
			one+=num;
		}
	}
	
	public int GetCount(int coin) {
		if(coin==500) {
			return Fivehundred;
		}else if(coin==100) {
			return Onehundred;
		}else if(coin==50) {
			return Fifty;
		}else if(coin==10) {
			return ten;
		}else if(coin==5) {
			return five;
		}else if(coin==1) {
			return one;
		}
		return 0;
	}
	
	public int GetCount() {
		int allnum=Fivehundred+Onehundred+Fifty+ten+five+one;
		return allnum;
	}
	
	public int GetAmount(int coin) {
		if(coin==500) {
			return Fivehundred*500;
		}else if(coin==100) {
			return Onehundred*100;
		}else if(coin==50) {
			return Fifty*50;
		}else if(coin==10) {
			return ten*10;
		}else if(coin==5) {
			return five*5;
		}else if(coin==1) {
			return one;
		}
		return 0;
	}
	
	public int GetAmount() {
		int total=GetCount(500)*500+GetCount(100)*100+GetCount(50)*50+GetCount(10)*10+GetCount(5)*5+GetCount(1)*1;	//ここはGetCountメソッドで表示せずともフィールド変数を使用すれば作成できた
																				//例:Fivuhundred*500で500円の総額が分かった
		return total;
	}
}
