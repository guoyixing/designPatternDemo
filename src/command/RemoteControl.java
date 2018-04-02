package command;

import command.commandlist.NoCommand;

/**
 * 内容摘要：遥控器类
 *
 * @author 郭一行
 * @date 2018/4/2
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command command;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        command=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        command= onCommands[slot];
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        command= offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButtonWasPushed(){
        command.undo();
    }
}
