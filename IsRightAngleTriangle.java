public class IsRightAngleTriangle {
    public static void main(String[] args) {
        if (isRight(1, 1, 1) == true) {
            System.out.println("Right Angle Triangle");
        } else {
            System.out.println("Not Right Angle Triangle");
        }
    }

    static boolean isRight(int side1, int side2, int side3) {
        if ((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2))
            return true;
        if ((Math.pow(side2, 2) + Math.pow(side1, 2)) == Math.pow(side3, 2))
            return true;
        if ((Math.pow(side3, 2) + Math.pow(side2, 2)) == Math.pow(side1, 2))
            return true;
        else
            return false;
    }
}