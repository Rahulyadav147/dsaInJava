package GreedyAlgorithms;
import java.util.*;
public class maxLenChainOfPairs {// same as activity selection
    public static void main(String[] args) {
        int pairs[][]={ {5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLen=1;// 1st pair choosen already
        int chainEnd=pairs[0][1];// last selected pairs end 
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=chainEnd){// last end <=currStart
             chainLen+=1;
             chainEnd=pairs[i][1];// end of curr pair
            }
        }
        System.out.println("max len of chain="+chainLen);
    }
}
