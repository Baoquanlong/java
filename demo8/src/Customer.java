public class Customer {
    //菜单
    private FoodMenu foodMenu;

    //空构造函数
    public Customer() {

    }

    //初始化菜单的构造函数
    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public void order() {
        this.foodMenu.tomato();
        this.foodMenu.fish();
    }
}
