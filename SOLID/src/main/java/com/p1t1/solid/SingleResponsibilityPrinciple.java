package com.p1t1.SOLID;

import java.util.List;

//Step 1 : Class Object

interface IEmployeeStore {
    public Employee findEmployeeById(int id, List<Employee> list);

    public void addEmployee(Employee employee, List<Employee> list);
}

//Step 2 : Interface method :

interface IEmployeeEmailSender {
    public void sendEmail(Employee employee, ImlEmailContent content);
}

interface IEmailContent {

}

class Employee {

    public int id;
    public String name, email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

//Step 3 : Implement all interface method :
class ImlEmployeeStore implements IEmployeeStore {

    @Override
    public Employee findEmployeeById(int id, List<Employee> list) {
        for (Employee empl : list) {
            if (empl.getId() == id) {
                return empl;
            }
        }
        return null;
    }

    @Override
    public void addEmployee(Employee employee, List<Employee> list) {
        list.add(employee);
    }
}

class ImlEmailContent implements IEmailContent {
    private String type;
    private String content;

    public ImlEmailContent(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class ImlEmployeeEmailSender implements IEmployeeEmailSender {

    @Override
    public void sendEmail(Employee employee, ImlEmailContent content) {
        System.out.println("G???i ?????n :" + employee.getName());
        System.out.println("Lo???i th?? c???a b???n l?? :" + content.getType());
        System.out.println("N???i dung c???a b???n :" + content.getContent());
        System.out.println("Th?? ??ang g???i....");
        System.out.println("Ho??n th??nh...");
    }
}

public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        // write your code here :
        ImlEmailContent content = new ImlEmailContent("HTML", "B???n kh???e kh??ng ?");
        Employee employee = new Employee(1, "ttc", "19110017@student.hcmute.edu.vn");
        ImlEmployeeEmailSender sender = new ImlEmployeeEmailSender();
        sender.sendEmail(employee, content);
    }

}
