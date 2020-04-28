package Lesson2804;

public class MyRunnable implements Runnable {
    int counter;
    Thread thtread;

    public MyRunnable(int counter, String name) {

        this.counter = counter;
        thtread=new Thread(this, name);
    }

    @Override
    public void run() {
        for(int i=0;i<counter;i++){
            System.out.println("Work thread "+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getState()+" "+" 12121212121212");
    }
}
