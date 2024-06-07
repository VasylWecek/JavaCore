package chapter20;
import java.io.*;
public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "это знак авторского права &copy; " + ", а &copy - нет.\n";
        byte buf[] = s.getBytes(); // переобразирование строки в байты

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        // использование оператора try с ресурсами для управления файлами

        // Инициализация BufferedInputStream с помощью оператора try-with-resources:
        // Это гарантирует, что ресурс будет закрыт автоматически после завершения блока try,
        //  что помогает избежать утечек ресурсов.
        try (BufferedInputStream f = new BufferedInputStream(in)){
            // Чтение байтов из потока в цикле while:
            while ((c = f.read()) != -1){
                switch(c) {
                    case '&':
                    if (!marked){
                        f.mark(32);
                        marked = true;
                    } else {
                        marked = false;
                    }
                    break;
                    case';':
                        if (marked){
                            marked = false;
                            System.out.print("(c)");
                        }else
                            System.out.print((char)c);
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }else
                            System.out.print((char)c);
                        break;
                    default:
                        if (!marked)
                            System.out.print((char)c);
                        break;
                }
            }
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
