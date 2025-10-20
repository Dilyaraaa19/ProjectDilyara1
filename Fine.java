public class Fine {
    public static void main(String[] args){
        printSpeedingTicket(20, 70);
    }

    public static void printSpeedingTicket(int speedLimit, int currentSpeed){
        int overSpeed = currentSpeed - speedLimit;
        String result = "Тут будет сумма штрафа";
        if (overSpeed >=20 && overSpeed < 40){
            result= "500";
        } else if (overSpeed >=40 && overSpeed <60){
            result="1000";
        } else if (overSpeed >=60 && overSpeed <80){
            result="2500";
        } else if (overSpeed >=80) {
            result = "5000";
        }


            System.out.println("Может прийти штраф: " + result + "рублей");
        }
    }

