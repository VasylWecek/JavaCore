package chapter07;

// Класс, представляющий стек целых чисел
class Stack {
    private int[] stack; // Массив для хранения элементов стека
    private int top;     // Индекс верхнего элемента стека

    // Конструктор инициализирует стек заданного размера
    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    // Метод добавляет элемент в стек
    void push(int item) {
        if (top == stack.length - 1) { // Проверка на переполнение стека
            System.out.println("Стек заполнен.");
        } else {
            stack[++top] = item; // Добавление элемента в стек
        }
    }

    // Метод извлекает и возвращает верхний элемент стека
    int pop() {
        if (top < 0) { // Проверка на пустоту стека
            System.out.println("Стек не загружен.");
            return 0; // Возвращаемое значение, если стек пуст
        } else {
            return stack[top--]; // Извлечение и возвращение элемента стека
        }
    }
}

// Класс для тестирования стека
//class TestStack2 {
//    public static void main(String[] args) {
//        Stack6 mystack1 = new Stack6(5); // Создание стека размером 5
//        Stack6 mystack2 = new Stack6(8); // Создание стека размером 8
//
//        // Заполнение каждого стека числами
//        for (int i = 0; i < 5; i++) mystack1.push(i);
//        for (int i = 0; i < 8; i++) mystack2.push(i);
//
//        // Извлечение и вывод элементов стека mystack1
//        System.out.println("Стек в mystack1:");
//        for (int i = 0; i < 5; i++)
//            System.out.println(mystack1.pop());
//
//        // Извлечение и вывод элементов стека mystack2
//        System.out.println("Стек в mystack2:");
//        for (int i = 0; i < 8; i++)
//            System.out.println(mystack2.pop());
//    }
//}
