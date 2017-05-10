package tgy;

public class Dvd implements Comparable<Dvd>{

	private String title;
	public void setTitle(String string) {
		// TODO Auto-generated method stub
		this.title = string;
	}
	public String getTitle(){
	return title;
	}
	
	public int compareTo(Dvd bbb) {
		return this.getTitle().compareTo(bbb.getTitle());
	}
	
}
