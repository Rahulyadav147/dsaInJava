package ArrayLIst;
import java.util.*;
import java.util.ArrayList;
class MultiDimensionalArrayList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // syntax
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        // creating 1 dimensinoal lists 
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        // adding elements to 1d arraylists
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        // adding 1d arraylist to 2d 
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(list2.size()-1);// removing from last
        list2.remove(list2.size()-1);

        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            for(int j=0;j<mainList.get(i).size();j++){// to get each 1d arraylist size
                  System.out.print(mainList.get(i).get(j)+" ");

            }
            System.out.println();
        }
        String str=" hello,how are you ";
        String str2="hello";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.trim());
        System.out.println(str.split(","));// gives string array ex ["hello","how are you"] split at ","
        System.out.println(str.substring(1,4));
        System.out.println(str.indexOf("he"));
        System.out.println(str.charAt(1));
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.concat("ram"));
        System.out.println(str.contains("he"));
        System.out.println(str.isEmpty());
        System.out.println(str.replace("he","ram"));
        System.out.println(str.replaceAll("[^0-9a-zA-Z]",""));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.toCharArray());
        

     sc.close();
    }
}