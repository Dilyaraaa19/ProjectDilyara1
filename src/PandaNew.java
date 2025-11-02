public class PandaNew {
    String name;
    int age;
    int weight = 120;


    PandaNew(String pandaName, int pandaAge) {
        name = pandaName;
        age = pandaAge;
    }


    PandaNew() {
    }

    public static void main(String[] args) {
        PandaNew lilu = new PandaNew("Лилу", 5);
        PandaNew mao = new PandaNew("Мао", 2);
        PandaNew peter = new PandaNew("Питер", 7);
        PandaNew mary = new PandaNew("Мэри", 4);


        System.out.println(lilu.name);
        System.out.println(mao.weight);
        System.out.println(peter.age);
        System.out.println(mary.weight);
    }
}