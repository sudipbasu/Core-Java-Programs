package collection_framework;
import java.util.*;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Sudip");
		list.add("Basu");
		Iterator itr = list.Iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
