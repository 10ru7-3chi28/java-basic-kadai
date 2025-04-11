package kadai_018;

public abstract class Kato_Chapter18 {
	private String familyName = "加藤";
	private String givenName;
	private String address = "東京都中野区○×";
	
	public abstract void execIntroduce();
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public String getAddress() {
		return address;

	}

}
