import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;




public class CachedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exct=Executors.newSingleThreadExecutor();
		for(int i =0;i<5;i++)
			exct.execute(new LifeOff());
			exct.shutdown();
		
		
	}

}
