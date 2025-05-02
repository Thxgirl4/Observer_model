public class Main {
    public static void main(String[] args) {
        ObserverA obsA = new ObserverA();
        ObserverB obsB = new ObserverB();

        Subject canal = new Subject();

        canal.addObserver(obsA);
        canal.addObserver(obsB);

        System.out.println("Simulando notificação de publicação no canal..");
        canal.notifyAllObservers();
    }
}