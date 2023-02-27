import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Which of the solar system, want to know the features?
                    1-Mars
                    2-Earth
                    3-Saturn
                    4-Jupiter
                    5-Uranus
                    6-Neptune
                    7-Venus
                    8-Mercury
                    """);

            System.out.println("Chose your function");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println(SolarSystem.Mars);
                    break;
                case 2:
                    System.out.println(SolarSystem.Earth);
                    break;
                case 3:
                    System.out.println(SolarSystem.Saturn);
                    break;
                case 4:
                    System.out.println(SolarSystem.Jupiter);
                    break;
                case 5:
                    System.out.println(SolarSystem.Uranus);
                    break;
                case 6:
                    System.out.println(SolarSystem.Neptune);
                    break;
                case 7:
                    System.out.println(SolarSystem.Venus);
                    break;
                case 8:
                    System.out.println(SolarSystem.Mercury);
                    break;
                default:
                    System.out.println("your chose false function");
            }

        }
    }
}