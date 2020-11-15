package multithreading;

public class MyThreadMain {

    public static void main (String args[])
    {
        System.out.println("Main thread is running");
        MyThread1 obj = new MyThread1();
        obj.start();

        MyThread2 obj2 = new MyThread2();
        Thread t = new Thread(obj2);
        t.run();


    }
}
