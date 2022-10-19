public class FifthTask {
    public static void main(String[] args) {
        double x1, x2, y1, y2, res;
//        РАБОТАЕТ ПРИ УСЛОВИИ, ЕСЛИ ВТОРАЯ КООРДИНАТА БОЛЬШЕ ПЕРВОЙ(ИНАЧЕ ТРЕБУЮТСЯ МОДУЛИ ДЕЛЬТ(
//                ДОЛГО РЕАЛИЗОВЫВАТЬ))
        x1 = 1;
        x2 = 3;
        y1 = 2;
        y2 = 4;
        res = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}
