package ra.businessImp;

import ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private int id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    public Employee() {}

    public Employee(int id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập ID nhân viên: ");
        setId(scanner.nextInt());
        System.out.println("Nhập Tên nhân viên: ");
        setName(scanner.next());
        System.out.println("Nhập Năm sinh nhân viên: ");
        setYear(scanner.nextInt());
        System.out.println("Nhập Hệ số lương nhân viên: ");
        setRate(scanner.nextFloat());
        System.out.println("Nhập Hoa hồng của nhân viên hàng tháng: ");
        setCommission(scanner.nextFloat());
        System.out.println("Trạng thái nhân viên: ");
        setStatus(scanner.nextBoolean());
    }

    @Override
    public void displayData() {
        System.out.println("ID nhân viên: " + getId());
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Năm sinh nhân viên: " + getYear());
        System.out.println("Hệ số lương nhân viên: " + getRate());
        System.out.println("Hoa hồng của nhân viên hàng tháng: " + getCommission());
        System.out.println("Lương nhân viên hàng tháng: " + this.calSalary());
        System.out.println("Trạng thái nhân viên: " + (isStatus() ? "Đang làm việc" : "Nghỉ việc"));
    }

    public float calSalary(){
        return salary = (float) (this.getRate() * BASIC_SALARY + this.getCommission());
    }
}
