import java.util.Scanner;

/**
 * ***JAVA 时间戳转秒、分、小时、天
 * 作用:redis锁失效时间为时间戳，将时间戳转成成s,分钟，小时，天数，查看redis锁多久后失效
 */
public class TimeMilli {
	
	public static void  main(String[] args){
		//将ms时间戳转换成秒，分，小时，天
/*		System.out.print("输入时间戳,单位为ms:");
		Scanner scan = new Scanner(System.in);
		float readms = scan.nextFloat();
		System.out.println("输入数据："+readms); 
		timeMs(readms);*/
   
		//将s时间戳转换成秒，分，小时，天
		System.out.print("输入时间戳,单位为s:");
		Scanner scan1 = new Scanner(System.in);
		float reads = scan1.nextFloat();
		System.out.println("输入数据："+reads); 
		timeS(reads);
	}
	//将ms时间戳转换成秒，分，小时，天
	public static  void  timeMs(float  read){
		//2、时间戳（转秒）
		System.out.println(read/1000+"s");
		//3、时间戳（转分钟）
		System.out.println(read/1000/60+"minutes");
		//4、时间戳（转小时）
		System.out.println(read/1000/(60 * 60)+"hours");
		//5、时间戳（转天）
		System.out.println(read/1000/(60 * 60 * 24)+"days");
		
	}
	//将s时间戳转换成秒，分，小时，天
	public  static void  timeS(float  a){
		//2、时间戳（转秒）
		System.out.println(a+"s");
		//3、时间戳（转分钟）
		System.out.println(a/60+"minutes");
		//4、时间戳（转小时）
		System.out.println(a/(60 * 60)+"hours");
		//5、时间戳（转天）
		System.out.println(a/(60 * 60 * 24)+"days");
		
	}


	
}
