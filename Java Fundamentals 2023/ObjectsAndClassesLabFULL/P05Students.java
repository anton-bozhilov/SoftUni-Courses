package ObjectsAndClassesLabFULL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;


        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] personData = command.split(" ");
            Student current = new Student(personData[0], personData[1], personData[2], personData[3]);
            studentList.add(current);

            command = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student student : studentList) {
            if (town.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }
}
