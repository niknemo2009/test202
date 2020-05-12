package Lesson2804;

public class ExampleThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getThreadGroup());
        MyThread thread=new MyThread("Potok 1",30);
        System.out.println(thread.getState()+" "+" 1111111");
        thread.start();
//        int i=0;
//        while(i<100){
//      Thread.sleep(50);
//            System.out.println(thread.getState()+"  9999999999");
//           i++;
//        }
       // System.out.println(thread.getState()+" "+" 33333333");
        MyRunnable myRunnable=new MyRunnable(20,"Runnable");
        myRunnable.thtread.start();

Thread thread33=new Thread(()->{
    for(int i=0;i<15;i++){
        System.out.println("Work thread "+Thread.currentThread().getName()+" "+i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

}},"Potok77");
thread33.start();

    };


}

class MyThread extends Thread{
    int counter;

    public MyThread(String name, int counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<15;i++){
            System.out.println("Work thread "+this.getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                System.out.println(this.getState()+" "+" 222222222222222");
    }
}


