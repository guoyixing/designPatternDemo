import command.Command;
import command.RemoteControl;
import command.commandlist.StereoOffCommand;
import command.commandlist.StereoOnwithCDCommand;
import command.model.Stereo;
import decorate.Beverage;
import decorate.Espresso;
import decorate.Mocha;
import decorate.Soy;
import decorateio.LowerCaseInputStream;
import factory.NYPizzaStore;
import factory.Pizza;
import factory.PizzaStore;
import observer.CustomObservable;
import observer.CustomObserver;
import singleton.HungrySingleton;
import singleton.SlackerSingleton;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        /*
        //观察者模式

        CustomObservable customObservable = new CustomObservable();
        CustomObserver observer1 = new CustomObserver(customObservable);
        CustomObserver observer2 = new CustomObserver(customObservable);
        customObservable.setUser("黄丹丹","22","女");
        customObservable.setUser("甘立冬","？？","男");
        */
        /*
        //装饰模式

        //饮料Demo
        Beverage beverage = new Mocha(new Soy(new Espresso()));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        //io流Demo
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src\\text.txt")));
            while ((c=in.read())>=0){
                System.out.print((char) c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

        /*
        //工厂模式
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheese = nyPizzaStore.createPizza("cheese");
        System.out.println(cheese.getName());
         */
        /*
        //单例模式 饿汉
        HungrySingleton hungrySingleton = HungrySingleton.getUrgentSingleton();
        //懒汉
        SlackerSingleton slackerSingleton = SlackerSingleton.getSlackerSingleton();
        */

        //命令模式
        RemoteControl remoteControl = new RemoteControl();
        Stereo stereo = new Stereo();
        Command stereoOffCommand = new StereoOffCommand(stereo);
        Command stereoOnwithCDCommand = new StereoOnwithCDCommand(stereo);
        remoteControl.setCommand(0,stereoOnwithCDCommand,stereoOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
