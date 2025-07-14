import java.util.*;

public class Activity_SelectionCode {  //O(n)
    public static void main(String[] args) {
        int st[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // end time basis sorted
        int maxAct = 0;                                                 
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st Activity
        maxAct = 1;
        ans.add(0);
        int lastend = end[0];
        for (int i = 0; i < end.length; i++) {
            if(st[i]>=lastend){
                //Activity select
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Max Activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}