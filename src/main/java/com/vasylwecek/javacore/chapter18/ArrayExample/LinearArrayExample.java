package chapter18.ArrayExample;

public class LinearArrayExample {
    public static void main(String[] args) {
        int [] linearArray =new int [5];

        linearArray[0] = 10;
        linearArray[1] = 20;
        linearArray[2] = 30;
        linearArray[3] = 40;
        linearArray[4] = 50;

        // Доступ к элементам массива
        for(int i=0; i< linearArray.length; i++){
            System.out.println(linearArray[i]);
        }
    }
}
