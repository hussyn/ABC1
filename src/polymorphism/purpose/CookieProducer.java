package polymorphism.purpose;

public class CookieProducer extends SweetProducer {

    @Override
    public void produceSweet() {
        System.out.println("Cookie produced");
    }

}
