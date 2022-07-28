//Test Cases For User Registration

package com.Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    //Test Cases For First Name
    @Test
    public void givenFirstName_WhenStartsWithCaps_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Srushti");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_HasMinThreeLetters_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Srus");
        Assertions.assertTrue(result);
    }

    //Test Cases For Last Name
    @Test
    public void givenLastName_WhenLastLetterCapital_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Mane");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenLastNameHasMinThreeCharacters_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Ma");
        Assertions.assertFalse(result);
    }


}

