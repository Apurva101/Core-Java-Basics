package multithreading;

public class OddEvenMain {

    boolean odd;
    int count = 1;
    int MAX = 20;

    public void printOdd()
    {
        synchronized (this)
        {
            while(count < MAX)
            {
                System.out.println("Checking odd loop");

                while(!odd)
                {
                        try{
                            System.out.println("Odd waiting: " + count);
                            wait();
                            System.out.println("Notified odd:" + count );
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                }
                System.out.println("Odd thread: " + count);
                count++;
                odd = false;
                notify();

                }
            }
        }


    }


