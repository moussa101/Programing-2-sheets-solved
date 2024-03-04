import java.util.ArrayList;
import java.util.Arrays;

public class StrinArrlist {

    public static ArrayList<Integer> ReturnFound(ArrayList<String> a, String b){
       ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i <a.size(); i++) {
           for(String s : a){
               if (s.equals(b) && !c.contains(a.indexOf(s)))
                   c.add(a.indexOf(s));
           }
        }

        return c;

    }
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(Arrays.asList("Ahmed","Giu","Alex","Ahmed","Giu"));
        System.out.println(ReturnFound(a,"Giu"));

    }
}
