public class SecondLargest {
    public static int SecondLargest(int[] arr){
        int n=arr.length;
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        int[] arr={44,3,56,87,14,62,95};
        System.out.println(SecondLargest(arr));
    }
}
