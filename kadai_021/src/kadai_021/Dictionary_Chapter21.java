package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String,String>dic;
	
	public Dictionary_Chapter21() {
		this.dic = new HashMap<String,String>();
		
		dic.put("apple", "りんご");
		dic.put("peach", "桃");
		dic.put("banana","バナナ");
		dic.put("lemon","レモン");
		dic.put("pear","梨");
		dic.put("kiwi","キウイ");
		dic.put("strawberry","いちご");
		dic.put("grape","ぶどう");
		dic.put("muscat","マスカット");
		dic.put("cherry","さくらんぼ");
		
	}
	public void searchWithLoop(String word) {
		for(String key : dic.keySet()) {
			if(key.equals(word)) {
				System.out.println(key + "の意味は" + dic.get(key));
				return;
			}
		}
		System.out.println(word + "は辞書に存在しません");
	}
	
	
}
	

	