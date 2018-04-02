package command.commandlist;

import command.Command;
import command.model.Stereo;

/**
 * 内容摘要：音响打开命令类
 *
 * @author 郭一行
 * @date 2018/4/2
 */
public class StereoOnwithCDCommand implements Command{
    Stereo stereo;

    public StereoOnwithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
