package multithreading;

public class JoinExample implements Runnable{

    @Override
    public void run() {
        try{

            System.out.println(Thread.currentThread().getName() + "start");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+ "end");

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
