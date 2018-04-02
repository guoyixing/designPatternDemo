package command;

/**
 * 内容摘要：命令的接口
 *
 * @author 郭一行
 * @date 2018/4/2
 */
public interface Command {
    public void execute();
    public void undo();
}
