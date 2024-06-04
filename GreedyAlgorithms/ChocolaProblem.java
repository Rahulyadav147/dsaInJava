package GreedyAlgorithms;
// import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class ChocolaProblem {
    public static void main(String[] args) {
    
    Integer costVer[]={2,1,3,1,4};// cost of cuts on each point on horizontal direction (but cuts made will be vertial)
    Integer costHor[]={4,1,2};// cost of cuts on each point on vertical direction
    int h=0,v=0;// horizontal and vertical pointers(h traverses over costHor and v over costVer)
    int hp=1,vp=1;// horizontal and vertical pieces
    int cost=0;
    Arrays.sort(costVer,Collections.reverseOrder());
    Arrays.sort(costHor,Collections.reverseOrder());
    while(h<costHor.length && v<costVer.length){
         if(costVer[v]<=costHor[h]){// make horizontal cut
            cost+=costHor[h]*vp;
            hp++; 
            h++;
         }
         else{// make vertical cut
            cost+=costVer[v]*hp;
            vp++;
            v++;
         }
    }
    while(h<costHor.length){// horizontal cut 
          cost+=costHor[h]*vp;
          hp++; 
          h++;
    }
    while(v<costVer.length){// vertical cut
        cost+=costVer[v]*hp;
        vp++;
        v++;
    }

    System.out.println(cost);
    }
   
    
}
