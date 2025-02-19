package Ex3;

import java.util.Scanner;

class Student extends Person {

    String major;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter major: ");
        major = scanner.nextLine();
    }

    @Override
    public boolean editPerson() {
        super.editPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edit major: ");
        major = scanner.nextLine();
        return true;
    }
}
