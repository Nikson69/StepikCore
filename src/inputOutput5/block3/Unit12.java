package inputOutput5.block3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример

InputStream последовательно возвращает четыре байта: 48 49 50 51.

Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */
public class Unit12 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ArrayList<Integer> bytes = new ArrayList<>();
        while (true){
            int i = inputStream.read();
            if (i == -1) break;
            bytes.add(i);
        }
        byte[] newbyte = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            newbyte[i] = bytes.get(i).byteValue();
        }
        return new String(newbyte,charset);
    }
}
