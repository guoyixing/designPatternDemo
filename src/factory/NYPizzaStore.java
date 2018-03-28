package factory;

import factory.PizzaStyle.NYStyleCheesePizza;

/**
 * 内容摘要：
 *
 * @author 郭一行
 * @date 2018/3/28
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case "cheese": return new NYStyleCheesePizza();
            case "veggie": return null;
            default:break;
        }
        return null;
    }
}
