package tgy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DvdManager {

	private List<Dvd> list = new ArrayList<Dvd>();
	
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	public void add(Dvd gora) {
		// TODO Auto-generated method stub
		list.add(gora);
		
	}

	public List<Dvd> getSortedList() {
		Collections.sort(list);
		return list;
	}

	
}
