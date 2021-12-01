
import java.io.*;


public class Prog {


	public static void main(String[] args) throws Exception {
		String filename = args[args.length-1];

		int start = -1;
		int increase = 0;

		BufferedReader inf = new BufferedReader(new FileReader(filename));
		String line = null;
		while (true) {
			line = inf.readLine();
			if (line==null) {
				break;
			}
			int newvalue = Integer.parseInt(line);
			if (newvalue>start) {
				if (start==-1) {
				} else {
					increase++;
				}
			}
			start = newvalue;
		}

		System.out.println("increase count: " + increase);	
	}

}
