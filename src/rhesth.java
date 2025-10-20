public class rhesth {
    public static void tastyDiet (boolean hasCroissant) {
        if (hasCroissant) {
            System.out.println("Съесть круассан");
        }
        System.out.println("Съесть яблоко");
    }

    public static void main(String[] args) {
        tastyDiet(true);
    }
}
