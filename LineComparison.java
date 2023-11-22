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

    public static void main(String[] args) {

        // welcome message on main branch
        System.out.println("Welcome to Line Comparison Computation Program!!");

        Scanner sc = new Scanner(System.in);

        // taking input from user for line1
        System.out.println("Enter x1,y1,x2,y2 co-ordinates for line1: ");
        int x11 = sc.nextInt(), y11 = sc.nextInt(), x12 = sc.nextInt(), y12 = sc.nextInt();

        LineComparison line1 = new LineComparison(x11, y11, x12, y12);

        System.out.println("Length of Line 1: " + line1.calculateLength());

        sc.close();

    }
}
