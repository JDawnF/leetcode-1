package t59;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        n = n - 1;
        for (int x = 0; x <= n; x++, n--) {
            for (int j = x; j <= n; j++) {
                arr[x][j] = num++;
            }
            for (int i = x + 1; i <= n - 1; i++) {
                arr[i][n] = num++;
            }
            for (int j = n; j >= x && x != n; j--) {
                arr[n][j] = num++;
            }
            for (int i = n - 1; i >= x + 1 && x != n; i--) {
                arr[i][x] = num++;
            }
        }
        return arr;
    }
}