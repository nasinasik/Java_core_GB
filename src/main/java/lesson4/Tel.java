package lesson4;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

// Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
// искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
// (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
public class Tel {
  

    private static HashMap<String, Integer> phonebook = new HashMap<>();


    public static void main(String[] args) {

            phonebook.put("Snow", 222);
            phonebook.put( "Jackson" ,333);
            phonebook.put("Snow", 444);
            phonebook.put("Davidson", 555);
            phonebook.put("Robson", 666);
            List list = null;
            for (Map.Entry<String, Integer> o : phonebook.entrySet()) {
                System.out.println(o.getKey() + ": " + o.getValue());


            }
//        phonebook.forEach((key, value) -> {
//            System.out.printf("key=%s, val=%s \n", key, phonebook.get(key));
//        }        );
        Set<Object> uniqueValues = new HashSet<Object>(phonebook.values());
        Set<Object> uniqueKeys = new HashSet<Object>(phonebook.keySet());

        System.out.println(phonebook.get("Snow"));
    }
}
