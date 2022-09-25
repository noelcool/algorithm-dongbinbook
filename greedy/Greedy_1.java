package greedy;

public class Greedy_1 {

    public static void main(String[] args) throws Exception {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = { 500, 100, 50, 10 };
        for (int i = 0; i < 4; i++) {
            cnt += n / coinTypes[i];
            n %= coinTypes[i];
        }
        System.out.println(cnt);
    }

}