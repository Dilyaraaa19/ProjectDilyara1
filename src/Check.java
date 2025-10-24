import java.util.Random;

public class Check {
    public static void main(String[] args){
        Random random = new Random();
        int secretCode;
        int cookInput;

        while (true){
            secretCode = random.nextInt(50);
            cookInput = random.nextInt(50);
            System.out.println("Печатаю новый чек");

            if (cookInput == secretCode){
                System.out.println("Повар угадал число");
                break;
            }
        }
    }
}
