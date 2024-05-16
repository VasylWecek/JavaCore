package chapter15;

public class VarCapture {
    interface MyFunc{
        int func (int n);
    }

    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

            return v;
        };
    }
}
