abstract class BosTaurus {
    private int weight;

    protected BosTaurus(int weight){
        this.weight = weight;
    }
    public abstract void produce();
}

class Cow extends BosTaurus{
    public Cow(int weight){
        super(weight);
    }
    @Override
    public void produce(){
        System.out.println("Я даю молоко");
    }
}

class Bull extends BosTaurus {
    public Bull(int weight) {
        super(weight);
    }

    @Override
    public void produce() {
        System.out.println("Я даю мясо");
    }
}

class Animals{
    public static void main(String[] args){
        BosTaurus Milka = new Cow(150);
        BosTaurus Tor = new Bull(850);

        Milka.produce();
        Tor.produce();
    }
}