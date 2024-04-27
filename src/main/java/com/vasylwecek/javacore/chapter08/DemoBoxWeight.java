package chapter08;

class Box1 {
    double width, height, depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = height = depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight1 extends Box4 {
    double weight;

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        Box4Weight1 mybox1 = new Box4Weight1(10, 20, 15, 34.3);
        Box4Weight1 mybox2 = new Box4Weight1(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
