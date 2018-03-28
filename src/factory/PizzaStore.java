package factory;

/**
 * 内容摘要：披萨饼商店
 *
 * @author 郭一行
 * @date 2018/3/28
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
