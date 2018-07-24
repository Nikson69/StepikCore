package generics.block2;

import java.util.HashSet;
import java.util.Set;

/*
Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример

Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */
public class Unit14 {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set a = new HashSet(set1);
        Set b = new HashSet(set2);
        a.removeAll(set2);
        b.removeAll(set1);
        a.addAll(b);
        return a;
    }
}
