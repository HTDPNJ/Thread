public class InfoDemo01
{
    /*
    * */
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t1=new MyThread();
        Thread proxy=new Thread(t1,"it");
        proxy.setName("test"); //设置名字
        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getName()); //打印的是main线程
        proxy.start();

        System.out.println("启动后的状态"+proxy.isAlive());
        Thread.sleep(200);
        t1.stop();
        Thread.sleep(100);
        System.out.println("停止后的状态"+proxy.isAlive());


    }
}
