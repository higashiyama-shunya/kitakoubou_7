//サイトにあった正答例
package kita7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyu7_6_seikai {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
        BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
        CoinCase MyCase = new CoinCase();

	for( int i = 0 ; i < 10 ; i++ )		//for文で回して入力できるようにしている。
	{
		System.out.print( "硬貨の種類は?" );
		int kind = Integer.parseInt( br.readLine() );	//文字列で入力してもらったものをint型に戻して代入している
		System.out.print( "硬貨の枚数は?" );
		int count = Integer.parseInt( br.readLine() );
		
		MyCase.AddCoins( kind, count );	//CoinCaseクラスにあるメソッドを使用。
	}

	System.out.println( "500円は" + MyCase.GetCount( 500 ) + "枚" );
	System.out.println( "100円は" + MyCase.GetCount( 100 ) + "枚" );
	System.out.println( "50円は" + MyCase.GetCount( 50 ) + "枚" );
	System.out.println( "10円は" + MyCase.GetCount( 10 ) + "枚" );
	System.out.println( "5円は" + MyCase.GetCount( 5 ) + "枚" );
	System.out.println( "1円は" + MyCase.GetCount( 1 ) + "枚" );
	System.out.println( "総額は" + MyCase.GetAmount() + "円" );
	}

}
