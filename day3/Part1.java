
import java.io.*;
import java.util.ArrayList;

class Counter {
    int zero;
    int one;
}

public class Part1 {

    public static ArrayList<String> readfile(String filename) throws Exception {
        ArrayList<String> res = new ArrayList<String>();
        BufferedReader inf = new BufferedReader(new FileReader(filename));
		String line = null;
		while (true) {
			line = inf.readLine();
			if (line==null) {
				break;
			}
            res.add(line);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        
        String filename = "example.txt";

        ArrayList<String> data = readfile(filename);
        Counter []counts = new Counter[data.size()];
        for(int i=0;i<data.size();i++) {
            String line = data.get(i);
            for (int j=0;j<line.length();j++) {
                char c = line.charAt(j);
                Counter cc = counts[i];
                if (cc==null) {
                    cc = new Counter();
                    counts[i] = cc;
                }
                if (c=='0') {
                    cc.zero++;
                } else if (c=='1') {
                    cc.one++;
                }
            }
        }

        for (int i=0;i<counts.length;i++) {
            Counter c = counts[i];
            System.out.println(c.zero + " " + c.one);
        }

    }


}