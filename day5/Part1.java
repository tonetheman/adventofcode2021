
import java.util.*;

class Point {
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String repr() {
        return x + " " + y;
    }
    public String toString() {
        return x + " " + y;
    }
}

class Grid {
    int []data;
    void init() {
        for(int i=0;i<50;i++) {
            for (int j=0;j<50;j++) {
                set(i,j,0);
            }
        }
    }
    void set(int x, int y, int val) {
        this.data[y*50+x] = val;
    }
    Grid() {
        data = new int[50*50];
        init();
    }
}

public class Part1 {
    
    static String ps(String[] a) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<a.length;i++) {
            sb.append(a[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static Point[] parseline(String tmp) throws Exception {
        Point[] res = new Point[2];
 
        String[] data1 = tmp.split("->");
        String[] data2 = data1[0].split(",");
        String[] data3 = data1[1].split(",");
        int val1 = Integer.parseInt(data2[0].trim());
        int val2 = Integer.parseInt(data2[1].trim());
        int val3 = Integer.parseInt(data3[0].trim());
        int val4 = Integer.parseInt(data3[1].trim());
 
        res[0] = new Point(val1,val2);
        res[1] = new Point(val3,val4);

        return res;
    }

    static void pp(Point[] a) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<a.length;i++) {
            sb.append(a[i].repr());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void drawline(Grid grid, Point[] a) {

    }
    
    public static void main(String[] args) throws Exception {
        ArrayList<String> data = utils.readfile("example.txt");

        Grid grid = new Grid();

        for(int i=0;i<data.size();i++) {
            Point[] points = parseline(data.get(i));
            
            // only horizon or vert
            if ((points[0].x==points[1].x) || (points[0].y==points[1].y)) {
                pp(points);

                drawline(grid, points);

            }
        }


    }

}