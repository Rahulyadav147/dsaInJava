package GreedyAlgorithms;
import java.util.*;
public class jobSequencingProblem {
    static class Job{
        char id;
        int deadLine;
        int profit;
        Job(char id,int deadLine,int profit){
            this.id=id;
            this.deadLine=deadLine;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
       int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
       // make an arraList of job type to store id ,deadLine and profit: to sort acc to profit
       ArrayList<Job> job=new ArrayList<>();
       // store the id's ,deadLine and profits
       for(int i=0;i<jobInfo.length;i++){
        job.add(new Job((char)('A'+i),jobInfo[i][0],jobInfo[i][1]));
       }
       // sort acc to profit
       Comparator<Job> com=(obj1,obj2) -> obj1.profit <= obj2.profit?1:-1;// 1 tells to place obj1 after obj2 : so place obj1 after obj2 because obj1 is smaller (for desc order ) 
       Collections.sort(job,com);
       int time=0;
       ArrayList<Character> seq=new ArrayList<>();
       for(int i=0;i<jobInfo.length;i++){
        Job curr=job.get(i);// we need a single job object in curr then only we can access deadLine and id seperatly from job arrayList
         if(curr.deadLine>time){
           
            seq.add(curr.id);
            time=curr.deadLine;

         }
       }
       System.out.println(seq);
    }
}
