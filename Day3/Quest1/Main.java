package Day3.Quest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            String city = scanner.nextLine();
            System.out.println(city);
            switch (city) {
                case "Stop":
                    flag = false;
                    break;

                case "Moscow":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;

                case "Ливерпуль","Манчестер","London":
                    System.out.println("Англия");
                    break;
                
                case "Berlin","Мюнхен","Кёльн":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
        scanner.close();
    }
    
}
