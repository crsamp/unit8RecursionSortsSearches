import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(0);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
      }
      
      ArrayList<Integer> tempList2 = ListMethods.makeList(5);
      System.out.println(tempList2);
      System.out.println(ListMethods.reverseList(tempList2));
   }
}
