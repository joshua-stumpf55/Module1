//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter your name  ");
        String name = myscanner.nextLine();
        System.out.println("My name is " + name);

        int age = myscanner.nextInt();
        System.out.println("My age is " + age);



    }
}