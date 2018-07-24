package syntax2.block2;
/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.

В качестве примера написано заведомо неправильное выражение. Исправьте его.

Sample Input 1:

32
Sample Output 1:

|
Sample Input 2:

29
Sample Output 2:

y
 */
public class Unit3 {
    public static char charExpression(int a) {
        int c = (char) a;
        int b = '[' + 1 + c;
        return (char) b ;
    }
}
