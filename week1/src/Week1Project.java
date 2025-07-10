import java.time.Year;
import java.util.Scanner;

public class Week1Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Whats your age?");
        Integer age = scanner.nextInt();
        int year = Year.now().getValue();
        Integer birthYear = year-age;

        System.out.println("Hi " + name + ", your age is: " + age + ", this means your birth year was: " + birthYear);
    }
}
