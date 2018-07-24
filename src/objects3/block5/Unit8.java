package objects3.block5;
/*
Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.

Класс AsciiCharSequence должен:

реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString()
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.

P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254
 */
public class Unit8 {
}
class AsciiCharSequence implements CharSequence {
    byte[] mass;

    public  AsciiCharSequence(byte[] a){
        mass = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            mass[i] = a[i];
        }
    }

    @Override
    public int length() {
        return mass.length;
    }

    @Override
    public char charAt(int i) {
        return (char) mass[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] sub = new byte[i1 - i];
        for (int j = 0; j < sub.length; j++) {
            sub[j] = mass [j + i];
        }
        CharSequence mas = new AsciiCharSequence(sub);

        return mas;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        int h = 0;
        while ( h < mass.length) {
            builder.append((char)mass[h]);
            h++;
        }
        String completedString = builder.toString();
        return  completedString;
    }

}