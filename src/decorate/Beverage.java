package decorate;

/**
 * 内容摘要：饮料接口
 *
 * @author 郭一行
 * @date 2018/3/27
 */
public abstract class Beverage {
    /**
     * 饮料默认的名称
     */
    String description = "beverage";

    /**
     * 获取饮料的名称
     * @return 返回饮料名称
     */
    public String getDescription() {
        return description;
    }

    /**
     * 计算价格的方法
     * @return 价格
     */
    public abstract double cost();
}
