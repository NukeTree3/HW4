package com.nuketree3.example;

import java.util.ArrayList;

public class EmployeeRepo {

    private ArrayList<Employee> employees;

    public EmployeeRepo() {
        employees = new ArrayList<Employee>();
    }

    public Employee getEmployeeByExp(int experience) {
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                return employee;
            }
        }
        return null;
    }

    public long getPhoneNumberByEmployeeName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee.getPhoneNumber();
            }
        }
        return -1;
    }

    public Employee getEmployeeById(long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
