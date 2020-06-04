package com.pizza;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Pizzamaker extends JFrame implements ActionListener
{
JPanel jp;
JLabel Ibltitle, Ibltype, Iblcategory,Iblveg;
JRadioButton b1,b2,b3;
JComboBox pref;
JCheckBox opt1, opt2, opt3, opt4, opt5;
JButton done;
Container c;
String s;
ButtonGroup bg;
Vector selection;
//this will store the final selection made by the user
Pizzamaker()
{
jp=new JPanel();
jp.setBounds(20, 10, 750, 550);
jp.setLayout(null);


//Adding all labels

Ibltitle=new JLabel("WELCOME TO PIZZA MAKER");
Ibltitle.setForeground(java.awt.Color.RED);
Ibltitle.setBounds(100, 30, 700, 50 );
Ibltitle.setFont(new Font("Courier New", Font.ITALIC, 40));
jp.add(Ibltitle);
Ibltype=new JLabel("Please Select The Base Type");
Ibltype.setForeground(java.awt.Color.BLUE);
Ibltype.setBounds(20, 50, 175, 100);
Ibltype.setFont(new Font("ARIAL", Font.BOLD, 12));
jp.add(Ibltype);
Iblcategory=new JLabel("Please Select your preference");
Iblcategory.setForeground(java.awt.Color.BLUE);
Iblcategory.setBounds (20, 100, 175, 100);
Iblcategory.setFont(new Font("ARIAL", Font.BOLD, 12));
jp.add(Iblcategory);
Iblveg= new JLabel("Please Select your Veggies");
Iblveg.setForeground (java.awt.Color.BLUE);
Iblveg.setBounds(20,175, 175, 100);
Iblveg.setFont(new Font("ARIAL", Font.BOLD, 12));
jp.add(Iblveg);
//Adding radio buttons
b1=new JRadioButton("Normal");
b2=new JRadioButton("Thin Crust");
b3=new JRadioButton("Wafer Thin ");
bg=new ButtonGroup();
b1.setBounds(200, 80, 100, 30);
b2.setBounds(300, 80, 100, 30);
b3.setBounds(400, 80, 100, 30);
b1.setBackground(Color.WHITE);
b2.setBackground(Color.WHITE);
b3.setBackground(Color.WHITE);
bg.add(b1);
bg.add(b2);
bg.add(b3);
jp.add(b1);
jp.add(b2);
jp.add(b3);
//Adding Combo box
String[] options={"Vegetarian", "Non-Vegetarian"};
pref=new JComboBox(options);
pref.setBounds(200, 140, 150, 30);
pref.setBackground(Color. WHITE);
jp.add(pref);
//adding check boxes
opt1=new JCheckBox("Onion");
opt2=new JCheckBox("Tomato");
opt3=new JCheckBox("Capsicum");
opt4=new JCheckBox("Mushroom");
opt5=new JCheckBox("Jalapenos");
opt1.setBackground(Color.WHITE);
opt2.setBackground(Color.WHITE);
opt3.setBackground(Color.WHITE);
opt4.setBackground(Color.WHITE);
opt5.setBackground(Color.WHITE);
opt1.setBounds(50, 250, 100, 30);
jp.add(opt1);
opt2.setBounds(160, 250, 100, 30);
jp.add(opt2);
opt3.setBounds(270, 250, 100, 30);
jp.add(opt3);
opt4.setBounds(380, 250, 100, 30);
jp.add(opt4);
opt5.setBounds(490, 250, 100, 30);
jp.add(opt5);
//adding button
done=new JButton("MAKE MY PIZZA");
done.setBounds(200, 400, 300, 50);
jp.add(done);
selection=new Vector(8,2);
//THis will set properties for the entire frame.
setLayout(null);
add(jp);
setSize(800, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c = getContentPane();// this changes the colour of the entire window to grey
c.setBackground(Color.LIGHT_GRAY);
jp.setBackground(Color.white);//this changes the colour of the frame
setTitle("Make your own Pizza");
setVisible(true);
this.setResizable(false);
this.setLocationRelativeTo(null);//this displays the screen in center
//adding all listeners
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
pref.addActionListener(this);
opt1.addActionListener(this);
opt2.addActionListener(this);
opt3.addActionListener(this);
opt4.addActionListener(this);
opt5.addActionListener(this);
done.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e)
{
if (e.getSource()==b1)
{
selection.insertElementAt(b3.getText(),0);
b2.setEnabled(false);
b3.setEnabled(false);
}
if (e.getSource()==b2)
selection.insertElementAt(b3.getText(),0);
{
b1.setEnabled(false);
b3.setEnabled(false);
}
if (e.getSource()==b3)
{
selection.add(b3.getText());
b1.setEnabled(false);
b2.setEnabled(false);
}
if (e.getSource()==b3)
{
selection.insertElementAt(b3.getText(),0);
b1.setEnabled(false);
b2.setEnabled(false);
}
if (e.getSource()==pref)
{
selection.insertElementAt(pref.getSelectedItem(),1); 

//Veg or non veg will always go at index 1 only. in case user changes previous selected option, we want the new option to overwrite the previous one

}
if (e.getSource()==opt1)
{
selection.add(opt1.getText());
}
if (e.getSource()==opt2)
{
selection.add(opt2.getText());
}
if (e.getSource()==opt3)
{
selection.add(opt3.getText());
}
if (e.getSource()==opt4)
{
selection.add(opt4.getText());
}
if (e.getSource()==opt5)
{
selection.add(opt5.getText());
}
if (e.getSource()==done)
{
PizzaSelected p=new PizzaSelected(selection);
}
}
}