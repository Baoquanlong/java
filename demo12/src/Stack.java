/**
 * Stack 类应该具有的方法和属性：
 * POP方法，PUSH方法，构造方法，是否为空方法
 * 栈顶属性
 */

public class Stack {
    private Object[] ob;

    /*
        Construct an object array,
        default length is 10.
     */
    public Stack(){
        this.ob = new Object[10];
    }
    /*
        overload constructor Stack.
     */
    public Stack(Object[] ob){
        this.ob = ob;
        this.index = ob.length;
    }


    /*
        栈顶属性，初始为0
     */
    public int index = 0;

    /*
        pop method
     */
    public void pop(){
        if(index>0) {
            this.ob[index - 1] = null;
            index--;
        }else {
            System.out.println("No more elements");
        }
    }

    /*
        push method
     */
    public void push(Object ob){
        if(index<=10){
            this.ob[index] = ob;
            index++;
        }else{
            System.out.println("Out of range!");
        }
    }

    /*
        isEmpty method,
        default False.
     */
    public boolean isEmpty(){
        return (index == 0);
    }


    public Object[] getOb() {
        return ob;
    }

    public void setOb(Object[] ob) {
        this.ob = ob;
    }

    /**
     * print all ob array's elements.
     */
    public void print(){
        for (int i = 0; i < this.ob.length; i++) {
            System.out.println("第"+i+"个是："+ob[i]);
        }
        System.out.println("-----------------------------------------");
    }

}
