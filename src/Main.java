import java.util.HashMap;
import java.util.Map;

/*
Дана Map<String, String>, необходимо написать метод swapValue(Map<String,String> map, String key1,
 String key2), который поменяет местами значения для 2х заданных ключей. Если ключ(и) отсутствует
 в данной map, нужно создать соответствующие ключи со значением пустая строка.

Примеры: Пусть дана map {"a": "Bill", "b": "Ann"}
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a", "Bill");
        map.put("b", "Ann");

        System.out.println("Before changing " + map);

        //виклик метода свапВалує для обміну значень
        swapValue(map, "a", "b");
        System.out.println("After swapValue (a,b): " + map);// a-Ann, b- Bill

        //тест з відсутніми ключами
        swapValue(map,"j", "b");
        System.out.println("After swapValue (j,b): " + map);

        swapValue(map, "j","k");
        System.out.println("After swapValue (j,k): " + map);


    }
    //метод для обміну значень для 2 ключів
    public static void swapValue (Map<String, String> map, String kej1, String kej2){
        //отримуєм значення для ключів
        String value1 = map.getOrDefault(kej1, "");
        String value2 = map.getOrDefault(kej2, "");

        if (map.containsKey(kej1) && map.containsKey(kej2)){
            map.put(kej1, value2);
            map.put(kej2, value1);
        }else {
            map.putIfAbsent(kej1, "");
            map.putIfAbsent(kej2, "");


            map.put(kej1, value1);
            map.put(kej2, value2);
        }

    }
}