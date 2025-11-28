public class SecondClosest {
    public static int SecClose(int arr[],int m){
        int n=arr.length;
        int closest=-1;
        int secClosest=-1;
        int diff=Integer.MAX_VALUE;
        int secDiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int dist=Math.abs(arr[i]-m);
            if(dist<diff){
                secDiff=diff;
                diff=dist;
                secClosest=closest;
                closest=arr[i];
            }else if(dist>diff && dist<secDiff){
                secDiff=dist;
                secClosest=arr[i];
            }
        }
        return secClosest;
    }

    public static void main(String[] args) {
        int arr[]={1,4,9,7,8,2};
        int m=5;
        System.out.println(SecClose(arr, m));
    }
}
