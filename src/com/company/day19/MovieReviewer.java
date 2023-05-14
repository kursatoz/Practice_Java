package com.company.day19;

import java.util.Arrays;
import java.util.Scanner;

public class MovieReviewer {

    public static void main(String[] args) {
       int r,m;
        /** reviewer   0          1         2
         * input; [{4,6,2,5},{7,9,4,8},{3,6,9,8}]  movie[1][1]=> 9
         * movie    0 1 2 3   0 1 2 3   0 1 2 3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter reviewer number");
        r = scanner.nextInt();
        System.out.println("Enter movies number");
        m = scanner.nextInt();

        int[][] movies = new int[r][m];
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <m ; j++) {
                movies[i][j] =scanner.nextInt();

            }
        }
        averageMovies(movies,r,m);
        averageReview(movies,r,m);
    }

public static double[] averageMovies(int[][] arr,int r, int m){
 double [] movieAverage = new double[m];
       double average = 0.0;
    for (int i = 0; i <m ; i++) {
        double totalM = 0;
        for (int j = 0; j <r ; j++) {
            totalM +=arr[i][j];

      }
       movieAverage[i] = totalM/r;
    }
    System.out.println(Arrays.toString(movieAverage));
        return movieAverage;
}
public static double[] averageReview(int[][] arr,int r, int m){
 double [] reviewAverage = new double[r];
       double average = 0.0;
    for (int i = 0; i <r ; i++) {
        double totalM = 0;
        for (int j = 0; j <m ; j++) {
            totalM +=arr[i][j];

      }
        reviewAverage[i] = totalM/m;
    }
    System.out.println(Arrays.toString(reviewAverage));
        return reviewAverage;
}



}
