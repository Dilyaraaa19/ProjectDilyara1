import java.util.Random;

public class Tennis {
    public static void main(String[] args) {
        Random random = new Random();
        int totalPoints = 0;
        int tournaments = 0;

        while (totalPoints < 1000) {
            totalPoints += random.nextInt(101);
            tournaments +=1;
        }

        System.out.println("Игроку нужно принять участие в " + tournaments + " турнирах");
    }
}
