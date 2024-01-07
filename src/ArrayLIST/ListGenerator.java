package ArrayLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGenerator {
    public static void main(String[] args) {
        System.out.println(listGenerator());

    }

    public static ArrayList<Integer> listGenerator() {
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            list.add(scanner.nextInt());
            System.out.println("Do you want to add extra number");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                break;
            }

        }
        return  list;
    }
}
