package chapter08;

class Box4 {
    private double width;
    private double height;
    private double depth;

    Box4(Box4 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box4() {
        width = height = depth = -1;
    }

    Box4(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class Box4Weight1 extends Box4 {
    double weight;

    Box4Weight1(Box4Weight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    Box4Weight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Box4Weight1() {
        super();
        weight = -1;
    }

    Box4Weight1(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String args[]) {
        Box4Weight1 mybox1 = new Box4Weight1(10, 20, 15, 34.3);
        Box4Weight1 mybox2 = new Box4Weight1(2, 3, 4, 0.076);
        Box4Weight1 mybox3 = new Box4Weight1();
        Box4Weight1 myclone = new Box4Weight1(mybox1);
        Box4Weight1 mycube = new Box4Weight1(3, 2);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
        System.out.println("Вес клона равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);
        System.out.println("Вес куба равен " + mycube.weight);
    }
}
