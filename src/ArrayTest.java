import java.awt.*;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int arr2[] = new int[100];
        int[] arr3 = {1,2,3,5,78};

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);

        Point[] points = {new Point(1,1), new Point(2,3), new Point(4,1)};
        String[] tables = {"Pan", "Pani", "Państwo"};

        System.out.println(points[0].x);
        System.out.println(tables[4]);

        System.out.println(points.length);

    }

}
