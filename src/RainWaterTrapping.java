import static java.lang.Math.*;

//Time-O(n*n)=>O(n2)
public class RainWaterTrapping {
    public static void main(String[] args) {
    int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(findRainWater(arr));
    }
    public static  int findRainWater(int []height){
        int n= height.length;
    int rainWater=0;
    for(int i=1;i<n-1;i++){ //O(n)
        int leftMax=findLeftMax(height,n,i); //O(n)
        int rightMax=findRightMax(height,n,i); //O(n) (we are calling O(n) n times so Time Complexity is O(nsquare)
        rainWater= rainWater+ (min(leftMax,rightMax)-height[i]);
        }
        return rainWater;
    }
    public static int findLeftMax(int height[],int n,int i){
        int mx=0;
        for(int j=0;j<=i;j++){
            mx= max(mx,height[j]);
        }
        return mx;
    }
    public static int findRightMax(int height[],int n,int i){
        int mx=0;
        for(int j=i;j<n;j++){
            mx= max(mx,height[j]);
        }
        return mx;
    }
}
