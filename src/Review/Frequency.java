package Review;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.frequency;

public class Frequency {
    public static void main(String[] args) throws InterruptedException {
        String s = "aaabbbcccddd";

        System.out.println(frequency(s, 'a'));
        System.out.println("------");
        System.out.println("Uniqe is " + uniqeCharakter(s));
        System.out.println(dublicateM(s));
        System.out.println(frequencyOfChar(s));

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int max = nums[0];
        int min = nums.length - 1;
        int indexOfMaxNum = 0;
        int indexOfMinNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexOfMaxNum = i;
            } else if (nums[1] < min) {
                min = nums[i];
            }

        }
        System.out.println(indexOfMaxNum);
        System.out.println(indexOfMinNum);

        int[] numss = {1, 2, 3, 4, 5};
        int[] rnums = new int[numss.length];
        for (int i = rnums.length - 1, j = 0; i >= 0; i--, j++) {
            rnums[j] = numss[i];
            System.out.print(rnums[j] + " ");
        }
        System.out.println();

        int x = 5;
        int y = 10;
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("x " + x + " y " + y);
        int[] xy = {1, 2, 3, 4, 5};
        for (int i = 0; i <= xy.length / 2; i++) {
            int temp = xy[i];
            xy[i] = xy[xy.length - 1 - i];
            xy[xy.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(xy));

        String [] students = {"Arif", "Akif", "Adil"};
        students = addelements(students, "Abdullah");
        System.out.println(Arrays.toString(students));

        int [] [] ab = {
                {1,3,4,5,6,7},
                {2,3,4,5,6,7},
                {9,8,7,6,5,4,3}
        };
        int maxnum = ab[0][0];
        for (int i = 0; i<ab.length;i++) {
            for (int j = 0; j < ab[i].length;j++){
                if (ab[i][j]>maxnum){
                    maxnum=ab[i][j];
                }
            }
        }
        System.out.println(maxnum);

        System.out.println(timeIsOut(2));




    }

    public static String  timeIsOut(int time) throws InterruptedException {
       for (int i = 0; i <time; i++){
           for (int j = 0; j <=59; j++){
               Thread.sleep(999);
           }
       }
       return "Time is UP";
    }
    public static String[] addelements(String [] add, String element){
        String [] newarr = new String[add.length+1];
        int i = 0;
        for (String each : add) {
            newarr[i++] = each;

        }
        newarr[i] = element;
         return newarr;
    }

    public static String frequencyOfChar(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!result.contains("" + c)) {
                result += c + " : " + frequency(s, c) + " | ";
            }
        }
        return result;
    }

    public static String dublicateM(String s) {
        String duRE = "";
        for (int i = 0; i < s.length(); i++) {
            String a = "" + s.charAt(i);
            if (!s.contains(a)) {
                duRE += a;
            }

        }
        return duRE;
    }

    public static int frequency(String s, char c) {
        int freNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                freNum++;

            }


        }
        return freNum;
    }

    public static String uniqeCharakter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequency(s, c) == 1) {
                result += c;
            }

        }
        return result;
    }



}
