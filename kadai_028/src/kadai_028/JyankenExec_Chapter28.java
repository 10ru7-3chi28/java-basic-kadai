package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//じゃんけんクラスのインスタンスを作成する
		Jyanken_Chapter28 jyan = new Jyanken_Chapter28();
		//自分のじゃんけんの手を出力する
		String user = jyan.getMyChoice();
		//対戦相手のじゃんけんの手が乱数で選ばれる
		String opponent = jyan.getRandom();
		//じゃんけんの結果を出力する
		System.out.println("自分の手は" + jyan.map.get(user)+"," + "対戦相手の手は" + jyan.map.get(opponent));
		String result = jyan.playGame(user, opponent);
		System.out.println(result);
	}

}
