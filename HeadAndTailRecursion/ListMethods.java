
import java.util.*;

public class ListMethods
{
   public static ArrayList makeList(int n)
   {
      ArrayList tempList = null;
      int tempVar = n;
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;


      }
      else        // All other size lists are created here
      {
          
          tempList.add(tempVar-n);
          n = n-1;
          

      }
      return tempList;
   }
}