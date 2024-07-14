package taka.src.ExceptionHandling;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;



public class main {

	/**
	 * メインメソッド
	 * @param args 未使用
	 * 
	 * 	
	 */
	public static void main(String[] args) {
	String fileName = "test.txt";
//	String fileName = "aaaa.txt";
	
	try {
		// ファイル読み込み
		List<String> result = getAll(fileName);
		//結果表示
		System.out.println("\n---ファイル内容---");
		for (String str : result) {
			System.out.println(str);
		}
		System.out.println("---ファイル内容（おわり）---");
	} catch (IOException e) {
		System.out.println("\nIOExceptionが発生しました。:" + e.getMessage());
	}

	System.out.println("\n メインメソッド終了。");
}
		
		
		
	/**
	 * ファイルから全行の取得
	 * @return 結果の文字列リスト
	 * @throws IOException 
	 */
	   static List<String> getAll(String fileName) throws IOException {
		Path filePath = Path.of(fileName);
		return Files.readAllLines(filePath);
		   
	   }
		
		/**
			static List<String> getAll(String fileName) throws IOException {

		Path filePath = Path.of(fileName);
		return Files.readAllLines(filePath);
		}
	
		 */	
		
		
		
		
		

	}


