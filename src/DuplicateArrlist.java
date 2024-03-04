import java.util.*;
public class DuplicateArrlist {

    public static ArrayList<Integer> removeDub(ArrayList<Integer> a){
        ArrayList<Integer> c = new ArrayList<Integer>();
       for ( Integer num : a){
           if(!c.contains(num)){
               c.add(num);
           }
       }
       return c;
    }
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            ArrayList<Integer> nigga = new ArrayList<Integer>();
            nigga.addAll(Arrays.asList(1,2,3,4,5,5,6,7,7,10));
        System.out.println(removeDub(nigga));


    }
}
