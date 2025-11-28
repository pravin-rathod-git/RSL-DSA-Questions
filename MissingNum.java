public class MissingNum {
    public static int Mssing(int[] arr,int n){
        int m=arr.length;
        int sum=(n*(n+1))/2;
        int arrSum=0;
        for(int i=0;i<m;i++){
            arrSum+=arr[i];
        }

        return sum-arrSum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8};
        int n=8;
        System.out.println(Mssing(arr, n));
    }

}
