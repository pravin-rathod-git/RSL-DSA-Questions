public class RightRotation{
    public static int[] Roataion(int[] arr,int d){
        int n=arr.length;

         reverse(arr, 0, n-1);

        reverse(arr,0,d-1);

        reverse(arr,d,n-1);
        
       

        return arr;
    }
    private static int[] reverse(int[] arr,int l,int r){
        while(l<r){
            arr[l]=arr[l]^arr[r];
            arr[r]=arr[l]^arr[r];
            arr[l]=arr[l]^arr[r];
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int[] result=Roataion(arr, 3);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
