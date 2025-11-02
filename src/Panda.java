public class Panda {

    String name;
    int age;
    int weight;

    Panda (String pandaName, int pandaAge, int pandaWeight){
        name = pandaName;
        age = pandaAge;
        weight = pandaWeight;
    }

    Panda() {
    }
    public static void main(String[] args){

        Panda lilu = new Panda("Лилу",5,120);
        Panda mao = new Panda("Мао",2,45);
        Panda peter = new Panda("Питер",7,130);
        Panda mary = new Panda("Мэри",4,90);

        System.out.println(lilu.name);
        System.out.println(mao.name);
        System.out.println(peter.name);
        System.out.println(mary.name);
    }
}

