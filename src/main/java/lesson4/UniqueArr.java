package lesson4;

//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.



import java.util.*;



public class UniqueArr {

        public static void main (String[]args){
            ArrayList<String> arr = new ArrayList();

            arr.add ("Mom");
            arr.add("Ann");
            arr.add("Ben");
            arr.add("Ann");
            arr.add("Ted");
            arr.add("Pol");
            arr.add("Mom");
            arr.add("Ted");
            arr.add("Gal");
            arr.add("Pol");
           // arr.forEach(System.out::println);

            System.out.println("Unique: ");
            Set<String> unique = new HashSet<>(arr);
            unique.forEach(System.out::println);

            System.out.println();


            System.out.println("Total:");
            Map<String, Integer> wordsCount = new HashMap<>();
            for (String s : arr) {
                wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
            }
            wordsCount.entrySet().forEach(System.out::println);

        }
    }

