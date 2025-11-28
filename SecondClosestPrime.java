public class SecondClosestPrime {
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

     static int SecClosest(int n){
        int l=n-1;
        int r=n+1;
        int count=0;
        if(isPrime(n)){
            count++;
        }
        while(true){
            if(l>=2 && isPrime(l)){
                count++;
                if(count==2){
                    return l;
                }
            }
             if(isPrime(r)){
                count++;
                if(count==2){
                    return r;
                }
            }
            l--;
            r++;
        }
    }

    public static void main(String[] args) {
        int n=22;
        System.out.println(SecClosest(n));
    }
}
