import java.io.Serializable;

public class BuddyInfo implements Serializable{
	
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	String address;
	String phone_number;
	
	public BuddyInfo(String Name, String Address, String Phone_Number){
		this.setName(Name);
		this.setAddress(Address);
		this.setPhone_number(Phone_Number);
	}
	
	public String toString(){
		String str = String.format("%15s",name) + String.format("%15s",address) + String.format("%15s",phone_number) + "\n";
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo Homer = new BuddyInfo("Homer", "Some Place","00000000");
		System.out.println("Hello " + Homer.getName());
	}

}
