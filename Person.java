package Ex3;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Person {
  String id;
  String homeTown;
  Date dateOfBirth;
  
  public void displayInfo(){
    System.out.println("ID: "+id);
    System.out.println("Home town: "+homeTown);
    System.out.println("Date of birth: "+sdf.format("Date of Birth"));
    }
  
  public void addPerson(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter ID: ");
    id = scanner.nextLine();
    System.out.print("Enter home town: ");
    homeTown = scanner.nextLine();
    System.out.print("Enter date of birth(dd/MM/yyyy): ");
    String dateOfBirthString = Scanner.nextLine();
    try{
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      dateOfBirth = sdf.parse(dateOfBirthString);
    }catch(ParseException e){
      System.out.println("Invalid");
    }
  }
  
  public boolean editPerson(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Edit home town: ");
    homeTown = scanner.nextLine();
    System.out.print("Edit date of birth(dd/MM/yyyy): ");
    String dateOfBirthString = Scanner.nextLine();
    try{
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      dateOfBirth = sdf.parse(dateOfBirthString);
    }catch(ParseException e){
      System.out.println("Invalid");
    }
    return true;
  }
}
