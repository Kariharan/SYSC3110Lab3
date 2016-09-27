
public class BuddyInfo {
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	String address;
	int phone_number;
	
	public BuddyInfo(String Name, String Address, int Phone_Number){
		this.setName(Name);
		this.setAddress(Address);
		this.setPhone_number(Phone_Number);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo Homer = new BuddyInfo("Homer", "Some Place",00000000);
		System.out.println("Hello " + Homer.getName());
	}

}
