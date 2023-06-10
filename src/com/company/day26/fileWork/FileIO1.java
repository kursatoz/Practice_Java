package com.company.day26.fileWork;

import java.io.File;
import java.io.IOException;


import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileIO1 {
   final  String filePath = "src/com/company/day26/fileWork/demo.txt";
    public static void main(String[] args) throws IOException {

        File file = new File("src/com/company/day26/fileWork/demo.txt");
        System.out.println(file.exists());
        //List<String> marks = Files.readAllLines(Path.of("src/com/company/day26/fileWork/demo.txt"));
       // System.out.println(marks.toString());
        Map<String, Integer> map = new HashMap<String, Integer>();
        try{
            List<String> marks = Files.readAllLines(Path.of("src/com/company/day26/fileWork/demo.txt"));

            for (String each : marks ) {
                     String name = each.split(",")[0];
                     Integer mark = Integer.parseInt(each.split(",")[1]);
                     map.put(name,mark);
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("There is some problems!! path is not readable");
        }
        System.out.println(map);


    }
}
