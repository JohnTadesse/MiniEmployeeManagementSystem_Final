/**
 * @author Jeffery
 * This class is to create the view of the database
 */
package com.ems;
import java.awt.*;
import javax.swing.*;
import java.util.*;



public class View {
	//declare the swing components
	JFrame jf;
	JPanel jp1,jp2,jp3;
	JLabel jl1;
	JButton jbt1,jbt2,jbt3,jbt4,jbt5,jbt6,jbt7;
	JTable jtb1;
	JScrollPane jsp1;
	JTextField jtf1;
	
	public View(){
		//Initialize the swing components
		jf = new JFrame();
		jf.setLayout(new BorderLayout(10,10));
		//set the space between JPanel and JFrame
		((JPanel)jf.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		//Initialize JPanel, set up layout for each JPanel and add these components on JPanel
		jp1 = new JPanel();
		jp1.setPreferredSize(new Dimension(580,30));
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		jtf1 = new JTextField(31);
		jtf1.setToolTipText("Please Enter Your First name");
		jtf1.setPreferredSize(new Dimension(100,30));
		jbt1 = new JButton(" Find ");
		jbt1.setPreferredSize(new Dimension(100,30));
		jp1.add(jtf1);
		jp1.add(jbt1);
		
		jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,5));
		jp2.setPreferredSize(new Dimension(120,300));
		jbt2 = new JButton("Add");
		jbt2.setPreferredSize(new Dimension(120,30));
		jbt2.setToolTipText("Add New Employee");
		jbt3 = new JButton("Delete");
		jbt3.setPreferredSize(new Dimension(120,30));
		jbt3.setToolTipText("Delete Existing Employee");
		jbt4 = new JButton("Modify");
		jbt4.setPreferredSize(new Dimension(120,30));
		jbt4.setToolTipText("Modify Data of current Employee");
		jbt5 = new JButton("Person");
		jbt5.setPreferredSize(new Dimension(120,30));
		jbt5.setToolTipText("View All Person Info");
		jbt6 = new JButton("Department");
		jbt6.setPreferredSize(new Dimension(120,30));
		jbt6.setToolTipText("View All Department Info");
		jbt7 = new JButton("Exit");
		jbt7.setPreferredSize(new Dimension(120,30));
		jbt7.setToolTipText("Exit The System");
		jp2.add(jbt2);
		jp2.add(jbt3);
		jp2.add(jbt4);
		jp2.add(jbt5);
		jp2.add(jbt6);
		jp2.add(jbt7);
		
		jp3 = new JPanel();
		jtb1 = new JTable();
		jsp1 = new JScrollPane(jtb1);
		jsp1.setPreferredSize(new Dimension(450,280));
		jp3.add(jsp1);
		
		//Here using the border layout for the JFrame and add all JPanel on JFrame
		jf.add(jp1,"North");
		jf.add(jp2,"East");
		jf.add(jp3,"West");
		
		jf.setTitle("Employee Management System");
		jf.setSize(620,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new View();
	}

}
