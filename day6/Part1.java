
import java.util.*;

class Fish {
    int state;
    public Fish(int state) {
        this.state = state;
    }
}

public class Part1 {


    public static void print_fish(Fish[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i].state);
        }
    }

    public static String repr(ArrayList<Fish> a) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<a.size();i++) {
            sb.append(a.get(i).state);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static int add(ArrayList<Fish> states) {
        int total = 0;
        for (int i=0;i<states.size();i++) {
            total += states.get(i).state;
        }
        return total;
    }

    public static void sim(ArrayList<Fish> states) {
        int len = states.size();
        for(int i=0;i<len;i++) {
            Fish f = states.get(i);
            if (f.state==0) {
                // spawn
                // need to push on the end
                states.add(new Fish(8));
                f.state = 6;
            } else {
                f.state--;
            }
        }
    }

    public static void main(String[] args) {
        // example
        String initial_state = "3,4,3,1,2";

        // real problem
        initial_state = "1,4,3,3,1,3,1,1,1,2,1,1,1,4,4,1,5,5,3,1,3,5,2,1,5,2,4,1,4,5,4,1,5,1,5,5,1,1,1,4,1,5,1,1,1,1,1,4,1,2,5,1,4,1,2,1,1,5,1,1,1,1,4,1,5,1,1,2,1,4,5,1,2,1,2,2,1,1,1,1,1,5,5,3,1,1,1,1,1,4,2,4,1,2,1,4,2,3,1,4,5,3,3,2,1,1,5,4,1,1,1,2,1,1,5,4,5,1,3,1,1,1,1,1,1,2,1,3,1,2,1,1,1,1,1,1,1,2,1,1,1,1,2,1,1,1,1,1,1,4,5,1,3,1,4,4,2,3,4,1,1,1,5,1,1,1,4,1,5,4,3,1,5,1,1,1,1,1,5,4,1,1,1,4,3,1,3,3,1,3,2,1,1,3,1,1,4,5,1,1,1,1,1,3,1,4,1,3,1,5,4,5,1,1,5,1,1,4,1,1,1,3,1,1,4,2,3,1,1,1,1,2,4,1,1,1,1,1,2,3,1,5,5,1,4,1,1,1,1,3,3,1,4,1,2,1,3,1,1,1,3,2,2,1,5,1,1,3,2,1,1,5,1,1,1,1,1,1,1,1,1,1,2,5,1,1,1,1,3,1,1,1,1,1,1,1,1,5,5,1";

        String[] s_states = initial_state.split(",");
        ArrayList<Fish> states = new ArrayList<Fish>(s_states.length);

        for(int i=0;i<s_states.length;i++) {
            states.add(new Fish(Integer.parseInt(s_states[i])));
        }

        //print_fish(states);
        System.out.println("Initial state: " + repr(states));

        // simulate
        int day = 1;
        for (int i=0;i<80;i++) {
            sim(states);
            System.out.println("After " + day + " day: " + repr(states));    
            day++;
        }

        System.out.println("total: " + states.size());
    }



}