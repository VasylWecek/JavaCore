package chapter14;


public class BoundsDemo {

    // В этой версии класса Stats аргумент типа Т должен быть
// клaccoм Number или наследуемым от него классом
    static   class Stats<T extends Number>{
        T[] nums; // массив клacca Number или его пoдклacca

        // передать конструктору ссылку на массив элементов
        Stats(T[] o){
            nums = o;
        }

        // возвратить значение типа double в любом случае
        double average(){
            double sum = 0.0;

            for(int i = 0; i < nums.length; i++)
                sum += nums[i].doubleValue();
            return sum / nums.length;
        }
    }
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Integer> dob = new Stats<Integer>(inums);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);

    }

}
