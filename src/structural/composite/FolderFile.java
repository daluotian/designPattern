package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderFile extends AbstractFile{
    // 定义集合 fileList，用于存储 AbstractFile 类型成员
    private List<AbstractFile> fileList = new ArrayList<>();

    private String name;

    public FolderFile(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    void killVirus() {
        // 模拟杀毒
        System.out.println("*****对文件夹文件" + name + "进行杀毒");
        for (AbstractFile obj: fileList) {
            obj.killVirus();
        }
    }
}
