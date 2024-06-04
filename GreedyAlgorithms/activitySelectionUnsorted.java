package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelectionUnsorted {
    public static void main(String[] args) {
        int start_t[]={5,3,0,1,8,5};
        int end_t[]=  {7,4,6,2,9,9};// we ned to sort it acc to end_time:
        int size=start_t.length;
        // make a 2d arr storing index ,start_t, and end_t to sort becaus if end_t is sorted order will be lost
        int activities[][]=new int[size][3];
        for(int i=0;i<size;i++){
            //index
            activities[i][0]=i;
            //start_t
            activities[i][1]=start_t[i];
            //end_t
            activities[i][2]=end_t[i];
        }
        // sorting it acc to end_t i.e. o[2]// o is object and o[2] is the property which is used to sort the the array with respect to
        // syntax: we can use cutom classes too in ClassName
        /*
        Comparator<ClassName> comparator = Comparator.comparing(o -> o.property);
        Example:
        Comparator<Student> comparator = Comparator.comparing(o -> o.age);
        Collections.sort(students, comparator);
        */
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxAct=1;// activity 1 is already choosen
        int lastEnd=activities[0][2];// ending element val of last choosen activiy: 
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(activities[0][0]);// index of 0th avtivity
        for(int i=1;i<size;i++){
            if(activities[i][1]>=lastEnd){ // if start_t>lastEnd
                maxAct++;
                lastEnd=activities[i][2]; // 
                ans.add(activities[i][0]);// add index of choosen activity 
            }
        }
        System.out.println(maxAct);
        System.out.println("Indexes of choosen activities are :");
        for(int val:ans){
            System.out.print(" A"+val);
        }

}
}
