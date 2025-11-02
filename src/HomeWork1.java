import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        String[] appliances = {"Стиральная машина",
                "Сушильная машина",
                "Холодильник",
                "Утюг",
                "Посудомоечная машина",
                "Микроволновая печь",
                "Варочная поверхность",
                "Духовой шкаф",
                "Блендер",
                "Миксер"};

        int[] amount = new int[10];

        Random random = new Random();

        for (int i = 0; i < amount.length; i++) {
            amount[i] = random.nextInt(11);
        }

        for (int i = 0; i < appliances.length; i++) {
            System.out.println("Наименование: " + appliances[i] + "Количество: " + amount[i]);
        }
    }
}
