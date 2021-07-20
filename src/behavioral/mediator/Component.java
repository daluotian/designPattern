package behavioral.mediator;

public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 调用转发
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
