public class prrrakt {
    public static void main(String[] args){
        int days = 30;
        int salesPerDay = 14;
        int total = 0;

        for (int i = 1; i <= days ; i ++ ) {
            total = total + salesPerDay;
            System.out.println("День " + i + "Уже продано " + total);
        }
    }
}
