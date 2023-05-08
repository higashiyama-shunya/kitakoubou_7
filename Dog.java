//練習問題で使用するdogクラス
package kita7;

public class Dog {
//フィールド
	private String Name;	//フィールドはprivateの名前
	private int Age;
	private String Breed;

	
//コンストラクタ
	public Dog(String br) {	//インスタンス化した際にString型の引数があれば、それを犬種の変数にする。
		this.Breed=br;
	}
	public Dog() {
		
	}

//メソッド	
	public void SetName(String nm) {	//名前を設定するメソッド　setter
		Name=nm;
	}
	public void SetAge(int ag) {	//年齢を設定するメソッド
		Age=ag;
	}
	
	public void ShowProfile() {		//自己紹介の文を出力するメソッド
		System.out.println("名前は"+Name+"です。");
		System.out.println("年齢は"+Age+"歳です。");
		System.out.println("犬種は"+Breed+"です。");
	}
	
}
