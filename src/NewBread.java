
public class NewBread {
	private int id;
	NewBread(){
		
	}
	NewBread(int id){
		this.id=id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return "Bread["+"id="+id+"]";
	}
}
