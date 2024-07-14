package taka.src.ExceptionHandling;

/**
 * throwサンプル
 * @author M.Takahashi
 */
public class Exception {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		int age = 11;
//		int age = 12;
//		int age = -1;
		
		try {
			String result = divide(age);
			System.out.println("\n 区分=" + result);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n メインメソッド終了。");
	}

	/**
	 * 区分の取得
	 * @param age 年齢
	 * @return "子供"／"大人" (12歳以上が大人）
	 */
	static String divide(int age) throws IllegalArgumentException {

		String result = null;

		if (age < 0) {
			String msg = "年齢は0歳以上を指定してください。";
			IllegalArgumentException ex = new IllegalArgumentException(msg);
			throw ex;
		} else if (age < 12) {
			result = "子供";
		} else {
			result = "大人";
		}
		
		return result;
	}

}

