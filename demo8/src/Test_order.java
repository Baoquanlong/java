public class Test_order {
    public static void main(String[] args) {
        Customer cus = new Customer();
        //点中餐
        FoodMenu cook = new ChineseCook();
        cus.setFoodMenu(cook);
        cus.order();
    }
}
