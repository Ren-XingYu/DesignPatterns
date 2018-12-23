package x.y.dps.behavioral.memento;

/**
 * 备忘录管理者，或者称为备忘录负责人。主要负责保存备忘录对象，但是不能对备忘录对象的内容进行操作或检查
 * 负责保存备忘录的对象
 */
public class Caretaker {
    /**
     * 记录被保存的备忘录对象
     */
    private Memento memento=null;

    /**
     * 保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(Memento memento){
        this.memento=memento;
    }

    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public Memento retriveMemento(){
        return this.memento;
    }
}
