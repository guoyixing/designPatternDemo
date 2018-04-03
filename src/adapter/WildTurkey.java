package adapter;

/**
 * 内容摘要：
 *
 * @author 郭一行
 * @date 2018/4/3
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯咯");
    }

    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }
}
