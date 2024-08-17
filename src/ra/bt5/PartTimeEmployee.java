package ra.bt5;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int paymentHour, int workingHours) {
        super(name, paymentHour);
        this.workingHours = workingHours;
    }

    @Override
    public int caculaterSalary() {
        return this.workingHours * super.getPaymentHour();
    }
}
