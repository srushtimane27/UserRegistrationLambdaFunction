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
