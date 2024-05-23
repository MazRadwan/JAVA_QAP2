package problem1;

public class TestMyLine {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,4);

        MyLine line = new MyLine(p1, p2);
        
        System.out.println();
        System.out.println();
        System.out.println("Begin: " + line.getBegin());
        System.out.println("End: " + line.getEnd());
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
        System.out.println("Line: " + line.toString());
        System.out.println();
        System.out.println();
    }
}
