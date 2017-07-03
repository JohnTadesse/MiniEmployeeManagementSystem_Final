/**
 * @author Jeffery
 * This class is to create the view of the database
 */
package com.view;

import com.model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.TableModel;

import java.util.*;



public class MainView implements ActionListener{
	//declare the swing components
	JFrame jf;
	JPanel jp1,jp2,jp3;
	JLabel jl1;
	JButton jbt1,jbt2,jbt3,jbt4,jbt5,jbt6,jbt7,jbt8;
	JTable jtb1;
	JScrollPane jsp1;
	JTextField jtf1;
	
	public MainView(){
		//Initialize the swing components
		jf = new JFrame();
		jf.setLayout(new BorderLayout(10,10));
		//set the space between JPanel and JFrame
		((JPanel)jf.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		//Initialize JPanel, set up layout for each JPanel and add these components on JPanel
		//Add action listener on each button
		jp1 = new JPanel();
		jp1.setPreferredSize(new Dimension(580,30));
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		jtf1 = new JTextField(31);
		jtf1.setToolTipText("Please Enter Your First name");
		jtf1.setPreferredSize(new Dimension(100,30));
		jbt1 = new JButton("Search");
		jbt1.setPreferredSize(new Dimension(100,30));
		jbt1.setToolTipText("Search Employee");
		jbt1.addActionListener(this);
		jbt1.setActionCommand("search");
		jp1.add(jtf1);
		jp1.add(jbt1);
		
		jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER,0,5));
		jp2.setPreferredSize(new Dimension(120,300));
		
		jbt2 = new JButton("Employee");
		jbt2.setPreferredSize(new Dimension(120,30));
		jbt2.setToolTipText("View All Employee Info");
		jbt2.addActionListener(this);
		jbt2.setActionCommand("employee");
		
		jbt3 = new JButton("Department");
		jbt3.setPreferredSize(new Dimension(120,30));
		jbt3.setToolTipText("View All Department Info");
		jbt3.addActionListener(this);
		jbt3.setActionCommand("department");
		
		jbt4 = new JButton("Person");
		jbt4.setPreferredSize(new Dimension(120,30));
		jbt4.setToolTipText("View All Person Info");
		jbt4.addActionListener(this);
		jbt4.setActionCommand("person");
		
		jbt5 = new JButton("Add");
		jbt5.setPreferredSize(new Dimension(120,30));
		jbt5.setToolTipText("Add New Employee");
		jbt5.addActionListener(this);
		jbt5.setActionCommand("add");
		
		jbt6 = new JButton("Update");
		jbt6.setPreferredSize(new Dimension(120,30));
		jbt6.setToolTipText("Update Data of current Employee");
		jbt6.addActionListener(this);
		jbt6.setActionCommand("update");
		
		jbt7 = new JButton("Delete");
		jbt7.setPreferredSize(new Dimension(120,30));
		jbt7.setToolTipText("Delete Existing Employee");
		jbt7.addActionListener(this);
		jbt7.setActionCommand("delete");
			
		jbt8 = new JButton("Exit");
		jbt8.setPreferredSize(new Dimension(120,30));
		jbt8.setToolTipText("Exit The System");
		jbt8.addActionListener(this);
		jbt8.setActionCommand("exit");
		
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
		new MainView();
	}
	
	//Catch the action and pass the SQL query
	@Override
	public void actionPerformed(ActionEvent a) {
		Model mdl = null;
		Dialog dlg = null;
		// TODO Auto-generated method stub
		if(a.getActionCommand().equals("search")){
			//Get the first name from text field
			String firstName = this.jtf1.getText().trim();
			//Generate query
			String query = "select * from employee where firstName = '" + firstName + "'" ;
			//Create model object to send the query
			mdl = new Model();
			mdl.printTable(query, "employee");
			//Update the table
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("employee")){
			//Generate query
			String query = "select * from employee";
			//Create model object to send the query
			mdl = new Model();
			mdl.printTable(query, "employee");
			//Update the table
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("person")){
			//Generate query
			String query = "select * from person" ;
			//Create model object to send the query
			mdl = new Model();
			mdl.printTable(query, "person");
			//Update the table
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("department")){
			//Generate query
			String query = "select * from department" ;
			//Create model object to send the query
			mdl = new Model();
			mdl.printTable(query, "department");
			//Update the table
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("add")){
			dlg = new Dialog(jf, "Add New Employee", true);
		}else if(a.getActionCommand().equals("update")){
			dlg = new Dialog(jf, "Update Current Employee", true);
		}else if(a.getActionCommand().equals("delete")){
			System.out.println("You click the delete");
		}else if(a.getActionCommand().equals("exit")){
			System.out.println("You click the exit");
		}
	}

}
