package decorate;

/**
 * 内容摘要：摩卡调料
 *
 * @author 郭一行
 * @date 2018/3/27
 */
public class Mocha extends Condiment{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "摩卡"+beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
