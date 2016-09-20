
import java.util.ArrayList;

public class AddressBook {
	ArrayList<BuddyInfo> Collect = new ArrayList<BuddyInfo>();
	
	public void addBuddy(String Name, String Address, int Phone_Number){
		BuddyInfo Friend = new BuddyInfo(Name, Address, Phone_Number);
		Collect.add(Friend);
	}
	
	public void removeBuddy(BuddyInfo Friend){
		Collect.remove(Friend);
	}
}
