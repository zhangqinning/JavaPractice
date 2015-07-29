import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class _056 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set =new TreeSet<Integer>();
		Random ran=new Random();
		int count=0;
		while(count <=10){
			Boolean b=set.add(ran.nextInt(100));
			if(b==true)count++;
		}
		Integer[] array=new Integer[set.size()];
		set.toArray(array);
		System.out.println("不重复的随机数：");
		for(Integer i:array)
			System.out.print(i+" ");
	}

}
