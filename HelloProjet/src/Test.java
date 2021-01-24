import java.awt.*;
import javax.swing.*;
public class Test extends JFrame {
    public Test() {
        //得到窗体的内容窗格
        Container c = getContentPane();
        //往内容窗格中添加面板
        c.add(new DrawPanel());
        //设置窗体大小
        setSize(300, 300);
        //设置窗体居中显示
        setLocationRelativeTo(null);
        //设置点击窗体右上角关闭按钮时的动作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}
class DrawPanel extends JPanel {
    //在面板中画图，paintComponent 由系统自动调用
    public void paintComponent(Graphics g) {
        //设置颜色
        g.setColor(Color.red);
        //画实心圆
        g.fillOval((getWidth()-240)/2, (getHeight()-240)/2, 240, 240);
        g.setColor(Color.yellow);
        g.fillOval((getWidth()-160)/2, (getHeight()-160)/2, 160, 160);
        g.setColor(Color.blue);
        g.fillOval((getWidth()-80)/2, (getHeight()-80)/2, 80, 80);
    }
}