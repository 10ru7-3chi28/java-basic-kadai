package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区○×";
	
	public void commonIntroduce(String setGivenName, String familyName, String address) {
		System.out.println("名前は" + familyName + setGivenName + "です");
		System.out.println("住所は" + address + "です");
	};
	public abstract void eachIntroduce();
	public void execIntroduce() {
		commonIntroduce(this.givenName, this.familyName, this.address);
		eachIntroduce();
	};
}