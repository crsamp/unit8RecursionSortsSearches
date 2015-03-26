import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = null;
        if (n <= 0)  // The smallest list we can make
        {
            tempList = new ArrayList<Integer>();

        }
        else        // All other size lists are created here
        {
            tempList = makeList(n-1);
            tempList.add(n);

        }
        return tempList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list)
    {
        ArrayList<Integer> clonedList = deepClone(list);
        ArrayList<Integer> tempList = null;

        if (clonedList.size()<=1)
        {
            return clonedList;
        }
        else
        {
            int removed = clonedList.get(0);
            clonedList.remove(0);
            tempList = reverseList(clonedList);
            tempList.add(removed);
            
            

        }
        
        return tempList;
    }

}