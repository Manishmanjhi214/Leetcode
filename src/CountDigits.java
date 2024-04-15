public class CountDigits {
    public static void main(String[] args) {
        int num=1248;
        System.out.println(countDigits(num));
    }
    public static int countDigits(int n){
        int res=0;
        while(n>0){
            n=n/10;
            res++;
        }
        return res;
    }
    /*public static int countDigits(int num) {
        int output=0;
        int temp=0;
        int ognum=num;
        while(num>0){
            temp=num%10;
            if(ognum%temp==0){
                output=output+1;
            }
            num=num/10;
        }
        return output;
    }*/
    //Best Solution for 2520. Count the Digits That Divide a Number:
    /*public static int countDigits(int num) {
        int temp = num, count = 0;
        while (temp > 0) {
            if (num % (temp % 10) == 0) count++;
            temp /= 10;
        }
        return count;
    }*/
}
