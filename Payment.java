abstract class Payment {
    abstract void pay();
}

class cashPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Плачу наличными");
    }
}

class creditCardPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Плачу картой");
    }
}

class Clients{
    public static void main(String[] args){
        Payment katya = new cashPayment();
        Payment tanya = new creditCardPayment();

        katya.pay();

        tanya.pay();
    }
}