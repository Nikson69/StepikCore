package inputOutput5.block3;

import java.io.IOException;
import java.util.ArrayList;

/*
Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.

На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы), метод main, прописать все import'ы.

Sample Input 1:

1 2 3
Sample Output 1:

6.000000
Sample Input 2:

a1 b2 c3
Sample Output 2:

0.000000
Sample Input 3:

-1e3
18 .111 11bbb
Sample Output 3:

-981.889000
 */
public class Unit13 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> bytes = new ArrayList<>();
        while (true){
            int i = System.in.read();
            if (i == -1) break;
            bytes.add(i);
        }
        byte[] newbyte = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            newbyte[i] = bytes.get(i).byteValue();
        }
        String [] nonbers = new  String(newbyte).split("[\\r\\n\\s]");
        double sy = 0.0;
        for (String nonber:nonbers) {
            try {
                sy += Double.parseDouble(nonber);
            } catch (Exception e){

            }
        }
        System.out.print(String.format("%.6f", sy));
    }

}
