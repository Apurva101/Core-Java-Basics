package multithreading.threadCommunication;

public class Book {

    public String name;
    public boolean isComplete;

    public Book(String name)
    {
        super();
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setComplete(boolean isComplete)
    {
        this.isComplete = isComplete;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean getComplete()
    {
        return this.isComplete;
    }
}
