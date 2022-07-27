package com.Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserRegistration {
        ArrayList<String> emails = new ArrayList<String>();
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Welcome in user registration program");
            UserRegistration user = new UserRegistration();
            user.firstname();
            user.lastname();
            user.email();
            user.MobileNumber();
            user.password();
        }
        public boolean firstname(){
            System.out.println("Enter First Name: ");
            String name = sc.next();
            boolean valid = name.matches("^[A-Z][a-z]{2,}");
            System.out.println("First Name is: "+name +"\nvalid: " + valid);
            return valid;
        }
        public boolean lastname(){
            System.out.println("Enter Last Name: ");
            String name = sc.next();
            boolean valid = name.matches("^[A-Z][a-z]{3,}");
            System.out.println("Last Name is: "+name +"\nvalid: " + valid);
            return valid;
        }
        public boolean email(){
            System.out.println("\nEmail validation samples");

            emails.add("abc@abc.com");
            emails.add("abc-100@abc.co.in");
            emails.add("abc111@abc.com");
            emails.add("abc.yz@abc.com.com");
            emails.add("abc#@abc.co.in");
            emails.add("abc@abc.com.com");

            String regex = "^(.+)@(.+)$";

            Pattern pattern = Pattern.compile(regex);

            for (String email : emails){
                Matcher matcher = pattern.matcher(email);
                System.out.println(email + " : " + matcher.matches());
            }
            return regex != null;
        }
        /**
         * Mobile Number Pattern
         * Match Number Format With Country Code
         */
        public void MobileNumber(){
            System.out.println("Enter Mobile Number: ");
            String MobileNumber = sc.next();
            boolean valid = MobileNumber.matches("^[1-9][0-9][1-9]{10}$" );
            System.out.println("Mobile Number is: " +MobileNumber +"\nvalid: " + valid);
            System.out.println(valid);
        }
        /**
         * Password Matching Pattern
         */
        public void password(){
            System.out.println("Enter Password: ");
            String pass1 = sc.next();
            boolean valid = pass1.matches("^(?=.*[A-Z])[a-zA-Z0-9!@#$%^&*()_+=-{};'<>,./?~`]{8,}$" + "(?=\\S+$).{8,}$");
            System.out.println(valid);
        }
    }

