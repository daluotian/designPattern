package structural.bridge;

public class LinuxImp implements ImageImp{
    @Override
    public void doPaint(Matrix m) {
        // 调用UNIX系统的绘制函数绘制像素矩阵
        System.out.print("在UNIX操作系统中显示图像：");
    }
}
