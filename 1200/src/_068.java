import java.util.Scanner;


public class _068 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入请求");
		Scanner sca=new Scanner(System.in);
		String request=sca.nextLine();
		if(request.startsWith("http"))
			System.out.println("输入的是网址");
		else if(request.startsWith("ftp"))
		System.out.println("输入的是ftp服务器");
		else 
			System.out.println("输入错误");
	}

}









