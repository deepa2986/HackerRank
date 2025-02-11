import java.util.Arrays;
import java.util.List;

public class LegoBlocks {

    public static void main(String[] args) {

    }

    public static int legoBlocks(int n, int m) {
        if (n < 2 || m < 1) return 0;
        if (m == 1) return 1;
        long [] total = new long [m + 1];
        Arrays.fill(total, -1);
        fillTot(total, m);
        for (int i = 0; i < total.length; i++) {
            long tmp = 1;
            for (int j = 0; j < n; j++) {
                tmp = (tmp * total[i]) % MOD;
            }
            total[i] = tmp;
        }
        long [] result = new long [m + 1];
        Arrays.fill(result, -1);
        getResult(total, result, m);
        return (int) (result[m] % MOD);
    }

    static long MOD = 1000000000 + 7;
    static long getResult(long [] total, long [] result, int i) {
        if (result[i] == -1) {
            if (i == 1) {
                result[i] = 1;
            }
            else {
                result[i] = total[i];
                for (int j = 1; j < i; j++) {
                    result[i] -= (getResult(total, result, j) * total[i - j]) % MOD;
                }
            }
        }
        return result[i];
    }
    static long fillTot(long [] total, int i) {
        if (i < 0) return 0;
        if (total[i] == -1) {
            if (i == 0 || i == 1)
                total[i] = 1;
            else
                total[i] = (fillTot(total, i - 1) + fillTot(total, i - 2) + fillTot(total, i - 3) + fillTot(total, i - 4)) % MOD;
        }
        return total[i];
    }

    public static int legoBlocks1(int n, int m) {
        // Write your code here

        if (n < 2 || m < 1) return 0;
        if (m == 1) return 1;
        long [] row = new long [m + 1];
        Arrays.fill(row, -1);
        total(row, m);
        for (int i = 0; i < row.length; i++) {
            long tmp = 1;
            for (int j = 0; j < n; j++) {
                tmp = (tmp * row[i]) % MOD;
            }
            row[i] = tmp;
        }
        long [] solid = new long [m + 1];
        Arrays.fill(solid, -1);
        unSolid(row, solid, m);
        return (int) (solid[m] % MOD);
    }
    static long MOD1 = 1000000000 + 7;
    static long unSolid(long [] total, long [] row, int i) {
        if (row[i] == -1) {
            if (i == 1) {
                row[i] = 1;
            }
            else {
                row[i] = total[i];
                for (int j = 1; j < i; j++) {
                    row[i] -= (unSolid(total, row, j) * total[i - j]) % MOD;
                }
            }
        }
        return row[i];
    }
    static long total(long [] row, int i) {
        if (i < 0) return 0;
        if (row[i] == -1) {
            if (i == 0 || i == 1)
                row[i] = 1;
            else
                row[i] = (total(row, i - 1) + total(row, i - 2) + total(row, i - 3)
                        + total(row, i - 4)) % MOD;
        }
        return row[i];
    }
}
