import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    /*Scanner user = new Scanner(System.in);

    System.out.print("Enter your full name: ");
    String userName = user.nextLine();
    System.out.print("Enter a number: ");
    int userNumber = user.nextInt();

    System.out.println(userNumber);

    System.out.println("Hi " + userName);

    System.out.println(userName.length());
    System.out.println(userName.substring(1,6));
    System.out.println(userName.indexOf(' '));

    System.out.println(userName.substring(0, userName.indexOf(' ')));*/

    String firstName = "Aileen";
    String lastName = "Zhu";    
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    int number = 5;
    String value = Integer.toString(number);
    System.out.println(value);

    String dog = "Dog";
    String cat = "Dog";
    System.out.println(dog.equals(cat));

    String name1 = "Miles";
    String name2 = "Ryan";
    System.out.println(name1.compareTo(name2));

    String dinasaur =  "Triceratops";
    String half = dinasaur.substring(5);
    System.out.println(half);

    String part = dinasaur.substring(2, 6);
    System.out.println(part);

  }
}