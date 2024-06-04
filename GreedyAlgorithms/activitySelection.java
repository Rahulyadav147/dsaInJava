package GreedyAlgorithms;
import java.util.*;
public class activitySelection {
    public static void main(String[] args) {
        int start_t[]={1,3,0,5,8,5};
        int end_t[]={2,4,6,7,9,9};// if not sorted sort it first
        int maxAct=1;// activity 1 is already choosen
        int lastEnd=end_t[0];// ending element val of last choosen activiy
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(0);
        for(int i=1;i<start_t.length;i++){
            if(start_t[i]>=lastEnd){
                maxAct++;
                lastEnd=end_t[i]; // imp
                ans.add(i);
            }
        }
        System.out.println(maxAct);
        System.out.println("Indexes of choosen activities are :");
        for(int val:ans){
            System.out.print(" A"+val);
        }

    }
}
