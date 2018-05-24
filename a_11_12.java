import java.util.*;

public class a_11_12 {

    /*
    12. Write a method contains3 that accepts a list of strings as a parameter and returns true
    if any single string occurs at least 3 times in the list,
    and false otherwise. Use a map as auxiliary storage.
     */

    public static void main(String[] args) {

        List<String> testList1 = new LinkedList<>();
        List<String> testList2 = new LinkedList<>();

        testList1.add("Hej");
        testList1.add("Nej");
        testList1.add("Hej");
        testList1.add("Hej");
        testList1.add("Hej");
        testList1.add("Hej");

        testList2.add("Hej");
        testList2.add("med");
        testList2.add("dig");

        System.out.println("Result should be true: " + contains3(testList1));
        System.out.println("Result should be false: " + contains3(testList2));
    }

    public static boolean contains3(List<String> list) {

        Map<String, Integer> testMap = new HashMap<>();

        Iterator<String> iter = list.iterator();

        boolean returnBoolean = false;

        while (iter.hasNext()) {

            String str = iter.next();

            if (testMap.containsKey(str)) {

                testMap.put(str, testMap.get(str) + 1);
            } else {

                testMap.put(str, 1);
            }
        }

        for (int i = 3; i < 500; i++) {

            if (testMap.containsValue(i)) {

                returnBoolean = true;
            }
        }

        return returnBoolean;
    }
}
