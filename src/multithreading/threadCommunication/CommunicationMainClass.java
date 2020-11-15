package multithreading.threadCommunication;

public class CommunicationMainClass {

    public static void main(String args[])
    {
        Book book = new Book("The Alchemist");
        BookReader Apurva = new BookReader(book);
        BookReader Abc = new BookReader(book);

        Thread apurva = new Thread(Apurva, "Apurva");
        Thread abc = new Thread(Abc, "Abc");

        apurva.start();
        abc.start();

        try{
            Thread.sleep(3000);

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        BookWriter bookWriter = new BookWriter(book);
        Thread bookWriterThread = new Thread(bookWriter);
        bookWriterThread.start();

    }
}
