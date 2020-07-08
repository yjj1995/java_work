package day10;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test6 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("b",1);
        map.put("c",2);
        map.put("d",2); // key-values key必须不同，values可以相同
        System.out.println(map);
        System.out.println(map.get("b"));// 根据key取值
        map.remove("c");//根据key移除键值对
        System.out.println(map.size());//map集合的长度
        System.out.println(map.containsKey("b"));//是否包含指定的key
        System.out.println(map.containsValue(1));//是否包含指定的values
//        map.clear();//清空
        //遍历
        //1
        Set<String> keys = map.keySet();//获取所有key的集合
        map.values();//获取所有的values
        for (String key:keys){
            System.out.println("key:"+key+",value:"+map.get(key));

        }
        //2
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer>en:entries){
            System.out.println("key:"+en.getKey()+",value:"+en.getValue());

        }
        Map<Integer,String> map1 = new TreeMap<Integer, String>();
        map1.put(4,"a");
        map1.put(3,"ab");
        map1.put(2,"vv");
        map1.put(1,"avvv");

        Map<String,String> map2 = new TreeMap<String, String>(); // 字符串的自然排序是字典排序,英文字典排序
        map2.put("4","a");
        map2.put("3","ab");
        map2.put("2","vv");
        map2.put("1","avvv");



    }
}
