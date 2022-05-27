import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;
        String studentFirstName = "Maaddy";
        String studentLastName = "Upton";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        String space = " ";
        System.out.println(studentFirstName + " " +
                studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + space + studentLastName + space + "has the updated GPA: "+studentGPA);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println("Student name is: "+ studentFirstName + " " + studentLastName);
        input.close();
    }
}
