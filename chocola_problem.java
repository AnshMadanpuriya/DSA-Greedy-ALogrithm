import java.util.*;

public class chocola_problem {
    public static void main(String[] args) {
        int m = 4, n = 6; // dimensions of chocolate (4 horizontal cuts, 6 vertical)
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // vertical cuts (n-1)
        Integer costHor[] = { 4, 1, 2 }; // horizontal cuts (m-1)

        // Sort in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // counters for cuts
        int hp = 1, vp = 1; // number of horizontal and vertical pieces
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] >= costHor[h]) {
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cutting the chocolate: " + cost);
    }

}
