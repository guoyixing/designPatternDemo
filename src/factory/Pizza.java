package factory;

import java.util.ArrayList;

/**
 * 内容摘要：披萨饼类
 *
 * @author 郭一行
 * @date 2018/3/28
 */
public class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("制作 "+name);
        System.out.println("添加调料");

        for (Object topping : toppings) {
            System.out.println("  "+topping);
        }
    }

    public void bake(){
        System.out.println("请等待烘焙");
    }

    public void cut(){
        System.out.println("正在切片");
    }

    public void box(){
        System.out.println("正在包装");
    }

    public String getName() {
        return name;
    }
}
