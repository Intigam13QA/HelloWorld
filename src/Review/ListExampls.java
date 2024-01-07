package Review;

import sun.net.www.content.text.Generic;

import java.util.*;
import java.util.function.Predicate;

public class ListExampls {
    public static void main(String[] args) {
        List<Integer> count = new ArrayList<>();
        count.add(10);
        count.add(1);
        count.add(2);
        count.add(3);
        count.add(3);
        count.add(4);
        count.add(0);
        count.add(5);
        Predicate<Integer> isEven = even -> even%2 ==0;
        count.remove(isEven);
        System.out.println(count);


        int commonNum = 0;
        int minNum = 0;
        Collections.sort(count);
        int maxNum = Collections.max(count);

        for (int i = count.size()-1; i >0; i --) {
            System.out.println(count.get(i));

        }
        System.out.println("---------");
        for (int i = 0; i < count.size(); i++) {
           commonNum+= count.get(i);
           minNum = count.get(0);
            if (count.get(i)< minNum){
                minNum = count.get(i);
            }
            
        }
        System.out.println(commonNum/2);
        System.out.println(minNum);
        System.out.println(maxNum);

    }
}
