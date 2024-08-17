package ra.bt5;

public abstract class Employee implements IEmployee{
    private String name;
    private int paymentHour;

    public Employee() {
    }

    public Employee(String name, int paymentHour) {
        this.name = name;
        this.paymentHour = paymentHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentHour() {
        return paymentHour;
    }

    public void setPaymentHour(int paymentHour) {
        this.paymentHour = paymentHour;
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    public abstract int caculaterSalary();
}
