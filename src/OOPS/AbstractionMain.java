package OOPS;

interface Sports {

    public void play();

}

class Cricket implements Sports {

    @Override
    public void play()
    {
        System.out.println("We are playing cricket");
    }
}

class Football implements Sports {

    @Override
    public void play()
    {
        System.out.println("We are playing football");
    }

}

public class AbstractionMain {

    public static void main(String args[])
    {
        Sports s1 = new Cricket();
        s1.play();
        s1 = new Football();
        s1.play();
    }

}
