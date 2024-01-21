import Data.Person;
import Data.Student;
import Data.Employee;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String Name;
        String Surname;
        String Position;
        double GPA;
        double Salary;

        boolean exit = false;
        System.out.println("1. Add student. ");
        System.out.println("2. Add employee. ");
        System.out.println("3. Print data");
        System.out.println("0. End the program. ");
        while (!exit) {


            String answer = scanner.nextLine();

            switch (answer) {
                case "1":
                    System.out.print("Enter name: ");
                    Name = scanner.nextLine();

                    System.out.print("Enter surname: ");
                    Surname = scanner.nextLine();

                    System.out.print("Enter gpa: ");
                    GPA = scanner.nextDouble();
                    people.add(new Student(GPA, Name, Surname));
                    System.out.println();
                    break;


                case "2":
                    System.out.print("Enter name: ");
                    Name = scanner.nextLine();

                    System.out.print("Enter surname: ");
                    Surname = scanner.nextLine();

                    System.out.print("Enter position: ");
                    Position = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    Salary = scanner.nextDouble();

                    people.add(new Employee(Name, Surname, Position, Salary));
                    System.out.println();
                    break;

                case "3":
                    Collections.sort(people);
                    printData(people);
                    System.out.println();
                    break;

                case "End the program":
                    exit = true;
                    break;
            }
        }
    }
}
