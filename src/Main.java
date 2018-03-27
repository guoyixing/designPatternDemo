import observer.CustomObservable;
import observer.CustomObserver;

public class Main {

    public static void main(String[] args) {
        //观察者模式
        CustomObservable customObservable = new CustomObservable();
        CustomObserver observer1 = new CustomObserver(customObservable);
        CustomObserver observer2 = new CustomObserver(customObservable);
        customObservable.setUser("黄丹丹","22","女");
        customObservable.setUser("甘立冬","？？","男");
    }
}
