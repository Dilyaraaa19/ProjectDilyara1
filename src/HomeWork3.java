public class HomeWork3 {
    public static void main(String[] args){
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

        String [] additionalAppliances = {"Кофемашина",
                "Чайник",
                "Тостер"};

        String[] newAppliances = new String[13];
        for (int i = 0; i < appliances.length; i++){
            newAppliances[i] = appliances[i];
        }

        for (int i = 0; i < additionalAppliances.length; i++){
            newAppliances[i+10] = additionalAppliances[i];
        }
        for (int i = 0; i < newAppliances.length; i++){
            System.out.println("Наименование: " + newAppliances[i]);
        }
    }
}
