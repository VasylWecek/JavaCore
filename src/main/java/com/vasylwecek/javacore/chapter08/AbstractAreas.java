package chapter08;

// Абстрактный класс для геометрических фигур
abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // Абстрактный метод для вычисления площади
    abstract double area();
}

// Подкласс для прямоугольника
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // Переопределение метода area для прямоугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

// Подкласс для треугольника
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // Переопределение метода area для треугольника
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

// Класс для демонстрации использования абстрактных классов и методов
class AbstractAreas {
    public static void main(String args[]) {
        // Создание объектов подклассов
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref; // Использование ссылки суперкласса

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
