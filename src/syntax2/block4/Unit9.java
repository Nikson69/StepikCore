package syntax2.block4;
/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример

Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 */
public class Unit9 {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays ( int[] a1, int[] a2){
        int k = 0, j = 0;
        int[] m = new int[a1.length + a2.length];
        for (int i = 0; i < m.length; i++) {
            if (a1[k] < a2[j]) {
                m[i] = a1[k];
                if (k != a1.length - 1) {
                    k++;
                } else if (k == a1.length - 1) {
                    k = a1.length - 1;
                    a1[k] = Math.abs(a2[a2.length - 1] + a1[a1.length - 1]);
                }
            } else if (a1[k] > a2[j]) {
                m[i] = a2[j];
                if (j != a2.length - 1) j++;
                else if (j == a2.length - 1) {
                    j = a2.length - 1;
                    a2[j] = Math.abs(a1[a1.length - 1] + a2[a2.length - 1]);
                }
            } else if (a1[k] == a2[j]) {
                m[i] = a2[j];
                if (j != a2.length - 1) j++;
                else if (j == a2.length - 1) {
                    j = a2.length - 1;
                    a2[j] = Math.abs(a1[a1.length - 1] + a2[a2.length - 1]);
                }

            }

        }
        return m;
    }
}
