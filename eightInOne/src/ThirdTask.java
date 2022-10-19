public class ThirdTask {
    public static void main(String[] args) {

        double a, b, c;
        double res;
        a = 1;
        b = a;
        c = b;

        if (a == 0) {
            System.out.println("impossible to divide by zero");
            return;
        }
        res = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a * a * c + 1 / b * b;

    }
}
