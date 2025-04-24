package kadai_021;

public class DictionaryExec_Chapter21{
	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//TODO 調べる英単語を配列にセットする
		String[] words ={"apple","banana","grape","orange"};
		for(String word:words) {
			dictionary.searchWithLoop(word);
		}
		//TODO 辞書を調べるメゾッドを引数指定で呼び出す
		
	}
}