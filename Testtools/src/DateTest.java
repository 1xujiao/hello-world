import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/**
 * Description: 日期测试类
 */
public class DateTest {
    /**
     * 充值卡优惠劵推送接口(剩余有效天数=总有效天数的0.1开始推送提醒)
     * 计算两个个日期之间相差的天数
     */
    @Test
    public void testBetweenDays2(){

       //dateStr1:创建时间    
       String dateStr1 = "2020-07-09 17:20:35";
       //dateStr2：失效时间      
       String dateStr2 = "2020-08-08 17:20:26";
       
        //获取日期
        Date date1 = MyDateUtil.parseDate(dateStr1, "yyyy-MM-dd HH:mm:ss");
        Date date2 = MyDateUtil.parseDate(dateStr2, "yyyy-MM-dd HH:mm:ss");

        //获取当前时间
        SimpleDateFormat dateStr= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String   dateStr3=dateStr.format(new Date());
        System.out.println("当前系统时间为："+dateStr3);// new Date()为获取当前系统时间 
        Date date3 = MyDateUtil.parseDate(dateStr3, "yyyy-MM-dd HH:mm:ss");
      
        
         
        long ALLbetweenDays = ((date2.getTime() - date1.getTime()) / (1000L*3600L*24L))+1;
        System.out.println("全部有效剩余天数:"+ ALLbetweenDays);
        long RemainbetweenDays = ((date2.getTime() - date3.getTime())) / (1000L*3600L*24L)+1;
        System.out.println("剩余有效剩余天数:"+RemainbetweenDays);
    }

}