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
class  EmployeeStore {
    public void EmployeeFile() throws IOException {
        File file = new File("Praveen.txt");
        CreateEmployeeDetailsinFiles employeeDetails = new CreateEmployeeDetailsinFiles(23415, "Praveen", 45000);
        System.out.println(employeeDetails);
        ObjectOutputStream ObjStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjStream.writeObject(employeeDetails);
        ObjStream.close();
    }
    public void Char(){
        String FILE_PATH = "Praveen.txt";
        File fileUtil = new File(FILE_PATH);
        System.out.println("No. of characters in file: " + fileUtil.length());
    }
    public static void main(String[] args) throws IOException{
        EmployeeStore employeeStore = new EmployeeStore();
        employeeStore.EmployeeFile();
        employeeStore.Char();
    }
}


