package CodingPractice;

import java.util.ArrayList;

public class FrequencyCount
{
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('c');
        list.add('c');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('b');
        list.add('b');
        list.add('a');
        char ch='a';
        int count=0;
        for(int i =0;i<list.size();i++)
        {

            if(list.get(i)==ch)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

