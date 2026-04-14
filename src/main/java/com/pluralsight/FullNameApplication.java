package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please, enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please, enter your middle name:");
        String middleName = scanner.nextLine();


        System.out.println("Please, enter your suffix if you have any :");
        String suffix = scanner.nextLine();

        String fullName = suffix + firstName + middleName + lastName ;

        








    }

}
