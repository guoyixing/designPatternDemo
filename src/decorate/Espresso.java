package decorate;

/**
 * 内容摘要：浓咖啡类
 *
 * @author 郭一行
 * @date 2018/3/27
 */
public class Espresso extends Beverage{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
