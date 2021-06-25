import java.util.Scanner;

public  final class fac {
    public static int facts(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * facts(n - 1);
        }
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        System.out.println("你想要求几的阶乘？");
        int num = input.nextInt();
        int res = facts(num);
        System.out.println("结果是："+res);

    }

}
