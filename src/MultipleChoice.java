import java.util.Scanner;

public class MultipleChoice {
    
    public static void main(String[] args) {
        String question = "Who is the Indian Captain of 2011 world cup?";
    String choice1 = "SACHIN";
    String choice2 = "GAMBHIR";
    String choice3 = "DHONI";
    String choice4 = "YUVRAJ";

    String correctAnswer = choice3;
    System.out.println(question);
    System.out.println(choice1 + "\n" + choice2 + "\n" + choice3 + "\n" +choice4);

    Scanner answer = new Scanner(System.in);
    String enteredAnswer = answer.next();

    if (correctAnswer.equals(enteredAnswer.toUpperCase())){
        System.out.println("Congratulations you have entered the correct answer.");
    }
    else{
        System.out.println("The answer you have entered is incorrect, Correct answer is : " + correctAnswer);
    }
    answer.close();
    }
}
