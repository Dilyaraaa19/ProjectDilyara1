public class Policlinica {
    public static void main(String[] args) {

        int days = 30;
        int queueNumber = 7;
        int appointNumber = 5;

        for (int i = 1; i <= days; i++) {
            System.out.println("День" + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= queueNumber; j++) {
                    System.out.println("Пациент по очереди:" + j);
                }
                } else {
                    for (int j =1; j <=appointNumber;j++) {
                    System.out.println("Пациент по записи:" + j);
                }
            }
        }
    }
}
