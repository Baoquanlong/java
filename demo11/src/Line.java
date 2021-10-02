public class Line {
    private Point p1;
    private Point p2;
    public double distance;
    /**
     * Default constructor
     */
    public Line(){
        this.distance();
    }

    public Line(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
        this.distance();

    }


    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void distance(){
        int x1 = getP1().getX();
        int x2 = getP2().getX();
        int y1 = getP1().getY();
        int y2 = getP2().getY();
//        double d = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        this.distance = d;
    }
}
