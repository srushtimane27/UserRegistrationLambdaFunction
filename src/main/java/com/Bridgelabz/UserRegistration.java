package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistration {
    ArrayList<String> emails = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Welcome to user registration");
        UserRegistration user = new UserRegistration();
        user.firstname();
        user.lastname();
        user.email();
        user.MobileNumber();
        user.password();
    }

    //UC1: First Name starts with Cap and has minimum 3 characters
    public boolean firstname(){
        System.out.println("Enter First Name: ");
        String name = sc.next();
        boolean valid = name.matches("^[A-Z][a-z]{2,}");
        System.out.println("First Name is: "+name +"\nvalid: " + valid);
        return valid;
    }

    //UC2: Last Name starts with Cap and has minimum 3 characters
    public boolean lastname(){
        System.out.println("Enter Last Name: ");
        String name = sc.next();
        boolean valid = name.matches("^[A-Z][a-z]{3,}");
        System.out.println("Last Name is: "+name +"\nvalid: " + valid);
        return valid;
    }
    //UC3: Email Id
    private boolean email() {
        System.out.println("Enter Email ID: ");
        String name = sc.next();
        boolean valid = name.matches("^(.+)@(.+)$");
        System.out.println("Email: "+name +"\nvalid: " +valid);
        return valid;
    }
    //UC4: Mobile number country code follow by space and 10 digit number
    public void MobileNumber(){
        System.out.println("Enter Mobile Number: ");
        String MobileNumber = sc.next();
        boolean valid = MobileNumber.matches("^[1-9][0-9][1-9]{10}$" );
        System.out.println("Mobile Number is: " +MobileNumber +"\nvalid: " + valid);
        System.out.println(valid);
    }
    //UC5: Password matching patterns with follwing all the rules. Minimum 8 characters
    //UC6: At least 1 upper case
    //UC7: At least 1 numeric number
    //UC8: Exactly one special character
    public void password(){
        System.out.println("Enter Password: ");
        String pass1 = sc.next();
        boolean valid = pass1.matches("^(?=.*[A-Z])[a-zA-Z0-9!@#$%^&*()_+=-{};'<>,./?~`]{8,}$" + "(?=\\S+$).{8,}$");
        System.out.println(valid);
    }
}

