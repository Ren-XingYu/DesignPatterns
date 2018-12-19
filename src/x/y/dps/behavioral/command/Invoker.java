package x.y.dps.behavioral.command;

/**
 * 调用者
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command=null;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 示意方法，要求命令执行请求
     */
    public void runCommand(){
        command.execute();
    }
}
