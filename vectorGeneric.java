//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

import java.util.*;

public class vectorGeneric{
  public static void main(String args[])
  {                       // vector storing only ints
    Vector<Integer> vect1 = new Vector<Integer>();
    vect1.add(10);
    vect1.add(11);
    vect1.add(12);
    vect1.add(13);
                       // vector storing only strings
    Vector<String> vect2 = new Vector<String>();
    vect2.add("zero");
    vect2.add("one");
    vect2.add("two");
    vect2.add("three");
    vect2.add("four");
    vect2.add("five");

    List<String> numbersList = vect2.subList(1, 6);
    System.out.println("Elements of subList: " + numbersList);

    System.out.println("Original values vect2: " + vect2);
    Collections.swap(vect2, 2, 4);
    System.out.println("After swapping 2 and 4: " + vect2);

    System.out.println("Maximum value of vect1: " + Collections.max(vect1));
    System.out.println("Maximum value of vect2: " + Collections.max(vect2));

    System.out.println("Minimum value of vect1: " + Collections.min(vect1));
    System.out.println("Minimum value of vect2: " + Collections.min(vect2));

    Vector<Integer> vect3 = new Vector<Integer>();
    vect3.add(50);
    vect3.add(60);
    vect3.add(70);
    vect3.add(80);
    System.out.println("Original values vect3: " + vect3);
    vect1.addAll(vect3);
    System.out.println("After adding vect3 to vect1, vect1 values: " + vect1);

    Collections.reverse(vect3);
    System.out.println("Reversed values vect3: " + vect3);

    System.out.println("Original values vect1: " + vect1);
    Collections.shuffle(vect1);
    System.out.println("1st Shuffling vect1: " + vect1);
    Collections.shuffle(vect1);
    System.out.println("2nd Shuffling vect1: " + vect1);

    Collections.rotate(vect1, 3);
    System.out.println("vect1 values after rotating: " + vect1);

    Collections.fill(vect1, 100);
    System.out.println("vect1 after filling with 100: " + vect1);

    vect1.clear();
    System.out.println("vect1 size after calling clear(): " + vect1.size());

   String str = vect3.toString();
   System.out.println("vect3 as string: " + str);
 }
}
