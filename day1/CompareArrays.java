package day1;

import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {
        int[] b = {5, 3, 8}; // boys
        int[] g = {2, 4, 6}; // girls

        String result = checkArrays(b, g);
        System.out.println(result);
    }

    public static String checkArrays(int[] b, int[] g) {
        Arrays.sort(b);
        Arrays.sort(g);

        int n = b.length;
        String ans = "Yes";

        int start = (g[0] < b[0]) ? g[0] : b[0];

        for (int i = 0; i < n; i++) {
            if (g[0] < b[0] && g[i] > b[i]) {
                ans = "No";
                break;
            } else if (b[i] < g[i]) {
                ans = "No";
                break;
            }
        }

        return ans;
    }
}

