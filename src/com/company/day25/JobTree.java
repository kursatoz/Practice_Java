package com.company.day25;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTree  {

    public static void main(String[] args) {
       // Job j1 = new Job(160000,"Apple","CA","SQA");
      //  Job j2 = new Job(1610000,"Apple1","CA1","SQA1");
      ///  Job j3 = new Job(162000,"Apple2","CA2","SQA2");

        SortedSet<Job> sortedJob = new TreeSet<Job>();
       // sortedJob.add(j1);
      //  sortedJob.add(j2);
      //  sortedJob.add(j3);
        sortedJob.add(new Job(110000,"Samsung","FL","SDET1"));
        sortedJob.add(new Job(200000,"Google","NY","SDET2"));
        sortedJob.add(new Job(90000,"Zoom","MO","JSDET"));
        System.out.println(sortedJob.size());
        //iteration is working like for loop
        Iterator<Job> ite = sortedJob.iterator();//
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

// another loop method
        for (Job each : sortedJob ) {
            System.out.println("Job definition: "+each);
        }



        System.out.println(sortedJob.size());
        System.out.println("the best salary work is "+sortedJob.last());
        System.out.println("the worst salary is"+ sortedJob.first());

    }


}
