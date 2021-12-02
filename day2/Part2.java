
import java.io.*;

public class Part2 {

    public static void main(String[] args) throws Exception {
        String filename = args[args.length-1];

        int x = 0, y = 0;
        int aim = 0;

        BufferedReader inf = new BufferedReader(new FileReader(filename));
		String line = null;
		while (true) {
			line = inf.readLine();
			if (line==null) {
				break;
			}
            String []data = line.split(" ");
            String cmd = data[0];
			int val = Integer.parseInt(data[1]);

            System.out.println(cmd + " " + val);
            if ("forward".equals(cmd)) {
                x += val;
                y += (val*aim);
            } else if ("up".equals(cmd)) {
                //y -= val;
                aim -= val;
            } else if ("down".equals(cmd)) {
                //y += val;
                aim += val;
            }
        }
        System.out.println(x + " " + y);
        System.out.println(x*y);
    }

}
