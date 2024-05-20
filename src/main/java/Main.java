

import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      s.addStudent(new Student("Krzysztolf", 20));
      s.addStudent(new Student("Janusz", 40));
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.toString());
      }
      Scanner input = new Scanner(System.in);
      System.out.print("Podaj imie studenta ");
      String name = input.nextLine();
      System.out.print("Podaj wiek studenta: ");
      int age = input.nextInt();

      s.addStudent(new Student(name, age));
      input.close();
      System.out.println("\nUpdated student list:");
      var updatedStudents = s.getStudents();
      for(Student student : updatedStudents) {
        System.out.println(student.toString());
      }

    } catch (IOException e) {
 
    }
  }
}