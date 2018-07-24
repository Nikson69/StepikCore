package exceptions4.block3;

import java.util.logging.*;

/*
В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
Не упомянутые здесь настройки изменяться не должны.

(*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать файлы на диске, поэтому придется так.

Подсказки:

Level есть не только у Logger, но и у Handler.
Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.
 */
public class Unit8 {
    private static void configureLogging() {

        Logger classA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger classB = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger classC = Logger.getLogger("org.stepic.java");
        classA.setLevel(Level.ALL);
        classB.setLevel(Level.WARNING);
        classC.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());
        Formatter formatter = handler.getFormatter();
        handler.setLevel(Level.ALL);
        classC.addHandler(handler);
    }
}
