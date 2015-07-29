import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class DaemonFromFactory implements Runnable{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newCachedThreadPool(new DaemonThreadFactory());
//		ExecutorService exec=DaemonThreadPoolExecutor(new DaemonThreadFactory());
		for(int i=0;i<10;i++){
			exec.execute(new DaemonFromFactory());
		}
		System.out.println("START");
		TimeUnit.MILLISECONDS.sleep(500);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
