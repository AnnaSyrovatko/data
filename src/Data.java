public class Data {
    public static void main(String[] args) {

        int day = 8;
        int month = 8;
        int year = 2023;

        System.out.println(returnData(8,8, 2023));

    }
    public static String returnData(int day, int month, int year){
        String [] months = { " Январь ", " Февраль ", " Март ", " Апрель ", " Май ", " Июнь ", " Июль ", " Август ", " Сентябрь ", " Октябрь ", " Ноябрь ", " Декабрь "};

        return "0" + day + months[month - 1] + year;

    }
}
