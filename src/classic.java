public class classic {
    public static void main(String[] args){
System.out.println(getAdvice0Procrastination(6));
    }
    public static String getAdvice0Procrastination (int dice){
 String result = "тут будет храниться совет";
        if (dice == 1){
            result = "Полистать мемы";
        } else if (dice == 2) {
            result = "Выпить чашечку чая";
        } else if (dice == 3) {
            result = "Полистать ленту новостей";
        } else if (dice == 4) {
            result = "Пообщаться с уточкой";
        } else if (dice == 5) {
            result = "Устроить small talk";
        } else if (dice == 6) {
            result = "Потыкать в носик котика или пёсика";
        } else {
            result = "Неверные числа";
        }
        return result;
    }
}
