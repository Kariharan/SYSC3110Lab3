import java.io.Serializable;
import java.util.ArrayList;

public class AddressBook implements Serializable{
	ArrayList<BuddyInfo> Collect = new ArrayList<BuddyInfo>();
	
	public AddressBook(){
		ArrayList<BuddyInfo> Collection = new ArrayList<BuddyInfo>();
		Collect = Collection;
	}
	
	public void addBuddy(BuddyInfo Friend){
		Collect.add(Friend);
	}
	
	public void removeBuddy(BuddyInfo Friend){
		Collect.remove(Friend);
	}
	
	public String toString(){
		String str = String.format("%15s","Name") + String.format("%15s","Address") + String.format("%15s", "Phone Number") + "\n";
		for(BuddyInfo Buddy: Collect){
			str += Buddy;
		}
		return str;
	}
	
	public static void main(String[] args) {
		AddressBook Friends = new AddressBook();
		BuddyInfo Tom = new BuddyInfo("Tom", "Carleton", "61300000");
		BuddyInfo Jill = new BuddyInfo("Jill", "Carleton", "61300001");
		BuddyInfo Alex = new BuddyInfo("Alex", "Carleton", "61300002");
		Friends.addBuddy(Tom);
		Friends.addBuddy(Jill);
		Friends.addBuddy(Alex);
		Friends.removeBuddy(Tom);
		Friends.removeBuddy(Jill);
		Friends.removeBuddy(Alex);
	}
}
