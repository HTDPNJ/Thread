public class YieldDemo01 extends  Thread
{
    public static void main(String[] args)
    {
        YieldDemo01 demo=new YieldDemo01();
        Thread t=new Thread(demo); //新生
        t.start(); //就绪

        for(int i=0;i<1000;i++){
            if(i%20==0){
                //暂停本线程main
                Thread.yield(); //yield暂停自己的线程，为静态方法
            }
            System.out.println("main..."+i);
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<1000;i++){
            System.out.println("yield..."+i);
        }
    }
}
