public class test {
    public static int count(int n){
        if (n == 5){
            return 0;
        }

        System.out.println(n);
        count(n + 1);
        return n;
    }

    public static void main(String[] args) {
        count(1);
    }
}
