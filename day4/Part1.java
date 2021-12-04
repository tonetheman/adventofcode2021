
import java.util.*;

public class Part1 {


    public static void main(String[] args) throws Exception {
        String filename = "example.txt";
        ArrayList<String> data = utils.readfile(filename);

        int index = 0;
        String [] snums = data.get(index).split(",");
        index++;
        utils.pa(snums);

        // now read the bingo cards one by one
    }
}