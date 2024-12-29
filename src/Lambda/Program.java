package homeWorkLambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

class MultipleOfFivePredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number % 5 == 0;
    }
}

public class Program {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 1; i <= 20; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        filterCollection(arrayList, new MultipleOfFivePredicate());
        System.out.println("ArrayList (іменований клас): " + arrayList);

        filterCollection(linkedList, new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 5 == 0;
            }
        });
        System.out.println("LinkedList (анонімний клас): " + linkedList);

        filterCollection(arrayList, number -> number % 5 == 0);
        System.out.println("ArrayList (лямбда): " + arrayList);
    }

    public static <T> void filterCollection(List<T> list, Predicate<T> predicate) {
        list.removeIf(predicate.negate());
    }
}

