package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	@Override
	public void execIntroduce() {
		System.out.println("名前は"+ getFamilyName() + getGivenName() + "です");
		System.out.println("住所は"+ getAddress() + "です");
		System.out.println("Javaが得意です");
		System.out.println();

	}

}
