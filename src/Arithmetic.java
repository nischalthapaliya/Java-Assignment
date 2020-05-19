public class Arithmetic {
    public static void main(String[] args) {
        try{
            int dividend =10;
            int divisor =0;
            int result = dividend/divisor;
            System.out.println("Result:"+result);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero: Divisor cannot be zero");
        }
    }
}
