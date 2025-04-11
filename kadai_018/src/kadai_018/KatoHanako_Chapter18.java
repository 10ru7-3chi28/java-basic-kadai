package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	@Override
	public void execIntroduce() {
		System.out.println("名前は"+ getFamilyName() + getGivenName() + "です");
		System.out.println("住所は"+ getAddress() + "です");
		System.out.println("趣味は読書です");
		System.out.println();


	}

}
