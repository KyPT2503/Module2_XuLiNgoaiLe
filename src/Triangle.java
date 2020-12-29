import java.util.Scanner;

public class Triangle {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculate();
    }

    private static void getSidesOfRectangle(Scanner scanner) {
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Fuck");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static int getValueByIndex(int index, int[] ints) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= ints.length) throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        return ints[index];
    }

    private static void calculate() {
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
