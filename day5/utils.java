import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class utils {    
    
public static int[] ca_string_to_int(String[] a) throws Exception{
    int[] res = new int[a.length];
    for (int i=0;i<a.length;i++) {
        res[i] = Integer.parseInt(a[i]);
    }
    return res;
}

public static void pa(String[] a) {
    for (int i=0;i<a.length;i++) {
        System.out.println(a[i]);
    }
}

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

    
}
