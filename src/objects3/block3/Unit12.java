package objects3.block3;
/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):

public class Robot {

    public Direction getDirection() {
        // текущее направление взгляда
    }

    public int getX() {
        // текущая координата X
    }

    public int getY() {
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
Direction, направление взгляда робота,  — это перечисление:
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}


Как это  выглядит:



Пример

В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP

Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();


P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо написать алгоритм управления танком. Алгоритмы, написанные разными людьми, соревнуются между собой.
 */
public class Unit12 {

    public static void moveRobot(Robot robot, int toX, int toY) {
        if(robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        if(robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}



class Robot {

    int x;
    int y;
    Direction direction;

    public  Robot(int peredavaimiiX, int peredavaimiiY, Direction peredavaimiiDirection){
        x = peredavaimiiX;
        y = peredavaimiiY;
        direction = peredavaimiiDirection;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction) {
            case UP: direction = Direction.LEFT; break;
            case LEFT: direction = Direction.DOWN; break;
            case DOWN: direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.UP; break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP: direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.DOWN; break;
            case DOWN: direction = Direction.LEFT; break;
            case LEFT: direction = Direction.UP; break;
        }
    }

    public void stepForward() {
        switch (direction){
            case UP: y++; break;
            case RIGHT: x++; break;
            case DOWN: y--; break;
            case LEFT: x--; break;
        }
    }
}
enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
