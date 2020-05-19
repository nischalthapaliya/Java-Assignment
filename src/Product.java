
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        domultiply(num1, num2);
    }
    static void domultiply(int num1, int num2){
        int product=num1*num2;
        System.out.println("The product is:" +product);
    }
}

