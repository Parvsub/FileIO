package com.employeeserviceproblem;

import java.io.*;

public class CreateEmployeeDetailsinFiles implements Serializable {

    int id;
    String name;
    double salary;
    public CreateEmployeeDetailsinFiles(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CreateEmployeeDetails{" + "id=" + id + ", name='" + name + '\'' +
                ", salary=" + salary + '}';
    }
}
class  EmployeeStore{
    public static void main(String[] args) throws IOException {
        File file = new File("Praveen.txt");
        CreateEmployeeDetailsinFiles employeeDetails = new CreateEmployeeDetailsinFiles(23415,"Praveen",45000);
        System.out.println(employeeDetails);
        ObjectOutputStream ObjStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjStream.writeObject(employeeDetails);
        ObjStream.close();
    }
}

