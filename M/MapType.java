package M;/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */

import java.util.HashMap;
import java.util.Map;


public class MapType {
    public static void main(String[] args) {
        Map<String, Integer> myMapType = new HashMap<String, Integer>();
        myMapType.put("Rahul",33);
        myMapType.put("Rohit",45);
        myMapType.put("Virat",18);
        myMapType.put("sachin",10);
        myMapType.put("a",33);
        myMapType.put("b",33);
        myMapType.put("c",33); // add and repalce


        System.out.println(myMapType.get("Rohit"));
        System.out.println(myMapType.keySet());
        System.out.println(myMapType.values());

        for (String key: myMapType.keySet()
             ) {
            System.out.println(  key + " : " + myMapType.get(key));

        }


    }
}
