package adapter;

/**
 * 内容摘要：
 *
 * @author 郭一行
 * @date 2018/4/3
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }
}
