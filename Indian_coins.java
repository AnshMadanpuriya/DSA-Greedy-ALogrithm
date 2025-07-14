import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_coins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5,20, 10, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());

        int countcoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countcoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total min(coins) is used :" + countcoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
