public class Subject {
    Observer[] observers = new Observer[10];
    int count = 0;

    void addObserver(Observer o ){
        observers[count++] = o;
    }
    void notifyAllObservers(){
        for(int i = 0; i < count; i++){
            observers[i].update();
        }
    }
}
