package RecursionKunal;
import java.util.*;
public class Basic {

    // note : if you want to return back in return type function anywhere from middle just return with a value without 
    // making any further call : ex below binarySearch for target==arr[mid] condition (it will not search further)

    public static boolean binarySearch(int arr[],int i,int j,int target){
                if(i>j){
                    return false;
                }
                int mid=i+(j-i)/2;// local variable which need not be  passed as function argument 
                 if(target==arr[mid]){
                    return true;
                }
                 if(target>arr[mid]){
                    return binarySearch(arr, mid+1, j, target);
                }
                
                return binarySearch(arr, i, mid-1, target);
                
    }
// sum(n)=n+sum(n-1);
public static int sum(int n ){
    if(n==1)return 1;
    return n+sum(n-1);
}
// factorial(n)=n*factorial(n-1);
public static int factorial(int n ){
    if(n<=1)return 1;
    return n*factorial(n-1);
}
// fibonacci(n)=fibonacci(n-1)+fibonacci(n-2);
public static int fibonacci(int n ){
    if(n<=1)return n;
    return fibonacci(n-1)+fibonacci(n-2);
}
// sumOfDigits(n)=n%10+sumOfDigits(n/10);
public static int sumOfDigits(int n){
    if(n<10){// i.e :if n is a single digit number 
        return n;
    }
    return n%10+sumOfDigits(n/10);
}
// productOfDigits(n)=n%10+sumOfDigits(n/10);
public static int productOfDigits(int n){
    if(n/10==0){// i.e :if n is a single digit number 
        return n;
    }
    return n%10*productOfDigits(n/10);
}
//using external variable to store ans 
static int reversed;
public static void reverseDigits1(int n){
    if(n==0)return ;//  when sinlge digit is used in previous recursive call and this call is given sinlgeDigit/10 i.e=0
    reversed=reversed*10+n%10;
    reverseDigits1(n/10); 

}
// using helper function to pass digits argument and return acutal ans in int type
public static int helper(int n,int digits){
    if(digits==1){// if single digit no need to reverse
        return n;
    }
    // 1234-> 4 + helper(123)->43+helper(12).....
    int reversed=(n%10)*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    return reversed;
}
public static int reverseDigits2(int n){
         int digits=(int)Math.log10(n)+1;
         return helper(n,digits);
}

public static boolean ispalindrome(int n){
    return n==reverseDigits2(n);   // if number is given this way other wise last and first pointer for string and arr in helper function
}
// countZero(n)=(n%10==0?1:0) +countZero(n/10);
// i.e check for last digit: if zero add 1 and call for number/10
public static int countZero(int n){
    if(n==0)return 0;// if each digit finished return 0 as it has no zero
    return (n%10==0?1:0)+countZero(n/10);
}
// using helper function
public static int helper1(int n,int count){
    if(n==0)return count;// reached till last return count
    // if(n%10==0){
    //     return helper1(n/10,count+1);
    // }
    // return helper1(n/10,count);
    // same as above
    return n%10==0?helper1(n/10,count+1):helper1(n/10,count);

}
public static int countZero1(int n){
  return helper1(n,0);
}

// is sorted
public static boolean isSortedHelper(int arr[],int index){
    if(index==arr.length-1)return true;
    if(arr[index]>arr[index+1])return false;
    return isSortedHelper(arr, index+1);

}
public static boolean isSorted(int arr[]){
return isSortedHelper(arr,0);
}
// search in string or array
public static boolean findKey(String s,char a,int i){
    // base case:
    if(i>=s.length()){
        return false;
    }
    // processing (ek case solve kar do )
    if(a==s.charAt(i)){
        return true;}
    // recursive call(backi recursion sambhal lega)
    return findKey(s, a, i+1);
}
// using helper function (most easy and effecient way) out of all 4 types
public static ArrayList<Integer> findIndexes(int arr[], int target) {
    // This is the public API method, which only takes the array and target as parameters.
    // We'll call the helper function from here to handle the recursion.
    ArrayList<Integer> list = new ArrayList<>();
    findIndexesHelper(arr, target, 0, list);  // Start from index 0
    return list;  // Return the final list of indices
}

private static void findIndexesHelper(int[] arr, int target, int index, ArrayList<Integer> list) {
    // Base case: if we've processed all elements
    if (index >= arr.length) {
        return;
    }

    // Process the current element, add to list if it matches the target
    if (arr[index] == target) {
        list.add(index);
    }

    // Recursively process the rest of the array
    findIndexesHelper(arr, target, index + 1, list);
}

// using external list to add indexes
static ArrayList<Integer>list=new ArrayList<>();
public static void findKey1(int arr[],int target,int index){
    // base case:
    if(index>=arr.length){
        return;
    }
    // processing (ek case solve kar do )
    if(arr[index]==target){
        list.add(index);}
    // recursive call(backi recursion sambhal lega)
      findKey1(arr,target,index+1);
}
// using same arrayList object but different references are passed
public static ArrayList<Integer> findIndexes(int arr[],int target,int index,ArrayList<Integer>list){
    // base case:
    if(index>=arr.length){
        return list;
    }
    // processing (ek case solve kar do )
    if(arr[index]==target){
        list.add(index);}
    // recursive call(backi recursion sambhal lega)
      return findIndexes(arr,target,index+1,list);// this will return arrayList from base case to its parent function
}

// Bad approach
// using same different arrayList object in each function without passing list parameter
// currAnsList=currentIndex+ansFromRemaining List
public static ArrayList<Integer> findIndexes(int arr[],int target,int index){
    ArrayList<Integer>list=new ArrayList<>();
    // base case:
    if(index>=arr.length){
        return list;
    }
    // add if current element is target
    if(arr[index]==target){
        list.add(index);}
    // go for remaining array
    // recursive call(backi recursion sambhal lega)
      ArrayList<Integer>ansFromBelowCalls= findIndexes(arr,target,index+1);
      list.addAll(ansFromBelowCalls);//addAll adds collections element to another collection , whereas add created nested list
      return list;
}

    public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    // if(binarySearch(arr,0,arr.length,4)){
    //     System.out.println("found");
    // }
    // else{
    //     System.out.println("not found");
    // }
    System.out.println(sum(5));
    System.out.println(factorial(5));
    System.out.println(fibonacci(5));
    System.out.println(sumOfDigits(1234));
    System.out.println(productOfDigits(1234));
    reverseDigits1(1234);
    System.out.println(reversed);
    System.out.println(reverseDigits2(1234));
    System.out.println(ispalindrome(12321));
    System.out.println(countZero(101010));
    System.out.println(countZero1(101010));
    System.out.println(isSorted(new int[]{1,2,3,4}));
    System.out.println(findKey("rahul", 'f', 0));
    int arr[]={1,2,3,2,3};
    findKey1( arr,3,0);
    System.out.println(list);// print indexs of target found
    ArrayList<Integer>listOfMatchedIndexes=findIndexes(arr,3,0,new ArrayList<>());
    System.out.println(listOfMatchedIndexes);
    System.out.println(findIndexes(arr,3,0));
    System.out.println(findIndexes(arr,3));
    }
}
