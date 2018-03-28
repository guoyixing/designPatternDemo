package factory.PizzaStyle;

import factory.Pizza;

/**
 * 内容摘要：
 *
 * @author 郭一行
 * @date 2018/3/28
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name="纽约奶酪披萨";
        dough="薄底";
        sauce="番茄酱";
        toppings.add("高级奶酪");
    }
}
