package jp.co.worksap.global;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	
		public static void main(String arg[])throws Exception
		{
			ImmutableQueue<Integer> ab = new ImmutableQueue<Integer>();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(df.format(new Date()));
			for(int i=0; i<90000; i++)
				ab = ab.enqueue(i);
			SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(df.format(new Date()));
			System.out.println(ab.peek().toString());
	        for(int i=0; i<90000; i++)
	    		ab = ab.dequeue();
	    	SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(df.format(new Date()));
		}
	
}
