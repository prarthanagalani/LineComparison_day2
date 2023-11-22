package LineComparison_day2;

import java.util.Scanner;

class LineComparison {

    private double x1, y1, x2, y2;

    // constructor for this class to initialize points for given line
    public LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Uc1: Calculate the length of a line
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Uc2: Check if two lines are equal or not based on end points
    public boolean equals(LineComparison otherLine) {
        return this.x1 == otherLine.x1 && this.y1 == otherLine.y1 &&
               this.x2 == otherLine.x2 && this.y2 == otherLine.y2;
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

         // taking input from user for line2
        System.out.println("Enter x1,y1,x2,y2 co-ordinates for line1: ");
        int x21 = sc.nextInt(),y21 = sc.nextInt(),x22=sc.nextInt(),y22=sc.nextInt() ;

        LineComparison line1 = new LineComparison(x11, y11, x12, y12);
        LineComparison line2 = new LineComparison(x21, y21, x22, y22);
        
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
