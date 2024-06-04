package GreedyAlgorithms;
import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]=  {10,20,30};
        int capacity=50;
        int size=value.length;
        double ratio[]=new double[size];
        for(int i=0;i<size;i++){
            ratio[i]=value[i]/weight[i];
        }

        // to keep all four elements togather 
        double Arr[][]=new double[size][4];
        for(int i=0;i<size;i++){
            //index
            Arr[i][0]=i;
            //value
            Arr[i][1]=value[i];
            //weight
            Arr[i][2]=weight[i];
            // ratio
            Arr[i][3]=ratio[i];
        }
      
        Arrays.sort(Arr,Comparator.comparingDouble(o->o[3]));
        int totalvalue=0;
        // taking vlaues in descending order
        for(int i=size-1;i>=0;i--){
            // include full
            if(Arr[i][2]<=capacity){        
                capacity-=Arr[i][2];// take full weight
                totalvalue+=Arr[i][1];// increase the value profit         
            }
            else {// include fraction
                totalvalue+=capacity*Arr[i][3];// increase the value profit use ratio 
                capacity=0; // after takiing this weight capacity will be 0
                break;
            }
           
        }
        System.out.println(totalvalue);
       

}
}

