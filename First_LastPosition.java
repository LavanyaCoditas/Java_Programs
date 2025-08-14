package CodingPractice;

public class First_LastPosition
{
    public static void main(String[] args)
    {
        int arr[]={2,1,3,4,1,2,1,21,0,1};
        int target =1;
        int first =-1;
        int last =-1;
        for (int i = 0; i < arr.length; i++)
        {

         if (arr[i]==target)
         {
             first=i;
            break;
         }


            }
        for (int j = arr.length-1; j >=0; j--)
        {
            if (arr[j]==target)
            {
                last =j;
                break;
            }
        }
        System.out.println("first : "+first+"  last :"+last);

    }
}
