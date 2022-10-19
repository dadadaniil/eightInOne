public class theLastOne {
    public static void main(String[] args) {
        int count, res;
        res = 1;
        count = 1984;
        String countStr = Integer.toString(count);
        String[] unoDos = countStr.split("");
        for (int i = 0; i != 4; i++) {
            res *= Integer.parseInt(unoDos[i]);
        }
    }
}
