
import java.util.*;

public class Part1 {

    public static void p(int[][] a) {
        for(int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> data = utils.readfile("input.txt");
        utils.pa(data);
        int[][] idata = new int[data.size()][data.get(0).length()];
        for(int i=0;i<data.size();i++) {
            String line = data.get(i);
            for (int j=0;j<line.length();j++) {
                idata[i][j] = line.charAt(j)-'0';
            }
        }
        System.out.println();
        p(idata);

        // find risk
        int risk = 0;

        for(int i=0;i<idata.length;i++) {
            for (int j=0;j<idata[i].length;j++) {
                
                boolean top = false;
                boolean bottom = false;
                boolean left = false;
                boolean right = false;
                
                int current = idata[i][j];

                // top
                if (i>=1) {
                    int other = idata[i-1][j];
                    if (other>current) {
                        top = true;
                    } else {
                        top = false;
                    }
                } else {
                    top = true;
                }
                // bottom
                if (i<idata.length-1) {
                    int other = idata[i+1][j];
                    if (other>current) bottom = true;
                } else {
                    bottom = true;
                }
                // left
                if (j>=1) {
                    int other = idata[i][j-1];
                    if (other>current) left = true;
                } else {
                    left = true;
                }
                // right
                if (j<idata[i].length-1) {
                    int other = idata[i][j+1];
                    if (other>current) right = true;
                } else {
                    right = true;
                }

                if (top && bottom && left && right) {
                    System.out.println("got one");
                    System.out.println(i + " " + j);
                    risk += current+1;
                }

            }
        }
        System.out.println("rsik: " + risk);
    }

}