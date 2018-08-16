import java.util.*;

public class deque {
  public static void main(String[] args){
    Deque a = new ArrayDeque();
    //Deque<TreeNode> stack = new ArrayDeque<>();
    a.add("element 0");
    a.addFirst("element 1");
    a.addFirst("element 2");
    a.addLast("element 3");
    a.add("element 4");
    a.remove();
    a.removeLast();
    a.removeFirst();

    /*Iterator iterator = a.iterator();
    while(iterator.hasNext()){
      //int b = (int)a.iterator();
      String element = (String) iterator.next();
      System.out.println(element);
    }*/

    for(Object object : a){
      System.out.println(object);
    }
  }
}
