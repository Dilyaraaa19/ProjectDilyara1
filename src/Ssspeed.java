public class Ssspeed {
    public static void main(String[] args){
        printSpeedingWarning(20, 60);
    }

    public static void printSpeedingWarning(int speedLimit, int currentSpeed){
        if (currentSpeed >= speedLimit) {
            System.out.println("Вы превысили скорость.Может прийти штраф");
        } else {
            System.out.println("Все хорошо");
        }
    }
}

