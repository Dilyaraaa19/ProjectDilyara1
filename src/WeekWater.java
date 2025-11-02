import java.util.Random;

public class WeekWater {
    public static void main(String[] args){
        int [] waterConsumption = new int [7];

        Random random = new Random();

        for (int i  = 0;i < waterConsumption.length; i++){
            waterConsumption[i] = random.nextInt(2001);
        }
        System.out.println("Потребление воды за неделю: ");

        for (int i  = 0;i < waterConsumption.length; i++){
            System.out.println("День" + (i+1) + "выпито воды: " + waterConsumption[i]);
        }
    }
}
