
public class Producer implements Runnable{
	Buffer buffer;
	public Producer(Buffer buffer) {
		this.buffer=buffer;
	}
	@Override
	public void run() {
		while(true){
			NewBread bread=new NewBread();
			buffer.add(bread);
		}
	}
	
	
}
