package com.company.day13;

import java.util.Random;
import java.util.Scanner;

public class Exam {
    /**
     * Make a small Multiable options quiz;
     * String[] questions  1fdgfdgf,2sdfdfd,3dfsfsdf;
     * String[] options   1ABCD 2ABCD 3ABCD
     * String[] answer    1C,2D, 3B
     *
     * display()
     *      - userName
     *      - welcome to quiz
     *      - are you ready? (y or n)
     *
     * -questionNumber
     * -correctAnswer
     * -totalPoint
     *
     */
    public static void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t~~~~~~Welcome to Scrum Quiz~~~~~~");
        System.out.println("Please registration to exam\n What is your user name");
        String userName = scanner.nextLine();
        System.out.println("Hey "+userName.toUpperCase()+" if you are ready to quiz pls type yes or no!!");
    }

 static String[] question ={ "1)What is your company's Agile workplace?", "2)What is not a Scrum role?", "3)Which title is not in Developer team?"};
 static String[] options = {"A)Kanban B)Scrum C)FreeHall", "A)Scrum Master B) Product Owner C) Customer", "A)QA B)FE C)CEO"};
 static String[] answer = { "B","C", "C"};

  public static void main(String[] args) {
    display();
int questionNumber = question.length;
int nextQuestion = 0;
int score = 0;
int trying = 0;

Scanner scanner = new Scanner(System.in);
String runAnswer = scanner.nextLine();
if (runAnswer.equalsIgnoreCase("yes")){
    System.out.println("\t!!Quiz is starting!!");

    while(nextQuestion < questionNumber){
        System.out.println("\t"+question[nextQuestion]);
        System.out.println("\n"+options[nextQuestion]);
        System.out.print("==============================================");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase(answer[nextQuestion])){
            System.out.println("Correct!!");
            score +=10;
            nextQuestion++;

        }else {
            trying++;
            System.out.println("Wrong Answer!!");

        }

    }
    System.out.println("Your total Point is: "+score);
}else
    System.out.println("!!Bye!!");





    }






}
