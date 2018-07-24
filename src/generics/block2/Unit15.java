package generics.block2;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/*
Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.

Sample Input:

1 2 3 4 5 6 7
Sample Output:

6 4 2
 */
public class Unit15 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a;
        Stack<Integer> list = new Stack<>();
        int cntr = 0;
        while (scanner.hasNext()){
            a =  scanner.nextInt();
            if(((++cntr) % 2) == 0)
            {

                list.push(a);
            }}
        while(!list.empty()) {
            int x = list.pop();
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
