import java.util.Scanner;

public class tasc{
    public static void main(String[] args){
        System.out.println("-----");
        System.out.println("Hello! Welcome to 'tas-c' task manager");

        System.out.println("1. Add task");
        System.out.println("2. View tasks");

        System.out.print("Pick an option (1, 2):- ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        System.out.println("Your pick: " + inp);
        sc.close();


        System.out.println("-----");
    }
}