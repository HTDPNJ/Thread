public class InfoDemo02
{
    /*分配优先级*/
    public static void main(String[] args) throws InterruptedException
    {
        MyThread it=new MyThread();
        Thread p1=new Thread(it,"it1");
        MyThread it2=new MyThread();
        Thread p2=new Thread(it2,"it2");

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();

        Thread.sleep(1000);
        it.stop();
        it2.stop();
    }
}
