# throw命令とthrows宣言の違い
## throw命令→例外を意図的発生させて例外処理を実行する目的

例外クラス名 変数名
= new 例外クラス名(メッセージ文字列);
throw 変数名;

例)
String msg = "たかはしさん"
lilegalArgumentException x
= new lilegalArgumentException(msg);
throw x;



## throws宣言→メソッド内で例外が発生した場合に呼び出し元に例外を投げるのが目的

戻り値 メソッド(型 変数)｛

例外が発生する可能性のある処理
｝






