import java.util.ArrayList;
import java.util.List;

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
		
		BuddyInfo bud = new BuddyInfo("Tom","Carleton","416");
		AddressBook addBook = new AddressBook();
		addBook.addBuddy(bud);
		addBook.removeBuddy(0);
	}
}
