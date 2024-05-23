package problem2;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    //getters and setters
    public MyPoint getTopLeft(){
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft){
        this.topLeft = topLeft;
    }
    public MyPoint getBottomRight(){
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight){
        this.bottomRight = bottomRight;
    }
    // get width of rectangle
    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }
    // calculate height of rectangle
    public int getHeight(){
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }
    // calculate area of rectangle
    public int getArea(){
        return getWidth() * getHeight();
    }
    // calculate perimeter of rectangle
    public int getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }
    public String toString(){
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
