
import java.util.*;


public class Part1 {


    public static void main(String[] args) throws Exception {
        String filename = "example.txt";
        filename = "input.txt";
        ArrayList<String> data = utils.readfile(filename);

        int count = 0;

        for(int i=0;i<data.size();i++) {
            String line = data.get(i);
            System.out.println(line);
            String[] back = line.split(" ");

            // 11 12 13 14 are the ones that need to be looked at
            if (back[11].length()==2) count++;
            if (back[12].length()==2) count++;
            if (back[13].length()==2) count++;
            if (back[14].length()==2) count++;

            if (back[11].length()==4) count++;
            if (back[12].length()==4) count++;
            if (back[13].length()==4) count++;
            if (back[14].length()==4) count++;

            if (back[11].length()==3) count++;
            if (back[12].length()==3) count++;
            if (back[13].length()==3) count++;
            if (back[14].length()==3) count++;

            if (back[11].length()==7) count++;
            if (back[12].length()==7) count++;
            if (back[13].length()==7) count++;
            if (back[14].length()==7) count++;


        }

        System.out.println(count);
    }
    
}
