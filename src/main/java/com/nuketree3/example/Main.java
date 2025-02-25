package com.nuketree3.example;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,1,"1",1);
        Employee emp2 = new Employee(2,2,"2",2);
        Employee emp3 = new Employee(3,3,"3",3);
        Employee emp4 = new Employee(4,4,"4",4);
        Employee emp5 = new Employee(5,5,"5",5);

        EmployeeRepo repo = new EmployeeRepo();

        repo.addEmployee(emp1);
        repo.addEmployee(emp2);
        repo.addEmployee(emp3);
        repo.addEmployee(emp4);
        repo.addEmployee(emp5);

        System.out.println(repo.getEmployeeByExp(3).getName());
        System.out.println(repo.getEmployeeById(1).getName());
        System.out.println(repo.getEmployeeById(22));
        System.out.println(repo.getPhoneNumberByEmployeeName("4"));

    }
}