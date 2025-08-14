package CodingPractice;

public class PartitionUsingPivot
{
    public static void main(String[] args) {
        int pivot=3;
        int []arr={211,11,221,22,3};
        int j= arr.length-1;
        int i=0;
        while(i<j)
        {
            if (arr[i] <= pivot)
            {
                i++;
            } else if (arr[i]>pivot && arr[j]<=pivot)
            {
               int temp= arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j--;
               i++;
            }
            else if (arr[i]>pivot && arr[j]>pivot)
            {
                j--;
            }
        }
         for(int index: arr)
         {
             System.out.print(index+" ");
         }

    }
}
