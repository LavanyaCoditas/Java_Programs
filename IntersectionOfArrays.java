package CodingPractice;
import java.util.*;
public class IntersectionOfArrays
{
    public static void main(String[] args) {


    int arr1[]={1,2,3,4};
    int arr2[]={22,33,3,2,44};
    int n=(arr1.length)+(arr2.length);
    int new1[]=new int [n];
    int index=0;
    for(int i=0;i<arr1.length;i++)
    {
        for (int j = 0; j < arr2.length; j++)
        {
         if(arr1[i]==arr2[j])
         {
             new1[index]=arr1[i];
             index++;
         }

        }
    }for(int i=0;i<index;i++)
        System.out.print(new1[i]+" ");
}
}
