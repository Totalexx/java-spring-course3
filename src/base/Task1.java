package base;

public class Task1 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                counter += i;
        }
        System.out.println(counter);
    }
}
