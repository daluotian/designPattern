package structural.composite;

public abstract class AbstractFile {
    abstract void add(AbstractFile file);
    abstract void remove(AbstractFile file);
    abstract AbstractFile getChild(int i);
    abstract void killVirus();
}
