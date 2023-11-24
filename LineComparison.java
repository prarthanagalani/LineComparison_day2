package LineComparison_day2;

import java.util.Scanner;

class Point{

    private double x,y;
    
    // constructor of Point class
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y coordinates
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class LineComparison {

    private Point starPoint;
    private Point endPoint;

   

    // constructor for this class to initialize points for given line
    public LineComparison(Point starPoint, Point endPoint) {
        this.starPoint = starPoint;
        this.endPoint = endPoint;
    }

    // Uc1: Calculate the length of a line
    public double calculateLength() {
        double x1 = starPoint.getX();
        double y1 = starPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Uc2: Check if two lines are equal or not based on end points
    public boolean equals(LineComparison otherLine) {
        return this.starPoint.getX() == otherLine.starPoint.getX() && this.starPoint.getY() == otherLine.starPoint.getY() &&
               this.endPoint.getX() == otherLine.endPoint.getX() && this.endPoint.getY() == otherLine.endPoint.getY();
    }

    // Uc3: Compare lengths of two lines based on end points
    public int compareTo(LineComparison otherLine) {
        //length of line1
        double thisLength = calculateLength();
        //length of line2
        double otherLength = otherLine.calculateLength();

        if (thisLength < otherLength) {
            return -1;
        } else if (thisLength > otherLength) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // welcome message on main branch
        System.out.println("Welcome to Line Comparison Computation Program!!");

        Scanner sc = new Scanner(System.in);

        // taking input from user for line1
        System.out.println("Enter x1,y1,x2,y2 co-ordinates for line1: ");
        int x11 = sc.nextInt(), y11 = sc.nextInt(), x12 = sc.nextInt(), y12 = sc.nextInt();

        Point starPoint1 = new Point(x11, y11);
        Point endPoint1 = new Point(x12,y12);

         // taking input from user for line2
        System.out.println("Enter x1,y1,x2,y2 co-ordinates for line1: ");
        int x21 = sc.nextInt(),y21 = sc.nextInt(),x22=sc.nextInt(),y22=sc.nextInt() ;

        Point starPoint2 = new Point(x21,y21);
        Point endPoint2 = new Point(x22,y22);

        LineComparison line1 = new LineComparison(starPoint1,endPoint1);
        LineComparison line2 = new LineComparison(starPoint2,endPoint2);
        
        //uc1: we are calling calculateLength() function to cal length of line1
        System.out.println("Length of Line 1: " + line1.calculateLength());
        
        //uc2: we are calling equals() function of object line1 and will pass line 2 object as argument in it.
        if (line1.equals(line2)) {
            System.out.println("Line 1 is equal to Line 2.");
        } else {
            System.out.println("Line 1 is not equal to Line 2.");
        }

        //uc3: we are calling compareTo() function of object line1 and will pass line 2 object as an argument in it.
        int comparisonResult = line1.compareTo(line2);

        //decide length based on return value
        if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is equal in length to Line 2.");
        }

        sc.close();

    }
}
