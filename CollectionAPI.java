import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionAPI { 
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        nums.add(4);
        nums.add(3);
        nums.add(5);
        nums.add(6);
        nums.add(6);

        // Collections.sort(nums);
        // System.out.println(nums);

        for(int n : nums) {
            // System.out.println(n);
        }
        System.out.println();

        Iterator<Integer> values = nums.iterator();
        // while(values.hasNext()) {
            // System.out.println(values.next());
        // }


        Map<String, Integer> students = new HashMap<>();
        students.put("John", 20);
        students.put("Jane", 21);
        students.put("Anjali", 1);
        students.put("Anjali", 4);

        // System.out.println(students);
        // System.out.println(students.keySet());
        // System.out.println(students.get("Anjali"));

        for(String key : students.keySet()) {
            // System.out.println(key + " : " + students.get(key));
        }



        // Comparator<Integer> comp = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if(i%10 > j%10)
        //             return 1;
        //         else    
        //             return -1;
        //     }
        // };

        // using lambda expression
        Comparator<Integer> comp = (i,j) -> i%10 > j%10 ? 1 : -1;

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(44);
        arr.add(31);
        arr.add(50);
        arr.add(65);
        arr.add(62);

        Collections.sort(arr, comp);
        // System.out.println(arr);


    }
}
