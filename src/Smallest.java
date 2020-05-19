import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){

        int num1, num2, num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        num1= sc.nextInt();

        System.out.println("Enter second number:");
        num2= sc.nextInt();

        System.out.println("Enter third number:");
        num3= sc.nextInt();

        comparison(num1,num2,num3);
    }
    static void comparison(int num1, int num2, int num3){

        int temp= num1 < num2 ? num1:num2 ;
        int result= temp < num3 ? temp:num3;
        System.out.println("The smallest number is:" +result);
    }
}



