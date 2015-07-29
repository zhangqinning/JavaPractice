import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			readFileToString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String readFileToString() throws IOException{
		File dirs=new File(".");
		String filePath=dirs.getCanonicalPath()+File.separator+"src"+File.separator+"TestRead.java";

		StringBuilder fileData=new StringBuilder(1000);
		BufferedReader reader=new BufferedReader(new FileReader(filePath));
		
		char[] buf=new char[1024];
		int numRead=0;
		while((numRead=reader.read(buf))!=-1){
			String readDate=String.valueOf(buf,0,numRead);
			fileData.append(readDate);
			buf=new char[1024];
		}
		reader.close();
		String returnStr=fileData.toString();
		System.out.println(returnStr);
		return returnStr;
	}
}
