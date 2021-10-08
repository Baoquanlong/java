public class TestEnum01 {
    public static void main(String[] args) {
        Result res = divide(10,2);
        System.out.println(res==Result.SUCCESS ? "计算成功":"计算失败");
    }


    enum Result{
        SUCCESS,
        FAIL
    }
    public static Result divide(int a, int b){
        try {
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return  Result.FAIL;
        }
    }
}
