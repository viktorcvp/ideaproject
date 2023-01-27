package Victor;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        try (Scanner scn = new Scanner(System.in)) {
            String name = scn.nextLine();
            System.out.println("Hello " + name + "!");
        }
    }
}
