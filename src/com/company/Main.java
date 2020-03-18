package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Hashtable - хэш таблица
        Пары : ключ-значение
        nullы нельзя
        все методы synchronized - могут быть со скоростью
        выполнение любой операции начинается с вычисления хэша от ключа
         - является индексом
         неупорядочено (зависит от хэш функции)
        */
        Hashtable phones = new Hashtable();
        phones.put("Ivan","12222");
        phones.put("Andrei","6644");
        phones.put("Petr","5543");

        Enumeration keys = phones.keys();
        while(keys.hasMoreElements()) {
            String user = (String) keys.nextElement();
            String value = (String) phones.get(user);
            System.out.println("user:"+user+";"+value);
        }


        /*
        HashMap - аналогично hashtable, можно null
        * */

        Map<String, String> map = new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        System.out.println(map);

        Map<String, String> map2 = new HashMap<String,String>();
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");

        // добавление набора данных
        map.putAll(map2);

        String exists = (map.containsKey("key2")) ? "found" : "not found";

        // перебор всех значений hashmap
        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> i: set) {
            // i.getKey();
            // i.getValue();
        }

/* LinkedHashMap
* Упорядоченная реализация, в который есть связи пред. и след.
* */

        LinkedHashMap<String,Double> courses = new LinkedHashMap<String,Double>();
        courses.put("USD",77.6);
        courses.put("EUR",85.3);
        courses.put("CZK",2.4);

        for(String key: courses.keySet()) {
            System.out.println(key + courses.get(key));
        }


        /* TreeMap
        Сортируется по ключам - natural ordering
        своя сортировка - Comparator

         */

        TreeMap<Integer,String> weeks = new TreeMap<Integer,String>();
        weeks.put(1,"Понедельник");
        weeks.put(2,"Вторник");
        weeks.put(3,"Среда");

        System.out.println(weeks.keySet());
        System.out.println(weeks.values());

        System.out.println(weeks.get(weeks.firstKey()));
    }
}
