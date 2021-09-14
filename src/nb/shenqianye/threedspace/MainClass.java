package nb.shenqianye.threedspace;

import javax.swing.*;
import java.awt.event.*;

public class MainClass {
    public static void main(String[] args){
        System.out.print("测试\n");
        mainWindow();
    }
    static void mainWindow() {
        NBWindow mainWindow = new NBWindow();
        mainWindow.create();
    }
}
/*1.需要一个窗口*/
class NBWindow{
    JFrame frame = new JFrame();
    void create(){
        this.frame.setLocation(100, 100);
        this.frame.setSize(650, 400);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("3D空间");
        this.frame.setVisible(true);
        this.frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char key = e.getKeyChar();
                if(key == 'a' || key == 'A') System.out.print("向左移动\n");
                else if(key == 'd' || key == 'D') System.out.print("向右移动\n");
                else if(key == 'w' || key == 'W') System.out.print("向上移动\n");
                else if(key == 's' || key == 'S') System.out.print("向下移动\n");
            }
        });
        this.frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if( e.getButton() == MouseEvent.BUTTON1) System.out.print("按下鼠标左键\n");
                else if( e.getButton() == MouseEvent.BUTTON2) System.out.print("按下鼠标中键\n");
                else if( e.getButton() == MouseEvent.BUTTON3) System.out.print("按下鼠标右键\n");
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                ;
            }
        });
    }
}
/*2.需要能够检测键盘与鼠标的指令*/
/*3.需要能够绘制图像*/