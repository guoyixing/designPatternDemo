package observer;

import java.util.Observable;

/**
 * 内容摘要：这是一个可观察者对象，提供给观察者数据
 *
 * 可观察者需要继承Observable对象
 * @author 郭一行
 * @date 2018/3/27
 */
public class CustomObservable extends Observable{
    private String name;
    private String age;
    private String sex;

    public void userChanged(){
        setChanged();
        //没有参数的时候由观察者自行拉取数据
        notifyObservers();
    }

    public void setUser(String name,String age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
        userChanged();
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
