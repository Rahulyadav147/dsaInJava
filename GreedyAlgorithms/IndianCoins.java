package GreedyAlgorithms;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer denominations[]={1,2,5,10,20,50,100,200,500,1000,2000};
       Arrays.sort(denominations,Collections.reverseOrder());// NOTE: Collections.reverseOrder()  workds on objects so make Integer arr not int arr for denominations
        int amt=590;
        int nOfNotes=0;
        int len=denominations.length;
        for(int i=0;i<len;i++){
             if(amt>=denominations[i]){
                nOfNotes=nOfNotes+amt/denominations[i];// notes of particular denominations 
                amt%=denominations[i];//rem amount  
             }
        }
        System.out.println(nOfNotes);
    }
   
}
