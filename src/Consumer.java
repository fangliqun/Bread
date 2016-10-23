
public class Consumer implements Runnable{
	Buffer buffer;
	public Consumer(Buffer buffer) {
		this.buffer=buffer;
	}
	@Override
	public void run() {
		while(true){
			NewBread bread=buffer.put();
			if(bread==null){
				break;
			}
		}
	}
}
