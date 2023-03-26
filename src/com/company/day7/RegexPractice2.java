package com.company.day7;

public class RegexPractice2 {


    public static void main(String[] args) {
/**
 * length between less than 15 more than 8
 * contain upperLetter and lower letter
 * contain any special characters (@,#,$,%)
 * contain numbers
 * input : 123ab..
 */

        System.out.println(isValidPassword("2432A4@a4432"));

    }

    public static boolean isValidPassword(String password) {
        if (password.length() >= 15 || password.length() <= 8) {
            System.out.println("your password does length issue");
            return false;

        }
       else if (!password.matches("(.*[A-Z].*)"))
        {
            System.out.println("your password does not contain upperLetter");
            return false;
        }

        else if (!password.matches("(.*[a-z].*)"))
        {
            System.out.println("your password does not contain lowerLetter");
            return false;
        }


        else if (!password.matches("(.*[0-9].*)"))
        { System.out.println("yor password does not contain any digit");
            return false;
        }

        else if (!password.matches("(.*[!,@,#,$,%,^,.,*,(,,)].*)"))
        {
            System.out.println("yor password does not contain any !,@,#,$,%,^,.,*,(,,)]* those characters");
            return false;
        }
        else
            System.out.println("your password is strong!!! ");
        return true;

    }


}
