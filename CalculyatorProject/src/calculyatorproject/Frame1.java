package calculyatorproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2008</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class Frame1 extends JFrame {
    JPanel jPanel2 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JPanel jPanel1 = new JPanel();
    GridLayout gridLayout1 = new GridLayout();
   // ImageIcon icon1=new ImageIcon("D:\\My_programs\\CalculyatorProject\\classes\\images\\123.gif");
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JButton jButton6 = new JButton();
    JButton jButton8 = new JButton();
    JButton jButton9 = new JButton();
    JButton jButton10 = new JButton();
    JButton jButton11 = new JButton();
    JButton jButton13 = new JButton();
    JButton jButton15 = new JButton();
    JButton jButton16 = new JButton();
    JButton jButton17 = new JButton();
    JButton jButton18 = new JButton();
    JButton jButton19 = new JButton();
    JButton jButton20 = new JButton();
    JButton jButton21 = new JButton();
    Character isare=new Character('a');
    String bufer="";
    boolean yeni=false;
    public Frame1() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Component initialization.
     *
     * @throws java.lang.Exception
     */
    private void jbInit() throws Exception {
        jPanel2 = (JPanel) getContentPane();
        jPanel2.setLayout(null);
        setSize(new Dimension(250, 297));
        setTitle("Frame Title");
        jTextField1.setBounds(new Rectangle(5, 5, 234, 20));
        jPanel1.setBounds(new Rectangle(5, 66, 234, 200));
        jPanel1.setLayout(gridLayout1);
        gridLayout1.setColumns(5);
        gridLayout1.setHgap(2);
        gridLayout1.setRows(4);
        gridLayout1.setVgap(2);
        jButton1.setBackground(new Color(148, 206, 204));
        jButton1.setToolTipText("");
        jButton1.setText("7");
        jButton1.addActionListener(new Frame1_jButton1_actionAdapter(this));
        jButton2.setBackground(new Color(148, 206, 204));
        jButton2.setText(".");
        jButton2.addActionListener(new Frame1_jButton2_actionAdapter(this));
        jButton4.setBackground(new Color(148, 170, 196));
        jButton4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton4.setText("+");
        jButton4.addActionListener(new Frame1_jButton4_actionAdapter(this));
        jButton5.setBackground(new Color(148, 170, 196));
        jButton5.setText("=");
        jButton5.addActionListener(new Frame1_jButton5_actionAdapter(this));
        jButton6.setBackground(new Color(148, 206, 204));
        jButton6.setText("0");
        jButton6.addActionListener(new Frame1_jButton6_actionAdapter(this));
        jButton8.setBackground(new Color(148, 170, 196));
        jButton8.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton8.setText("-");
        jButton8.addActionListener(new Frame1_jButton8_actionAdapter(this));
        jButton9.setBackground(new Color(148, 206, 204));
        jButton9.setText("3");
        jButton9.addActionListener(new Frame1_jButton9_actionAdapter(this));
        jButton10.setBackground(new Color(148, 206, 204));
        jButton10.setText("2");
        jButton10.addActionListener(new Frame1_jButton10_actionAdapter(this));
        jButton11.addActionListener(new Frame1_jButton11_actionAdapter(this));
        jButton13.setBackground(new Color(148, 206, 204));
        jButton13.setText("4");
        jButton13.addActionListener(new Frame1_jButton13_actionAdapter(this));
        jButton15.setBackground(new Color(148, 170, 196));
        jButton15.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton15.setText("/");
        jButton15.addActionListener(new Frame1_jButton15_actionAdapter(this));
        jButton16.setBackground(new Color(148, 206, 204));
        jButton16.setToolTipText("");
        jButton16.setText("9");
        jButton16.addActionListener(new Frame1_jButton16_actionAdapter(this));
        jButton17.setBackground(new Color(148, 206, 204));
        jButton17.setText("8");
        jButton17.addActionListener(new Frame1_jButton17_actionAdapter(this));
        jButton18.setBackground(new Color(148, 170, 196));
        jButton18.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton18.setText("*");
        jButton18.addActionListener(new Frame1_jButton18_actionAdapter(this));
        jButton19.setBackground(new Color(148, 206, 204));
        jButton19.setText("6");
        jButton19.addActionListener(new Frame1_jButton19_actionAdapter(this));
        jButton20.setBackground(new Color(148, 206, 204));
        jButton20.setText("5");
        jButton20.addActionListener(new Frame1_jButton20_actionAdapter(this));
        jButton21.setBackground(new Color(228, 186, 132));
        jButton21.setBounds(new Rectangle(143, 33, 96, 27));
        jButton21.setForeground(Color.red);
        jButton21.setIcon(null);
        jButton21.setText("C");
        jButton21.addActionListener(new Frame1_jButton21_actionAdapter(this));
        jPanel2.setBackground(SystemColor.textHighlight);
        jPanel2.setBackground(new Color(204, 205, 204));
        jButton11.setBackground(new Color(148, 206, 204));
        jButton11.setIcon(null);
        jButton11.setRolloverIcon(null);
        jButton11.setRolloverSelectedIcon(null);
        jButton11.setSelectedIcon(null);
        jButton11.setText("1");
        jPanel1.add(jButton1);
        jPanel1.add(jButton17);
        jPanel1.add(jButton16);
        jPanel1.add(jButton15);
        jPanel1.add(jButton13);
        jPanel1.add(jButton20);
        jPanel1.add(jButton19);
        jPanel1.add(jButton18);
        jPanel1.add(jButton11);
        jPanel1.add(jButton10);
        jPanel1.add(jButton9);
        jPanel1.add(jButton8);
        jPanel1.add(jButton6);
        jPanel1.add(jButton2);
        jPanel1.add(jButton5);
        jPanel1.add(jButton4);
        jPanel2.add(jButton21);
        jPanel2.add(jTextField1);
        jPanel2.add(jPanel1);
        jTextField1.setEditable(false);
        this.setTitle("Calculator");
    }

    public void jButton21_actionPerformed(ActionEvent e) {
jTextField1.setText("");
        isare='a';
    }

    public void jButton15_actionPerformed(ActionEvent e) {
        if(isare.charValue()!='a' && yeni==false)
        jButton5.doClick();

        isare='/';
        bufer=jTextField1.getText();
        yeni=true;
        //jTextField1.setText("");
    }

    public void jButton18_actionPerformed(ActionEvent e) {
        if(isare.charValue()!='a' && yeni==false)
        jButton5.doClick();
        isare='*';
        bufer=jTextField1.getText();
        yeni=true;
       // jTextField1.setText("");
    }

    public void jButton8_actionPerformed(ActionEvent e) {
        if(isare.charValue()!='a' && yeni==false)
        jButton5.doClick();
        isare='-';
        bufer=jTextField1.getText();
        yeni=true;
       // jTextField1.setText("");
    }

    public void jButton4_actionPerformed(ActionEvent e) {
        if(isare.charValue()!='a' && yeni==false)
        jButton5.doClick();
        isare='+';
        bufer=jTextField1.getText();
        yeni=true;
       // jTextField1.setText("");
    }

    public void jButton1_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("7");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+7);
    }

    public void jButton6_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("6");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+6);
    }

    public void jButton9_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("3");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+3);
    }

    public void jButton10_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("2");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+2);
    }

    public void jButton11_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("1");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+1);
    }

    public void jButton13_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("4");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+4);
    }

    public void jButton17_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("8");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+8);
    }

    public void jButton16_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("9");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+9);
    }

    public void jButton19_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("6");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+6);
    }

    public void jButton20_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("5");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+5);
    }

    public void jButton5_actionPerformed(ActionEvent e) {
    float a=Float.parseFloat(bufer);
    float b=Float.parseFloat(jTextField1.getText());

            switch(isare.charValue())
            {
          case '/':
             Float c=new Float(a/b);
             jTextField1.setText(c.toString());
             break;
         case '*':
        Float d=new Float(a*b);
        jTextField1.setText(d.toString());
        break;
         case '+':
           Float t=new Float(a+b);
           jTextField1.setText(t.toString());
            break;
        case '-':
          Float p=new Float(a-b);
          jTextField1.setText(p.toString());
          break;
            }
            isare='a';
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        if(yeni==true){
        jTextField1.setText("0.");
        yeni=false;}
        else
        jTextField1.setText(jTextField1.getText()+".");
    }
}


class Frame1_jButton2_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton2_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class Frame1_jButton20_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton20_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton20_actionPerformed(e);
    }
}


class Frame1_jButton5_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton5_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class Frame1_jButton19_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton19_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton19_actionPerformed(e);
    }
}


class Frame1_jButton16_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton16_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton16_actionPerformed(e);
    }
}


class Frame1_jButton17_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton17_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton17_actionPerformed(e);
    }
}


class Frame1_jButton11_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton11_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton11_actionPerformed(e);
    }
}


class Frame1_jButton10_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton10_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton10_actionPerformed(e);
    }
}


class Frame1_jButton9_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton9_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton9_actionPerformed(e);
    }
}


class Frame1_jButton6_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton6_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton6_actionPerformed(e);
    }
}


class Frame1_jButton4_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton4_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}


class Frame1_jButton13_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton13_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton13_actionPerformed(e);
    }
}


class Frame1_jButton8_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton8_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton8_actionPerformed(e);
    }
}


class Frame1_jButton18_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton18_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton18_actionPerformed(e);
    }
}


class Frame1_jButton15_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton15_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton15_actionPerformed(e);
    }
}


class Frame1_jButton1_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton1_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}


class Frame1_jButton21_actionAdapter implements ActionListener {
    private Frame1 adaptee;
    Frame1_jButton21_actionAdapter(Frame1 adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton21_actionPerformed(e);
    }
}
