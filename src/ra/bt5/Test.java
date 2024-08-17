package ra.bt5;

public class Test {
    public static void main(String[] args) {
        PartTimeEmployee past = new PartTimeEmployee("vinh1", 50, 4);
        FullTimeEmployee full = new FullTimeEmployee("vinh2", 50);


        System.out.println("luong pasttime " + past.caculaterSalary());
        System.out.println("luong fulltime " + full.caculaterSalary());
    }
}
