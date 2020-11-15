package multithreading;

public class JoinExampleMain {

    public static void main(String args[])
    {

        System.out.println("Main thread execution started");

        JoinExample obj = new JoinExample();
        Thread t1 = new Thread(obj, "Thread1");
        Thread t2 = new Thread(obj, "Thread2");
        Thread t3 = new Thread(obj, "Thread3");

        t1.start();

        try{
            t1.join();
        }
        catch(InterruptedException e){
             e.printStackTrace();
         }

        t2.start();

        try{
            t2.join(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        t3.start();

        try{
            t2.join();
            t3.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Main Thread execution ends");

    }

}
