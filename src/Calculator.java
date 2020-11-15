public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a*b;
    }

    public float divide(int a, int b) {

        float res = 0;
        try {
            res = a / b;

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            return res;

        }

    }



}
