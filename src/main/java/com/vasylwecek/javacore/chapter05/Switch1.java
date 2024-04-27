package chapter05;

/*
Switch1 на Java использует оператор switch для
определения сезона года по номеру месяца и выводит соответствующее сообщение.
 */
public class Switch1 {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "эиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленым месяцем";
        }
        System.out.println("Aпpeль относится к" + season + ".");
    }
}
