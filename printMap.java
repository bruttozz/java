public class printMap {
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
    Iterator<Entry<String,String>> itera = map.entrySet().iterator();
    while(itera.hasNext()){
      Entry<String,String> entry = itera.next();
      String key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key+" "+value);
    }
  }
}
