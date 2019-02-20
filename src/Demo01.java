public class Demo01
{
    //修改测试
    public static void main(String[] args)
    {
        Study s=new Study();
        new Thread(s).start();
        for(int i=0;i<100;i++){
            if(50==i) {
                s.stop();
            }
            System.out.println("main......"+i);
        }
    }
}
//
class Study implements Runnable{
    //1、线程类中定义线程体使用的标识
    private  boolean flag=true;

    @Override
    public void run()
    {
        //2、线程体中使用该标识
        while(flag){
            System.out.println("study thread...");
        }
    }
    //3、对外提供方法改变标志
    public void stop(){
        this.flag=false;
    }

}
