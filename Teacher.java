package Ex3;

import java.util.Scanner;

public class Teacher extends Person {

    String department;

    @Override
    public void displayInfo() {
        super.displayInfo();
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department: ");
        department = scanner.nextLine();
    }

    @Override
    public boolean editPerson() {
        super.editPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edit department: ");
        department = scanner.nextLine();
        return true;
    }
}
