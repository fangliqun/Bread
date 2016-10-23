import java.util.ArrayList;
import java.util.List;

public class Buffer {
	public List<NewBread> list;
	private  int id=0;
	Buffer(){
		list=new ArrayList<NewBread>(20);
	}
	
	public void add(NewBread bread){
		synchronized (list) {
			while(list.size()==20){
				try {
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			bread.setId(id);
			id++;
			list.add(bread);
			System.out.println(Thread.currentThread().getName()+"生产了商品"+bread+"号");
			list.notifyAll();
		}
	}
	public NewBread put(){
		synchronized (list) {
			while(list.isEmpty()){
				try {
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			NewBread bread=list.remove(0);
			System.out.println(Thread.currentThread().getName()+"消费了商品"+bread+"号");
			list.notifyAll();
			return bread;
		}
	}
}
