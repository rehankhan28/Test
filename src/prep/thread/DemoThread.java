package prep.thread;

public class DemoThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread1 t2=new MyThread1();
        t1.start();
        t2.start();
    }
}
class  MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            Thread thread=Thread.currentThread();
            System.out.println(i+"\t\t"+thread.getName()+"\t\t"+thread.getPriority());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}