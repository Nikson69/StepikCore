package syntax2.block4;

import java.math.BigInteger;

/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал N вычисляется как 1⋅2⋅...⋅N.

Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Sample Input 1:

1
Sample Output 1:

1
Sample Input 2:

3
Sample Output 2:

6
 */
public class Unit8 {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger fac = BigInteger.ONE;
        for (int i = 1; i <= value; i++ ){
            BigInteger b = BigInteger.valueOf(i);
            fac = fac.multiply(b);
        }
        return fac;  // your implementation here
    }
}
