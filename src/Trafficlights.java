public class Trafficlights {
    public static void main(String[] args){
        String advice=proccesTrafficLightSignal("red");
        System.out.println(advice);
    }

    public static String proccesTrafficLightSignal(String color){
        if (color.equals("green")) {
            return "можно ехать";
        } else if (color.equals("yellow") || color.equals("red")){
            return  "стой";
        } else {
            return "перезапросить датчики";
        }
    }
}
