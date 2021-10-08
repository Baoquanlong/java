import java.util.Random;

public class TestRandom02 {
    //创建一个一维数组，保存五个随机数，互不相同。
    public static void main(String[] args) {
        ArrayRandom arr = new ArrayRandom();
        arr.random();
        arr.print();
    }
}

class ArrayRandom{
    public int[] arr;
    public  ArrayRandom(){
        arr = new int[5];
    }
    public void random(){
        while (true){
            Random ran = new Random();
            int randomInt;
            int j;
            int i;
            for (i = 0; i < arr.length; i++) {
                randomInt = ran.nextInt(5);
                for (j = 0; j <= i; j++) {
                    if (arr[j]==randomInt){
                        if(i==0){ continue;}
                        else {
                            i--;
                        }
                        break;
                    }
                }
                if (j>i){
                    arr[i] = randomInt;
                }
            }
            if (i==5) {break;}
        }
    }

    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+i+"个是："+ arr[i]);


        }
    }
}
