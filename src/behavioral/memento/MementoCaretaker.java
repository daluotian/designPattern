package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// 象棋棋子备忘录管理类，充当负责人
public class MementoCaretaker {
    // 单次悔棋
    /*
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
    */

    // 多次悔棋
    private List<ChessmanMemento> mementoList = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementoList.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
