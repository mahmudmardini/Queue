package Queue;

public class Queue {
	public Object [] elements;
	private int rear, front;
	
	public Queue (int capacity){
		
	elements = new Object[capacity];	
	rear=-1;
	front=0;
	
	}

	public void enQueue(Object data){
		
//		if(front >= rear && front != 0) {rear = -1; front = 0;} 
		
		if(isFull()) { System.out.println("List is Full..");
	}else {
		rear++;
		elements[rear] = data;
	}
}
	
	
	public Object deQueue() {
		
		if(isEmpty()) {
			
			return "List is Empty..";
			
		}else {
			
			Object data = elements[front];
			elements[front] = null;	
			
		 //	 front++;
			
/***********************************************************************************
  	Burada front değeşkeni arttırmadım çünkü onu arttığımda ve 
  	listedeki elemanları sildiğimde listede boş yerler varken onu FULL olarak 
  	gösteriyor ve bu nedenle algoritma doğru bir şekilde çalışmıyor...
  	Bu sorunu çözmek için FRONT değişkeni sabit tuttum (0) ve alttaki döngüyü yazdım..
  	Bir döngü eklemek maliyetli olduğunu biliyorum ama alagoritma gerçek hayattaki kuyruk gibi 
  	ve doğru bir şekilde çalışması için bu şekilde yazdım.
  		
  	boşalan pozisyonlara tekrardan eleman yerleştirmesi yapılamaması için 
  	yukarıdaki (front++) kodu çalıştırıp ve alttaki kodu 56 satıra kadar durdurarak yapabiliriz.
  		
	********************************************************************************/
 			 for(int i = 1 ; i<size() ; i++) {
 				 elements[i-1] = elements[i];
 			 }
 			 rear--;
 			 
			 return data;
		}
	}
	
public Object peek() {
	
	if(isEmpty()) {
		return "List is Empty..";
	}else {
		
	}
		return elements[front];
	}
	
	public int size() {


		return rear +1;
	}

	public boolean isFull() {
		
		return rear+1 == elements.length;
	}

	public boolean isEmpty() {
		
		return rear < front;
	}
	
	
	
}
