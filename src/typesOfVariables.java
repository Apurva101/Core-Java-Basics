public class  typesOfVariables {

    //instance variable;
    int a = 10;
    int defaultVal;

    //static variable;
    static int  b = 20;
    static int bDefault;

    public static void main( String args[])
    {
        //local variable

        int local = 20;

        typesOfVariables obj = new typesOfVariables();

        System.out.println(local);
        System.out.println(b);
        System.out.println(obj.a);
        System.out.println(obj.defaultVal);
        System.out.println(bDefault);


    }

}