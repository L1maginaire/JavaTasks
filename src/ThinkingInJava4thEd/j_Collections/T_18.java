package ThinkingInJava4thEd.j_Collections;

import java.util.*;

public class T_18 {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("a", 44);
//        hashMap.put("c", 12);
//        hashMap.put("b", 52);
//        hashMap.put("d", 6);
//        System.out.println(hashMap);
//        Set<String> set = new HashSet<>(hashMap.keySet());
//        System.out.println(set);
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        for (String s : set) {e
//            linkedHashMap.put(s, hashMap.get(s));
//        }
//        System.out.println(linkedHashMap);
//    }
//}
        public static void main (String[]args){
            Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
            gerbils.put("Fuzzy", new Gerbil(0));
            gerbils.put("Spot", new Gerbil(1));
            gerbils.put("Speedy", new Gerbil(2));
            gerbils.put("Dopey", new Gerbil(3));
            gerbils.put("Sleepy", new Gerbil(4));
            gerbils.put("Happy", new Gerbil(5));
            gerbils.put("Funny", new Gerbil(6));
            gerbils.put("Silly", new Gerbil(7));
            gerbils.put("Goofy", new Gerbil(8));
            gerbils.put("Wowee", new Gerbil(9));
            System.out.println(gerbils);
            System.out.println();
            Set<String> hashedKeys =
                    new HashSet<String>(gerbils.keySet());
            System.out.println("HashSet: " + hashedKeys);
            System.out.println();
            Map<String, Gerbil> hashedGerbils =
                    new LinkedHashMap<String, Gerbil>();
            for (String s : hashedKeys) {
                System.out.print("Adding " + s + ", ");
                hashedGerbils.put(s, gerbils.get(s));
            }
            System.out.println();
            System.out.println();
            System.out.println("From HashSet: " + hashedGerbils);

            System.out.println();
            Set<String> linkedHashedKeys =
                    new LinkedHashSet<String>(gerbils.keySet());
            System.out.println("LinkedHashSet: " + linkedHashedKeys);
            System.out.println();
            Map<String, Gerbil> linkedHashedGerbils =
                    new LinkedHashMap<String, Gerbil>();
            for (String s : linkedHashedKeys) {
                System.out.print("Adding " + s + ", ");
                linkedHashedGerbils.put(s, gerbils.get(s));
            }
            System.out.println();
            System.out.println();
            System.out.println("From LinkedHashSet: "
                    + linkedHashedGerbils);
        }
    }
