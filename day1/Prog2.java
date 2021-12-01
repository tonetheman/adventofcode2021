
import java.io.*;


public class Prog2 {

	public static void pa(int pos, int[] a) {
		System.out.println(pos + " " + a[0] + " " + a[1] + " " + a[2]);
	}

	public static int _sum(int[] a) {
		return a[0] + a[1] + a[2];
	}

	public static boolean haszero(int[] a) {
		if (a[0]==0) return true;
		if (a[1]==0) return true;
		if (a[2]==0) return true;
		return false;
	}

	public static void main(String[] args) throws Exception {
		String filename = args[args.length-1];

		int [] window = new int[3];
		int pos = 0;

		int start = 0;
		int increase = 0;
		BufferedReader inf = new BufferedReader(new FileReader(filename));
		String line = null;
		while (true) {
			line = inf.readLine();
			if (line==null) {
				break;
			}
			int newvalue = Integer.parseInt(line);

			window[pos] = newvalue;
			pos++;
			if (pos>2) {
				pos = 0;
			}
			pa(pos,window);
			if (haszero(window)) {
				continue;
			}

			int s = _sum(window);
			//System.out.println(s);
			if  (start==0) {
				// do nothing
			} else {
				if (s>start) {
					increase++;
				}
			}
			start = s;

		}
		System.out.println("increase: " + increase);
	}

}
