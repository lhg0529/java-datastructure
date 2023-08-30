package list;

import java.util.ArrayList;

public class ArrListTest {
  public static void main(String[] args) {
    ArrList<Integer> list = new ArrList<>();
    System.out.println(list.size());
//    list.add(10);
//    System.out.println(list.get(0));

    ArrayList<Integer> aList = new ArrayList<>();
    System.out.println(aList.size());
    aList.add(10);
    System.out.println(aList.get(0));
  }
}
