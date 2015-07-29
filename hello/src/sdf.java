import java.util.Random;


public class sdf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(48);
		for(int i = 0;i<1000;i++)
		switch(rand.nextInt(3)){
		case 1: System.out.println("1");
		case 2: System.out.println("2");
		case 3: System.out.println("3");
		}
		
	}

}
