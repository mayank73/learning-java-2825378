import java.util.Scanner;

public class FortuneTeller {
    
    public static void main(String[] args) {
        System.out.print("Enter the fortune number between 1 and 10: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();

        if (number <= 5){
            System.out.println("Enjoy the good luck a friend brings to you.");
        }
        else {
            System.out.println("Your shoe selection will make you happy today.");
        }
        

        boolean removeSong = true;
        while (removeSong){
        System.out.println("Song is playing....");
        System.out.println("Do you want to change the song, If so enter yes.. ");
        String changeSong = inputNumber.next();
        if (changeSong.equals("yes")){
            removeSong = false;
        }
    }
    System.out.println("Running next song in a while..");
    inputNumber.close();
    }
}
