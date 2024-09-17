package base;

public class Task2 {
    static int[][] x = {{20, 34, 2}, {9, 12, 18}, {3, 4, 5}};

    public static void main(String[] args) {
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] < smallestNumber)
                    smallestNumber = x[i][j];
            }
        }

        System.out.println(smallestNumber);
    }
}
