/*	范例名称：Frame 应用举例
 * 	源文件名称：TestFrame.java
 *	要  点：Frame组件的创建及显示设置
 */

import java.awt.*;
public class TestFrame {
	public static void main( String args[]) {
		Frame f = new Frame("My First Test");
		f.setLocation(300, 300);
		f.setSize( 170,100);
		f.setBackground( Color.blue);
		f.setResizable(false);
		f.setVisible( true);
	}
}

-----------------------------------------------
//MyFrame继承Frame再去new MyFrame，相比直接new Frame更加合适
import java.awt.*;

public class TestMultiFrame {
    public static void main(String args[]) {
        MyFrame f1 = 
            new MyFrame(100,100,200,200,Color.BLUE);
        MyFrame f2 = 
            new MyFrame(300,100,200,200,Color.YELLOW);
        MyFrame f3 = 
            new MyFrame(100,300,200,200,Color.GREEN);
        MyFrame f4 = 
            new MyFrame(300,300,200,200,Color.MAGENTA);
    }
}




class MyFrame extends Frame{
    static int id = 0;
    MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame " + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
