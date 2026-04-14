package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompting the user for their credentials first name, last name, middle name asd suffix
        System.out.println("Please, enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please, enter your middle name:");
        String middleName = scanner.nextLine();

        System.out.println("Please, enter your last name:");
        String lastName = scanner.nextLine();


        System.out.println("Please, enter your suffix if you have any :");
        String suffix = scanner.nextLine();

        //Limiting the full name to be printed as firstname only so that I can be able to make connections
        String fullName = firstName;


        //Using if/else statements to figure out the user's name credentials
        if (!middleName.isEmpty()){
            fullName += " " + middleName;
        }


        //Making sure fullname is always printed as fullname + lastname
        fullName += " " + lastName;

        if (!suffix.isEmpty()){

            fullName += ", " + suffix;



        }

        //FInally, printing the full name
        System.out.println("Full Name: " + fullName);

        scanner.close();



    }

}
