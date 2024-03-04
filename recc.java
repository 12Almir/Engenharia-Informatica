public class recc {
    public static  int reca(int n) {
        if(n==0)
            return 1;
        else
            return  n* reca(n-1);

    }
    public static void main(String[] args) {
        int x = reca(2);
        System.out.println(x);
    }
}


