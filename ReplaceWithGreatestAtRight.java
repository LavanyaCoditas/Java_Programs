package CodingPractice;

public class ReplaceWithGreatestAtRight
{
    //Description: Replace each element with the greatest element to its right. The last element becomes -1.
    //Example: Input: [17, 18, 5, 4, 6, 1] → Output: [18, 6, 6, 6, 1, -1]
    //Constraints: Modify in place.
    //Hint: Iterate from right to left, keeping track of the maximum
    public static void main(String[] args) {
        int arr[]={1,18,918,-1,90,1};
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < arr.length; i++)
        {

            for (int j = i+1; j <arr.length ; j++)
            {
                if(max<arr[j])
                {
                    max=arr[j];
                }

            }
            arr[i]=max;
            max=Integer.MIN_VALUE;
            if(i== arr.length-1)
            {
                arr[i]=-1;
            }


        }
        for (int x: arr)
        {
            System.out.print(" "+x);
        }
    }
}
