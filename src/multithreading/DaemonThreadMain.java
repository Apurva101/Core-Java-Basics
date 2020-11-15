package multithreading;
class DaemonExample implements Runnable{

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Current thread " + Thread.currentThread().getName() + " is Daemon thread");
        }
        else
        {
            System.out.println("Current thread " + Thread.currentThread().getName() + " is User thread");
        }
    }
}
public class DaemonThreadMain {

    public static void main(String args[])
    {
        DaemonExample thread = new DaemonExample();
        Thread t1 = new Thread(thread, "Thread1");
        Thread t2 = new Thread(thread, "Thread2");
        Thread t3 = new Thread(thread, "Thread3");

        t2.setDaemon(true);
        t1.start();
        t2.start();

      //  t2.setDaemon(true);
        t3.start();

    }
}
