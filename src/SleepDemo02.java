import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemo02
{
    //倒计时
    public static void main(String[] args)  throws InterruptedException
    {
        Date endTime=new Date(System.currentTimeMillis()+10*1000);
        long end=endTime.getTime();
        while(true){
            //输出
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            //构建下一秒的时间
            endTime=new Date(endTime.getTime()-1000);
            //等待一秒
            Thread.sleep(1000);
            if(end-10000>endTime.getTime()){
                break;
            }
        }
    }
}
