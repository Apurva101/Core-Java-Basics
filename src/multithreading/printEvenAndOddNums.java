package multithreading;
class printEven implements  Runnable{

    @Override
    public void run() {
        for(int i = 1; i < 20; ++i)
        {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}

class printOdd implements  Runnable{

    @Override
    public void run() {
        for(int i = 1; i < 20; ++ i)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
public class printEvenAndOddNums {

    public static void main(String args[])
    {
        printEven t1 = new printEven();
        Thread thread1 = new Thread(t1);

        printOdd t2 = new printOdd();
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }

}
