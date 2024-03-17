import java.util.ArrayList;
import java.util.Arrays;

public class StrinArrlist {

    public static ArrayList<Integer> ReturnFound(ArrayList<String> a, String b){
       ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i <a.size(); i++) {
              if (a.get(i).equals(b)){
                  c.add(i);
              }
        }
        return c;
    }
    public static ArrayList<Integer> Duplicates(ArrayList<Integer>a,ArrayList<Integer>b) {
        ArrayList<Integer> d = new ArrayList<Integer>();
        if (a.size() > b.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (b.contains(a.get(i)) && !d.contains(a.get(i))) {
                    d.add(a.get(i));
                }
            }

        } else {
            for (int i = 0; i < b.size(); i++) {
                if (a.contains(a.get(i)) && !d.contains(b.get(i)))
                    d.add(b.get(i));
            }
        }
        return d;
    }


    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(Arrays.asList("Ahmed","Giu","Alex","Ahmed","Giu"));
        System.out.println(ReturnFound(a,"Giu"));
        ArrayList<Integer> b= new ArrayList<Integer>();
        ArrayList<Integer> c= new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(4);
        b.add(5);
        c.add(4);
        c.add(5);
        System.out.println(Duplicates(b,c));

    }
}
