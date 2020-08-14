import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        whatSeason();
        whatPrise();
        fingerNumber();
    }
    static void whatSeason(){
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
                }   System.out.println();       }

    static void whatPrise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Какая цена?");
        int prise = s.nextInt();
        if (prise<1000) System.out.println("Цена нормальная\n");
        else if (prise>=1000) System.out.println("Цена завышена\n"); }

    static void fingerNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Какой палец?");
        int finger = s.nextInt();
        switch (finger) {
            case 1:
                System.out.println("Большой");
                break;
            case 2:
                System.out.println("Указательный");
                break;
            case 3:
                System.out.println("Средний");
                break;
            case 4:
                System.out.println("Безымянный");
                break;
            case 5:
                System.out.println("Мизинец");
                break;
            default:
                System.out.println("Ты - мутант!");
                break;
        }}






        }


