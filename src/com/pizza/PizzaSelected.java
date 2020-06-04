package com.pizza;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class PizzaSelected extends JFrame
{
JPanel jp;
JLabel Ibltitle, Ibltype, Iblcategory, Iblveg, Ibltypeselected, Iblcategoryselected, Iblvegselected;
Container c;
PizzaSelected(Vector v)
{
jp=new JPanel();
jp.setBounds(20, 10, 750, 550);
jp.setLayout(null);
//Adding all labels
Ibltitle=new JLabel("Your Pizza...");
Ibltitle.setForeground(java.awt.Color.RED);
Ibltitle.setBounds(100, 30, 700, 50 );
Ibltitle.setFont(new Font("Courier New", Font.ITALIC, 40));
jp.add(Ibltitle);
//==================
Ibltype=new JLabel("Base Type :");
Ibltype.setForeground(java.awt.Color.BLACK);
Ibltype.setBounds (20, 50, 175, 100);
Ibltype.setFont(new Font("Times New Roman", Font.BOLD, 14));
jp.add(Ibltype);
Ibltypeselected=new JLabel();
Ibltypeselected.setForeground(java.awt.Color.BLUE);
Ibltypeselected.setBounds(150, 50, 175, 100);
Ibltypeselected.setFont(new Font("Times New Roman", Font.BOLD, 14));
jp.add(Ibltypeselected);
//=====================
Iblcategory=new JLabel("Category :");
Iblcategory.setForeground(java.awt.Color.BLACK);
Iblcategory.setBounds(20, 100, 175, 100);
Iblcategory.setFont(new Font("Times New Roman", Font.BOLD, 14));
jp.add(Iblcategory);
Iblcategoryselected=new JLabel();
Iblcategoryselected.setForeground(java.awt.Color.BLUE);
Iblcategoryselected.setBounds(150, 100, 175, 100);
Iblcategoryselected.setFont(new Font("Times New Roman", Font.BOLD, 14));
jp.add(Iblcategoryselected);
//=======================
Iblveg=new JLabel("Veggies Included ");
Iblveg.setForeground(java.awt.Color.BLACK);
Iblveg.setBounds(20, 150, 175, 100);
Iblveg.setFont(new Font("Times New Roman", Font.BOLD, 14));
jp.add(Iblveg);

Iblvegselected = new JLabel();
Iblvegselected.setForeground(java.awt.Color.BLUE);
Iblvegselected.setBounds(150,150, 350,100);
Iblvegselected.setFont(new Font("Times New Roman", Font.BOLD, 14));
jp.add(Iblvegselected);

add(jp);
setSize(800, 600);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c=getContentPane();// this changes the colour of the entire window to grey
c.setBackground(Color.LIGHT_GRAY);
jp.setBackground(Color.white);//this changes the colour of the frame
setTitle("YOUR PIZZA");
setVisible(true);
this.setResizable(false);
this.setLocationRelativeTo(null);
displayData(v);
}
void displayData(Vector v)
{
Ibltypeselected.setText(v.get(0).toString());
Iblcategoryselected.setText(v.get(1).toString());
for (int i=2;i<v.size();i++)
Iblvegselected.setText(Iblvegselected.getText() +" : "+ v.get(i).toString());
}
}