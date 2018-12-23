package x.y.dps.behavioral.memento;

/**
 * 原发器。使用备忘录来保存某个时刻原发器自身的状态，也可以使用备忘录来恢复内部状态
 * 原发器对象
 */
public class Originator {
    /**
     * 示意，表示原发器的状态
     */
    private String state="";

    /**
     * 创建保存原发器的状态的备忘录对象
     * @return 创建好的备忘录对象
     */
    public Memento createMemento(){
        return new MementoImpl(state);
    }

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     * @param memento 记录有原发器状态的备忘录对象
     */
    public void setMemento(Memento memento){
        MementoImpl menmentoImpl= (MementoImpl) memento;
        this.state=menmentoImpl.getState();
    }

    /**
     * 真实的备忘录对象，实现备忘录窄接口
     * 实现成私有内部类，不让外部访问
     */
    private static class MementoImpl implements Memento{
        private String state="";
        public MementoImpl(String state){
            this.state=state;
        }

        public String getState() {
            return state;
        }
    }

}
