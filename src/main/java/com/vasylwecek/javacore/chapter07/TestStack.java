package chapter07;

class Stack6 {
    private int[] stack = new int[10]; // Переименован для ясности
    private int top; // Индекс вершины стека

    // Конструктор для инициализации стека
    Stack6() {
        top = -1; // Инициализация с -1, указывающая на пустой стек
    }

    // Метод для добавления элемента в стек
    void push(int item) {
        if (top == 9) { // Проверка, не полон ли стек
            System.out.println("Стек заполнен.");
        } else {
            stack[++top] = item; // Поместить элемент в стек и увеличить индекс вершины
        }
    }

    // Метод для удаления элемента из стека
    int pop() {
        if (top < 0) { // Проверка, не пустой ли стек
            System.out.println("Стек не загружен.");
            return 0; // Возвращение 0 как индикатора пустого стека
        } else {
            return stack[top--]; // Вернуть элемент и уменьшить индекс вершины
        }
    }
}

// Класс для тестирования стека
class StackTest {
    public static void main(String[] args) {
        Stack6 myStack = new Stack6(); // Создание экземпляра стека

        // Добавление элементов в стек
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }

        // Попытка добавить еще один элемент в полный стек
        myStack.push(10);

        // Извлечение элементов из стека
        for (int i = 0; i < 11; i++) {
            System.out.println(myStack.pop());
        }
    }
}
