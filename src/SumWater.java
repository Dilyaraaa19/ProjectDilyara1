import java.util.Random;

public class SumWater {
    public static void main(String[] args){
        int [] waterConsumption = new int[7];

        Random random = new Random();

        for (int i = 0; i < waterConsumption.length; i++){
            waterConsumption[i]= random.nextInt(2001);
        }

        int sum = 0;
        for (int i = 0; i < waterConsumption.length; i++){
            sum = sum + waterConsumption[i];
        }
        System.out.println("Выпито:" + sum);
    }
}
