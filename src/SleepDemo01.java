public class SleepDemo01
{
    //休眠，倒计时10个数，一秒内打印一个
    public static void main(String[] args) throws InterruptedException
    {
        int num=10;
        while(true){
            System.out.println(num--);
            Thread.sleep(1000); //暂停
            if(num<=0){
                break;
            }
        }
    }
}
