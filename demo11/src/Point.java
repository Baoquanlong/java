public class Point {
    /**  param x
     */
    private int x;
    /**
     * param y
     */
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void showPoint(){
        System.out.println("the point is: ("+this.getX()+","+this.getY()+")");
    }
}
