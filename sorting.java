import java.util.*;
public class sorting {
    public static void main(String args[])
    { 
        String[] names = { "Sarthk", "Saumya", "Mayank", "Mudit", "Shiva", "Anju",
                "Savita" };
        System.out.println("names array before sorting");
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " , ");
        System.out.println();
        Arrays.sort(names);
        System.out.println("names array after sorting");
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " , ");
        System.out.println();
     }

    }
