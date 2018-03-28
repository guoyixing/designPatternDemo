package decorateio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 内容摘要：装饰者模式 将FilterInputStream中的字节流和字符流转换成小写
 *
 * @author 郭一行
 * @date 2018/3/28
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * 构造方法必须传入一个InputStream
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * 字符流转换成小写
     *
     * @return 返回小写字符
     */
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * 字节流转换成小写
     *
     * @return 返回小写字符
     */
    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) result);
        }
        return result;
    }
}
