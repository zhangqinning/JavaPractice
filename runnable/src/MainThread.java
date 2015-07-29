
public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeOff lo=new LifeOff();
		lo.run();
		
		
		Thread t=new Thread(new LifeOff());
		t.start();
		
		for(int i =0;i<5;i++){
			new Thread(new LifeOff()).start();
			System.out.println("lifeOff!");
		}
	}

}
