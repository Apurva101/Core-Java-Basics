package multithreading.threadCommunication;

public class BookWriter implements Runnable{

    Book book;

    public BookWriter(Book book)
    {
        this.book = book;
    }

    @Override
    public void run() {
        synchronized (book)
        {
            System.out.println("Write operation is going on in book" + " "+ book.getName());

            try{

                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            book.setComplete(true);
            System.out.println("Writing operation is completed now");

            book.notifyAll();

            System.out.println("Notify one reader");

        }
    }
}
