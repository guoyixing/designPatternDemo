package singleton;

/**
 * 内容摘要：饿汉单例模式
 * 简单的单例方式，弊端是程序运行时就已经创建 如果类很大很复杂就浪费资源
 *
 * @author 郭一行
 * @date 2018/3/30
 */
public class HungrySingleton {
    /**
     * 创建对象
     */
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 私有构造函数 外部对象无法访问因此无法构造对象
     */
    private HungrySingleton() {
    }

    /**
     * 想要获取整个对象就使用这个方法  每次返回的都是用一个对象
     */
    public static HungrySingleton getUrgentSingleton() {
        return hungrySingleton;
    }
}
