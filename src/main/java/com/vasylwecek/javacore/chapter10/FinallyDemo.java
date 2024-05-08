package chapter10;
/*
Оператор Finally
Оператор f i na l l y образует блок кода, который будет выполнен по завершении
блока операторов t r y / ca t c h , но перед следующим за ним кодом.

Этот код демонстрирует использование блока finally в языке Java.
Блок finally выполняется в любом случае, независимо от того, возникло ли исключение в блоке try или нет
 */

class FinallyDemo {
    // генерация исключения в методе
    static void procA() {
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException("демонстрация"); //  намеренно выбрасывается исключение
            // Исключение передается в вызывающий код, но перед этим выполняется блок finally,
            // который выводит сообщение "Блок оператора finally в методе procA()".
        } finally {
            System.out.println(
                    "Блок оператора finally в методе procA()"
            );
        }
    }
    // возвратить управления из блока оператора try
    static void procB(){
        try {
            System.out.println("В теле метода procB()");
            return;
        } finally {
            System.out.println(
                    "Блок оператора finally в методе procB()"
            );
        }

    }

    // выполнить блок try, как обычно
    static void procC(){
        try{
            System.out.println("В теле метода procC()");
        } finally {
            System.out.println(
                    "Блок оператора finally в методе procC()"
            );
        }
    }

    public static void main(String[] args) {
        procA();
        {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}