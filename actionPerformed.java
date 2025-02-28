import java.awt.*;
import java.awt.event.*;

class ButtonDemo implements ActionListener
{
Button b1,b2;
Frame f;

ButtonDemo()
{
f=new Frame();
b1=new Button("First");
b2=new Button("Second");
f.add(b1);
f.add(b2);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.setSize(400,400);
f.setTitle("Button Application");
b1.addActionListener(this);
b2.addActionListener(this);
}
}
public void ActionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
System.out.println("First Button is clicked");
}


if(ae.getSource()==b2)
{
System.out.println("Second Button is clicked");
}


public static void main(String args[])
{
new ButtonDemo();
}
}













