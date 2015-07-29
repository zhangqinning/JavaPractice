

public class Consumer extends Thread{

	Producer producer;
	Consumer(Producer p){
		producer=p;
	}
	
	
	@Override
	public void run() {
		try{
			while(true){
				String message=producer.getMessage();
				System.out.print("Got message:"+message);
			}
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer producer=new Producer();
		producer.start();
		new Consumer(producer).start();
	}

}
