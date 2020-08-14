import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        whatSeason();
        whatPrise();
        fingerNumber();
        whichDay();
    }

    //Написать метод который принимает в себя текст сезон (“summer”, “winter”...) - переменную типа String,
    // и если сезон - winter выводит в консоль “It is cold”.
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

//Написать метод который принимает в себя цену - переменную типа int,
// и если цена меньше 1000 (prise < 1000), то выводит в консоль “цена нормальная”,
//если больше или равно 1000 (prise >= 1000), то выводит в консоль “цена завышена”
    static void whatPrise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Какая цена?");
        int prise = s.nextInt();
        if (prise<1000) System.out.println("Цена нормальная\n");
        else if (prise>=1000) System.out.println("Цена завышена\n"); }


//Написать метод, используя switch, который принимает в себя номер пальца -
// переменную типа int и в зависимости от номер выводит название пальца (1-”большой” и т д)
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
        }   System.out.println();       }

        //Написать метод который принимает на вход String - день недели, и если это будний день, то выводит “будний”,
        // если выходной - “выходной” (используя иф-елс и логические выражения)
    static void whichDay() {
        Scanner s = new Scanner(System.in);
        System.out.println("Выбери какой день: Пн, Вт, Ср, Чт, Пт, Сб, Вс?");
        String today = s.nextLine();
        if (today.contains("Сб") || today.contains("Вс")){
        System.out.println("Выходной!");        }
        else if (today.contains("Пн") || today.contains("Вт") || today.contains("Ср") || today.contains("Чт") || today.contains("Пт"))System.out.println("Будний=(");
        else System.out.println("Ты неправильно ввел день недели");}
        }


