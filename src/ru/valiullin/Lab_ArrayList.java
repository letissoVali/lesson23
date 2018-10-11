package ru.valiullin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Lab_ArrayList {

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            for (Integer i = 0; i < 15; i++) {
                list.add(i.toString());
            }
            System.out.println(list);

            list.add(5, "100");
            System.out.println(list);

            list.add(5, "100");
            list.add(5, "100");
            System.out.println(list);

            list.remove(5);
            System.out.println(list);
            list.remove("100");
            System.out.println(list);

            System.out.println(list.size());
            System.out.println(list.isEmpty());

            List<String> donor = new ArrayList<>();
            donor.add("a");
            donor.add("b");
            donor.add("c");
            list.addAll(donor);
            System.out.println(list);

            System.out.println(list.contains("100"));
            System.out.println(list.containsAll(donor));

            list.removeAll(donor);
            System.out.println(list);

            list.add("a");
            list.add("c");
            list.retainAll(donor);
            System.out.println(list);

            String[] strings = list.toArray(new String[0]);
            System.out.println(Arrays.toString(strings));

            list = Arrays.asList(strings);
            System.out.println(list);
        }
    }
