package nb.shenqianye.threedspace;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args){
        System.out.print("测试\n");
        MainClass.mainMenuOperation();
    }

    static void mainMenuOperation() {
        NbWindow mainwindow = new NbWindow();
        mainwindow.createAndShowGUI();
       // mainwindow.createAndShowDialog(mainwindow.frame);
        System.out.print("运行完毕成员方法创造并显示对话框");
    }
}


class NbWindow{
    int id;
    JFrame frame = new JFrame("一个新的、大的、方形的窗口");
    NbWindow(){
        System.out.print("创建了一个虚拟窗口\n");
    }

    void createAndShowGUI(){
        JButton btn1 = new JButton("查看讯息1");
        JButton btn2 = new JButton("查看讯息2");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("一个新的、大的、方形的窗口");
        this.frame.setSize(1080, 700);
        this.frame.setLocation(0, 0);
        this.frame.setVisible(true);
        System.out.print("成功创建一个窗口\n");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAndShowDialog(frame, 1);
            }
        });
        this.frame.add(btn1);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAndShowDialog(frame, 2);
            }
        });
        this.frame.add(btn2);
    }
    void createAndShowDialog(JFrame inframe, int judge) {
        JDialog dialog = new JDialog(inframe);
        JButton btn1 = new JButton("确实");
        JLabel label1 = new JLabel();

        /*设置属性*/
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setTitle("dialog1");
        dialog.setSize(300, 140);
        dialog.setLocation(108, 70);

        System.out.print("成功创建一个对话框\n");

        /*增加组件*/

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dialog.add(btn1);

        if(judge == 1) {
            label1.setText("你是狗");
        }
        else if(judge == 2){
            label1.setText("恭喜您，您不是狗");
        }
        dialog.add(label1);

        dialog.setVisible(true);
    }
}