package problem1;
public class MyPoint {
    private int x;
    private int y;

    // no argument constructor
    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    //parameterized constructor
    
    public MyPoint(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    //setter and getter methods
    public void setX(int x) 
    {
        this.x = x;
    }
    public void setY(int y) 
    {
        this.y = y;
    }
    public int getX() 
    {
        return x;
    }
    public int getY() 
    {
        return y;
    }

    public void setXY(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }   
    public String toString() 

    {
        return "(" + this.x + "," + this.y + ")";
    }
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Calculate distance 
    public double distance(MyPoint c) {
        int xDiff = this.x - c.x;
        int yDiff = this.y - c.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Calculate the distance to the origin (0,0)
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
