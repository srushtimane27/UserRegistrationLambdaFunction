package com.Lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class UserRegistrationLambda {
    public static void main(String[] args) {

        //UC1: first name validation
        List<String> fname = Arrays.asList("Srushti", "Rasika", "Ruchika", "JidnyA");
        final Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{3,15}$");

        // Using regex with lambda expression
        List<String> fname_result = fname.stream().filter(p -> pattern1.matcher(p).find()).collect(Collectors.<String>toList());

        //printing result
        fname_result.forEach(System.out::println);
        
        //last name validation
			List<String> lname = Arrays.asList("Pawar", "Ghadi","pa1il","g0re");
			final Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{3,15}$");
			
			// Using regex with lambda expression
			List<String> lname_result = lname.stream().filter(p -> pattern2.matcher(p).find()).collect(Collectors.<String>toList());
			
			//printing result
			lname_result.forEach(System.out::println);
			
			//email validation
			List<String> mail = Arrays.asList("shwet.ps@gmail.com","ihi@i@hgam.co","flip.12@kore.co.in");
			final Pattern pattern3 = Pattern.compile("^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$");
			
			// Using regex with lambda expression
			List<String> mail_result = mail.stream().filter(p -> pattern3.matcher(p).find()).collect(Collectors.<String>toList());
			
			//printing result
			mail_result.forEach(System.out::println);
			

    }
}
