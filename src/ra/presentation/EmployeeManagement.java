package ra.presentation;

import ra.businessImp.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagement extends Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>(1000);

        do {
            System.out.println("********************MENU*********************\n" +
                    "1. Nhập thông tin cho n nhân viên\n" +
                    "2. Hiển thị thông tin nhân viên\n" +
                    "3. Tính lương cho các nhân viên\n" +
                    "4. Tìm kiếm nhân viên theo tên nhân viên\n" +
                    "5. Cập nhật thông tin nhân viên\n" +
                    "6. Xóa nhân viên theo mã nhân viên\n" +
                    "7. Sắp xếp nhân viên theo lương tăng dần\n" +
                    "8. Sắp xếp nhân viên theo tên nhân viên giảm dần\n" +
                    "9. Thoát");
            System.out.print("Mời chọn từ 1 đến 9: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Mời nhập số nhân viên cần điền: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Employee emp = new Employee();
                        emp.inputData(sc);
                    }break;
                case 2:
                    System.out.println("Hiện thị nhân viên");
                    for (Employee emp : employees){
                        emp.displayData();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hiện thị lương nhân viên");
                    for (Employee emp : employees){
                        emp.calSalary();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Mời nhập tên cần tìm: ");
                    String name = sc.next();
                    for (Employee emp : employees){
                        if (emp.getName().equals(name)){
                            emp.displayData();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập mã của nhân viên cần cập nhật: ");
                    int idFix = sc.nextInt();
                    for (Employee emp : employees){
                        if (idFix == emp.getId()){
                            System.out.println("Tên nhân viên: ");
                            emp.setName(sc.next());
                            System.out.println("Nhập Năm sinh nhân viên: ");
                            emp.setYear(sc.nextInt());
                            System.out.println("Nhập Hệ số lương nhân viên: ");
                            emp.setRate(sc.nextFloat());
                            System.out.println("Nhập Hoa hồng của nhân viên hàng tháng: ");
                            emp.setCommission(sc.nextFloat());
                            System.out.println("Trạng thái nhân viên: ");
                            emp.setStatus(sc.nextBoolean());
                            emp.displayData();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhập mã của nhân viên cần xóa: ");
                    int idDelete = sc.nextInt();
                    for (Employee emp : employees){
                        if (emp.getId() == idDelete){
                            employees.remove(emp);
                        }
                    }
                    System.out.println("Đã xóa nhân viên có mã nhân viên là " + idDelete);
                    break;
                case 7:
                    employees.sort(Comparator.comparing(Employee::calSalary));
                    for (Employee emp : employees){
                        emp.displayData();
                    }
                    break;
                case 8:
                    employees.sort((emp1, emp2) -> emp2.getName().compareTo(emp1.getName()));
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("Mời nhập lại");
            }
        }while (true);
    }
}
