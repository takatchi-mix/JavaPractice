/**
 * 実行用クラス
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// 速水さんインスタンス化・メンバアクセス
		SalesEmployee hayami = new SalesEmployee();
		hayami.name = "速水剛留";		// 名前の設定
		hayami.salesAmt = 1000000;		// 売上合計金額の設定
		System.out.println();
		hayami.displayInfo();			// 情報表示
		
		// 河合さんインスタンス化・メンバアクセス
		SalesEmployee kawai = new SalesEmployee();
		kawai.name = "河合彩香";		// 名前の設定
		kawai.salesAmt = 500000;		// 売上合計金額の設定
		System.out.println();
		kawai.displayInfo();			// 情報表示
		
		// 速水さん 20万円返品・河合さん 20万円売上
		hayami.refund(200000);			// 戻り値未使用
		kawai.sell(200000);				// 戻り値未使用

		System.out.println("\n----返品・売上処理後----\n");
		hayami.displayInfo();			// 速水さん情報表示
		System.out.println();
		kawai.displayInfo();			// 河合さん情報表示
		
		// 合計表示
		System.out.println("\n２人の売上合計："
							+ (hayami.salesAmt + kawai.salesAmt)
							+ "円");
	}
}
