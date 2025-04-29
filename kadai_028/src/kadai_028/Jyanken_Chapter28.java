package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public HashMap<String, String> map = new HashMap<>();

    public Jyanken_Chapter28() {
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");
    }

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            input = scanner.nextLine();
            if (input.equals("r") || input.equals("s") || input.equals("p")) { 
                break;
            }
            System.out.println("入力が間違っています。もう一度入力してください。");
        }
        return input;
    }

    public String getRandom() {
        String[] array = {"r", "s", "p"};
        double randNum = Math.random() * array.length; 
        int index = (int)Math.floor(randNum); 
        return array[index];
    }

    public String playGame(String user, String opponent) {
        if (user.equals(opponent)) {
            return "あいこです";
        } else if ((user.equals("r") && opponent.equals("s")) ||
                   (user.equals("s") && opponent.equals("p")) ||
                   (user.equals("p") && opponent.equals("r"))) {
            return "自分の勝ちです";
        } else {
            return "自分の負けです";
        }
    }
}
