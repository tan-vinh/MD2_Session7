package ra.bt5;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentHour) {
        super(name, paymentHour);
    }

    @Override
    public int caculaterSalary() {
        return 8 * super.getPaymentHour();
    }
}
