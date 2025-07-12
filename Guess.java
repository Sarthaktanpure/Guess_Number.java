# Guess_Number.java
import java.util.Scanner;
public class Guess_using_loop {
    public static void main(String[] args) {
        // Mini project
        Scanner sc=new Scanner(System.in);
        int my_number=(int)(Math.random()*10);
        int user_number;
        do{
            System.out.println("Enter Your Guess :");
            user_number=sc.nextInt();
            if(user_number==my_number){
                System.out.println("WOOHOO....CORRECT GUESS....CONGRATULATION'S !!!");
                break;
            } else if (user_number>my_number) {
                System.out.println("Your Guess is too High.....");
            }else{
                System.out.println("Your Guess is too Low.....");
            }
        }while(user_number>=0);
        System.out.println("Your Guess Was :"+user_number);
        System.out.println("My Number is :"+my_number);
        System.out.println("Thank's For Playing This Game Hope You Have Enjoyed It...");
    }
}
