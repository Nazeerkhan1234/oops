import java.io.*;
import java.util.*;

// doubt
class Comparable3 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    ArrayList list = new ArrayList();
    list.add(10);
    list.add("hello");
    list.add(false);
    list.add('c');

    for(Object o: list){
      System.out.println(o);
    }
  }

 

}
