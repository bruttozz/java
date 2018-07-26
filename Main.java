import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        long ans = 0;
        Map<Integer, Integer>[] cnt = new Map[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = new HashMap<>(i);
            for (int j = 0; j < i; j++) {
                long delta = (long)A[i] - (long)A[j];
                if (delta < Integer.MIN_VALUE || delta > Integer.MAX_VALUE) {
                    continue;
                }
                int diff = (int)delta;
                int sum = cnt[j].getOrDefault(diff, 0);
                int origin = cnt[i].getOrDefault(diff, 0);
                cnt[i].put(diff, origin + sum + 1);
                ans += sum;
            }
        }
        //System.out.println(cnt);
        return (int)ans;
    }
}

public class Main{
  public static void main(String[] args){
    Solution solution = new Solution();
    System.out.println(solution.numberOfArithmeticSlices(new int[]{2,4,6}));
  }
}

/*public class PrettyPrintingMap<K, V> {
    private Map<K, V> map;

    public PrettyPrintingMap(Map<K, V> map) {
        this.map = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Entry<K, V>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<K, V> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();

    }


}
Map<String, String> myMap = new HashMap<String, String>();

System.out.println(new PrettyPrintingMap<String, String>(myMap));*/
/*
public class Main {
 public static void main(String[] args) {
  Map<String,String> map = new HashMap<String,String>();
  map.put("b","4");
  map.put("a","5");
  map.put("c","3");
  map.put("d","5");

  //通过map.keySet()方法
  //方法一：通过得到key的值，然后获取value;
  for(String key : map.keySet()){
   String value = map.get(key);
   System.out.println(key+"  "+value);
  }
  //使用迭代器，获取key;
  Iterator<String> iter = map.keySet().iterator();
  while(iter.hasNext()){
   String key=iter.next();
   String value = map.get(key);
   System.out.println(key+" "+value);
  }
  //通过map.entrySet()方法
  //方法一：循环map里面的每一对键值对，然后获取key和value
  for(Entry<String, String> vo : map.entrySet()){
   //vo.getKey();
   //vo.getValue();
   System.out.println(vo.getKey()+"  "+vo.getValue());
  }

  //使用迭代器，获取key
  Iterator<Entry<String,String>> iter = map.entrySet().iterator();
  while(iter.hasNext()){
   Entry<String,String> entry = iter.next();
   String key = entry.getKey();
   String value = entry.getValue();
   System.out.println(key+" "+value);
  }*/

  //将map<String,String> 转化为ArryList,但list里面的元素为Entry<String,String>
  /*List<Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
  Collections.sort(list,new Comparator<Entry<String,String>>(){
   @Override
   public int compare(Entry<String, String> o1,
     Entry<String, String> o2) {
    int flag = o1.getValue().compareTo(o2.getValue());
    if(flag==0){
     return o1.getKey().compareTo(o2.getKey());
    }
    return flag;
   }
  });
  //遍历list得到map里面排序后的元素
  for(Entry<String, String> en : list){
   System.out.println(en.getKey()+" "+en.getValue());
 }*/

 }


}
