public class HomeWork2 {
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

        String outdatedPromotional = appliances[0];
        appliances [0] = "Духовой шкаф";
        appliances [7] = outdatedPromotional;
        System.out.println("Распродажа -20% на категорию месяца: " + appliances[0]);
    }
}
