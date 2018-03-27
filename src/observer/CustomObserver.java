package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 内容摘要：观察者对象
 *
 * 需要实现Observer接口
 * @author 郭一行
 * @date 2018/3/27
 */
public class CustomObserver implements Observer{
    /**
     * 观察对象
     */
    Observable observable;
    /**
     * 自身属性
     */
    private String name;
    private String age;

    /**
     * 创建观察者对象时需要知道观察哪一个对象，并在可观察者中添加观察者对象实现通知
     * @param observable 可观察者对象
     */
    public CustomObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        //判断是否是观察对象发来的通知
        if (o instanceof CustomObservable){
            CustomObservable customObservable = (CustomObservable)o;
            this.name=customObservable.getName();
            this.age=customObservable.getAge();
            display();
        }
    }

    private void display(){
        System.out.println("名字："+name+"  年龄："+age);
    }
}
