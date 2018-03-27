package decorate;

/**
 * 内容摘要：豆浆调料
 *
 * @author 郭一行
 * @date 2018/3/27
 */
public class Soy extends Condiment{
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "豆浆"+beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3;
    }
}
