public class Water {
    public static void main(String[] args){
        int[] waterConsumption = {1500, 1800, 2000, 1600, 1500, 1500, 1800};

        waterConsumption[4] = waterConsumption[4] + 200;
        System.out.println("Новое значение выпитой воды за пятницу: " + waterConsumption[4]);

        int sum = 0;
        for (int i = 0; i < waterConsumption.length; i++){
            sum = sum + waterConsumption[i];
        }
        int avgConsumption = sum / waterConsumption.length;
        System.out.println("В среднем выпивали:" + avgConsumption);
    }
}
