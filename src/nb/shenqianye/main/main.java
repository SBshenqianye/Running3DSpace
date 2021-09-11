package nb.shenqianye.main;

import java.awt.FlowLayout;
import javax.swing.*;

public class main {
    public static void main(String[] args){
        System.out.print("测试\n");
        NbWindow aframe;
        aframe = new NbWindow();
        aframe.createAndShowGUI();
    }
}


class NbWindow extends JFrame{
    int id;
    NbWindow(){
        System.out.print("创建了一个虚拟窗口\n");
    }
    void createAndShowGUI(){
        JFrame frame = new JFrame("一个新的、大的、方形的窗口");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("一个新的、大的、方形的窗口");
        frame.setSize(1080, 700);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }
    void createAndShowDialog(){
        JDialog
    }
}