package functionsOfThis;

public class callOverloadedConstructor {

    String name;
    int age;

    public callOverloadedConstructor()
    {
        System.out.println("You are in first Constructor");
    }

    public callOverloadedConstructor(String name, int age)
    {
       this();
       // this.name = name;
        //this.age = age;

        System.out.println("You are in second constructor");

       // this();
    }


    public static void main(String args[])
    {

        callOverloadedConstructor firstObj = new callOverloadedConstructor();
        callOverloadedConstructor secondObj = new callOverloadedConstructor("Apurva", 23);

    }

}
