import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(true) {
        Scanner s = new Scanner(System.in);
        System.out.println("What season is it: Winter, Spring, Summer or Autumn?");
        String season = s.nextLine();
        switch (season) {
            case "Winter":
                System.out.println("It is cold");
                break;
            case "Summer":
                System.out.println("It is hot");
                break;
            case "Spring":
                System.out.println("It is rainy");
                break;
            case "Autumn":
                System.out.println("It is windy");
                break;
            default:
                System.out.println("This season does not exist =( Please choose one of the following options!");
                break;
        }   System.out.println();
    }}
}
