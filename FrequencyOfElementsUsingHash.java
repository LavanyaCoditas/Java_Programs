package CodingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElementsUsingHash
{
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
       String s[]= line.split(" ");
     for(String s1 : s )
     {
         if(map1.get(s1)==null)
         {
             //pust the word and its frequency as a key and value
             map1.put(s1,1);
         }
         else {
             //       (word, previous freq+ 1)
             map1.put(s1, map1.get(s1)+1);
         }
     }
        System.out.println(map1);
    }
}
