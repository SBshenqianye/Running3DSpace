package nb.shenqianye.threedspace;

import java.awt.*;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args){
        System.out.print("测试\n");
        mainMenuOperation();
    }

    static void mainMenuOperation() {
        NbWindow mainwindow = new NbWindow();
        mainwindow.createAndShowGUI();
        mainwindow.createAndShowDialog(mainwindow.frame);;
    }
}


class NbWindow extends JFrame{
    int id;
    JFrame frame = new JFrame("一个新的、大的、方形的窗口");
    NbWindow(){
        System.out.print("创建了一个虚拟窗口\n");
    }
    void createAndShowGUI(){
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("一个新的、大的、方形的窗口");
        this.frame.setSize(1080, 700);
        this.frame.setLocation(0, 0);
        this.frame.setVisible(true);
        System.out.print("成功创建一个窗口\n");
    }
    void createAndShowDialog(JFrame inframe){
        JDialog dialog = new JDialog(inframe);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setTitle("dialog1");
        dialog.setSize(108, 70);
        dialog.setLocation(108, 70);
        dialog.setVisible(true);
        System.out.print("成功创建一个对话框\n");
    }
}