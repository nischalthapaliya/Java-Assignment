import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args){

        int principal, rate, year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principal:");
        principal=sc.nextInt();

        System.out.println("Enter rate:");
        rate=sc.nextInt();

        System.out.println("Enter year:");
        year=sc.nextInt();

        doaccounting(principal, rate,  year);
    }
    static void doaccounting(int principal,int rate,int interest) {
        int si = (principal * rate * interest) / 100;
        System.out.println("The simple interest is:" + si);
    }
}


