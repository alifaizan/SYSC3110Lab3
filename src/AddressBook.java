import java.util.ArrayList;

public class AddressBook {

	ArrayList<BuddyInfo> buddylist;
	
	public void addBuddy(BuddyInfo aBuddyInfo){
		
		if(aBuddyInfo!=null){
			
			buddylist.add(aBuddyInfo);
		}
	}
	
	public void removeBuddy(int index){
		
		if(index>=0 && index < buddylist.size()){
			
			buddylist.remove(index);
		}
		
	}
	
	public static void main (String[] args){
		
		System.out.println("Address Book");
	}
}
