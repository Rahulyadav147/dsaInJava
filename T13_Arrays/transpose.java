package T13_Arrays;

public class transpose {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i<j){
                  int temp=  arr[i][j];
                  arr[i][j]=arr[j][i];
                  arr[j][i]=temp;
                }
            }

        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
    }

    }
}
