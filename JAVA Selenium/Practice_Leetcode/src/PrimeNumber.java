import static java.lang.Math.sqrt;
//Time Complexity: O(n* sqrt(n))
public class PrimeNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isPrime(n));
    }
    //Time=O(sqrt(n))
    public static boolean isPrime(int n){
        for(int i=2;i<sqrt(n);i++){
            return false;
        }
        return true;
    }
}
