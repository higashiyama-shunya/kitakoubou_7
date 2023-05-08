package kita7;

public class Rensyu7_1 {

	public static void main(String[] args) {
		//7_1
		System.out.println("7-1");
		Dog dog=new Dog();	//dogクラスのインスタンスの作成
		dog.SetName("タロウ");	//SetNameメソッドで名前を決める
		dog.ShowProfile();	//ShowPrifileメソッドで自己紹介文の出力
		
		//7_2
		System.out.println("\n7-2");
		Dog dog2=new Dog();
		dog2.SetName("こじろう");
		dog2.SetAge(8);		//SetAgeメソッドで年齢を設定する。
		dog2.ShowProfile();	//追加された文が出力される。
		
		//7_3
		System.out.println("\n7-3");
		Dog dog3=new Dog();
		Dog dog4=new Dog();	//2つのインスタンス作成
		dog3.SetName("むぎ");
		dog3.SetAge(3);
		
		dog4.SetName("まい");
		dog4.SetAge(5);			//それぞれのインスタンスの名前と年齢を設定。
		
		dog3.ShowProfile();
		dog4.ShowProfile();	//2つの自己紹介文の出力
		
		//7_4
		System.out.println("\n7-4");
		Dog dog5=new Dog("チワワ");//インスタンスを作成した際に犬種がもう設定できるようにしている
		dog5.SetName("もも");
		dog5.SetAge(2);
		dog5.ShowProfile();
	}

}
