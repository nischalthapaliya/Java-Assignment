public class Person {
    String name;

    Person(String N) {
        name=N;
    }
}
class Politician extends Person{
    float Salary;
    public Politician(String N,float S) {
        super(N);
        Salary=S;
    }
}
class Sportsman extends Person{
    float Salary;
    public Sportsman(String N,float S){
        super(N);
        Salary=S;
    }
}
class Main {
    public static void main(String[] args) {

        Politician politician= new Politician("Arthur",20000);
        System.out.println("Name:"+politician.name);
        System.out.println("Total Salary: "+politician.Salary);

        Sportsman sportsman = new Sportsman("Gunn",10000);
        System.out.println("Name:"+sportsman.name);
        System.out.println("Total Salary: "+sportsman.Salary);

    }
}

