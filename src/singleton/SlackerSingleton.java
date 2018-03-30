package singleton;

/**
 * 内容摘要：懒汉单例模式
 *
 * @author 郭一行
 * @date 2018/3/30
 */
public class SlackerSingleton {
    /**
     * 用来记录被实例化出来的对象
     * volatile关键字是轻量级锁
     * JMM会把该线程对应的本地内存中的变量强制刷新到主内存中去
     * 这个写操作会导致其他线程中的缓存无效
     * 简单的说就是会在内存中多个线程同步slackerSingleton的状态
     */
    private volatile static SlackerSingleton slackerSingleton;

    /**
     * 私有构造函数 外部对象无法访问因此无法构造对象
     */
    private SlackerSingleton() {
    }

    /**
     * 想要获取整个对象就使用这个方法  每次返回的都是用一个对象
     */
    public static SlackerSingleton getSlackerSingleton() {
        //if中的代码只会执行一次 也就是synchronized只会被调用一次 避免大量的开销
        if (slackerSingleton == null) {
            synchronized (SlackerSingleton.class) {
                if (slackerSingleton == null) {
                    new SlackerSingleton();
                }
            }
        }
        return slackerSingleton;
    }
}
