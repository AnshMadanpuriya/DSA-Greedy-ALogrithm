import java.util.Arrays;

public class Minimum_Diference {
    public static void main(String[] args) {  // O(nlogn) sort and loop
        int A[]={4,1,8,7};
        int B[]={2,3,5,6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute difference pair is :"+minDiff);
    }
}
