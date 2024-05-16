package chapter16;

public class toStringDemo {
    static class Box{
        double width;
        double height;
        double depth;
        Box(double w, double h, double d){
            width = w;
            height = h;
            depth = d;
        }
        public String toString(){
            return "Размеры " + width + " на " + depth + " на " + height + ".";
        }
    }

    public static void main(String[] args) {
        Box b = new Box (10, 12, 14);
        String s = "Объект b типа Вох: " + b; // выполнить сцепление
        System.out.println(b);
        System.out.println(s);
    }
}
