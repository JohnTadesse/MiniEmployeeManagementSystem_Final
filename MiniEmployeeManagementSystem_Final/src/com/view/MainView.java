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
	Model mdl = null;
	
	public MainView(){
		//Initialize the swing components
		jf = new JFrame();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		jf.setLocation(dim.width/2, dim.height/2);
		jf.setLayout(new BorderLayout(10,10));
		//set the space between JPanel and JFrame
		((JPanel)jf.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		//Initialize JPanel, set up layout for each JPanel and add these components on JPanel
		//Add action listener on each button
		jp1 = new JPanel();
		jp1.setPreferredSize(new Dimension(600,30));
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT,7,0));
		jtf1 = new JTextField(48);
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
		
		jbt4 = new JButton("Add");
		jbt4.setPreferredSize(new Dimension(120,30));
		jbt4.setToolTipText("Add New Employee");
		jbt4.addActionListener(this);
		jbt4.setActionCommand("add");
		
		jbt5 = new JButton("Update");
		jbt5.setPreferredSize(new Dimension(120,30));
		jbt5.setToolTipText("Update Data of current Employee");
		jbt5.addActionListener(this);
		jbt5.setActionCommand("update");
		
		jbt6 = new JButton("Delete");
		jbt6.setPreferredSize(new Dimension(120,30));
		jbt6.setToolTipText("Delete Existing Employee");
		jbt6.addActionListener(this);
		jbt6.setActionCommand("delete");
			
		jbt7 = new JButton("Exit");
		jbt7.setPreferredSize(new Dimension(120,30));
		jbt7.setToolTipText("Exit The System");
		jbt7.addActionListener(this);
		jbt7.setActionCommand("exit");
		
		jp2.add(jbt2);
		jp2.add(jbt3);
		jp2.add(jbt4);
		jp2.add(jbt5);
		jp2.add(jbt6);
		jp2.add(jbt7);
		
		jp3 = new JPanel();
		jtb1 = new JTable();
		jsp1 = new JScrollPane(jtb1);
		jsp1.setPreferredSize(new Dimension(640,280));
		jp3.add(jsp1);
		
		//Here using the border layout for the JFrame and add all JPanel on JFrame
		jf.add(jp1,"North");
		jf.add(jp2,"East");
		jf.add(jp3,"West");
		
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setTitle("Employee Management System");
		jf.setSize(800,400);
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
		
		Dialog dlg = null;
		// TODO Auto-generated method stub
		if(a.getActionCommand().equals("search")){
			//Get the first name from text field
			String firstName = this.jtf1.getText().trim();
			//Generate query
			String query = "select * from employee where firstName = '" + firstName + "'" ;
			//Create model object to send the query
			mdl = new Model();
			mdl.generateTable(query, "employee");
			int rowCount = mdl.getRowCount();
			if(rowCount<1){
				JOptionPane.showMessageDialog(jf, "Not Such Name!");
				return;
			}
			//Update the table and set the size of column
			jtb1.setModel(mdl);
			jtb1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			jtb1.getColumnModel().getColumn(0).setMaxWidth(40);
			jtb1.getColumnModel().getColumn(3).setMaxWidth(60);
			jtb1.getColumnModel().getColumn(4).setMaxWidth(50);
			jtb1.getColumnModel().getColumn(5).setMaxWidth(60);
			jtb1.getColumnModel().getColumn(6).setMinWidth(100);
			jtb1.getColumnModel().getColumn(7).setMinWidth(100);
			jtb1.getColumnModel().getColumn(8).setMinWidth(110);
		}else if(a.getActionCommand().equals("employee")){
			//employee table is edible so we show those buttons
			this.jbt4.setEnabled(true);
			this.jbt5.setEnabled(true);
			this.jbt6.setEnabled(true);
			//Generate query
			String query = "select * from employee";
			//Create model object to send the query
			mdl = new Model();
			mdl.generateTable(query, "employee");
			//Update the table
			jtb1.setModel(mdl);
			//Update the table and set the size of column
			jtb1.setModel(mdl);
			jtb1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			jtb1.getColumnModel().getColumn(0).setMaxWidth(40);
			jtb1.getColumnModel().getColumn(3).setMaxWidth(60);
			jtb1.getColumnModel().getColumn(4).setMaxWidth(50);
			jtb1.getColumnModel().getColumn(5).setMaxWidth(60);
			jtb1.getColumnModel().getColumn(6).setMinWidth(100);
			jtb1.getColumnModel().getColumn(7).setMinWidth(100);
			jtb1.getColumnModel().getColumn(8).setMinWidth(110);
		}else if(a.getActionCommand().equals("department")){
			//department table are not editable so we disable those buttons
			this.jbt4.setEnabled(false);
			this.jbt5.setEnabled(false);
			this.jbt6.setEnabled(false);
			//Generate query
			String query = "select * from department" ;
			//Create model object to send the query
			mdl = new Model();
			mdl.generateTable(query, "department");
			//Update the table
			jtb1.setModel(mdl);
			//auto resize the table because not much content inside the cell
			jtb1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		}else if(a.getActionCommand().equals("add")){
			dlg = new Dialog(jf, "Add New Employee", true);
			//After add new employee, update the table by 
			//calling show all employee again
			String query = "select * from employee";
			mdl = new Model();
			mdl.generateTable(query, "employee");
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("update")){
			//select row from table to update
			int rowIndex = this.jtb1.getSelectedRow();
			System.out.println("rowIndex is " + rowIndex);
			if(rowIndex == -1){
				JOptionPane.showMessageDialog(null, "Please Select A Row");
				return;
			}
			new Dialog(jf, "Update Current Employee", true,mdl, rowIndex);
			//After update employee, update the table by 
			//calling show all employee again
			String query = "select * from employee";
			mdl = new Model();
			mdl.generateTable(query, "employee");
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("delete")){
			int rowIndex = this.jtb1.getSelectedRow();
			if(rowIndex == -1){
				JOptionPane.showMessageDialog(null, "Please Select A Row");
				return;
			}
			//Get the employee id from selected row
			String empId = (mdl.getValueAt(rowIndex, 0)).toString();
			String query = "delete from employee where empId = " + empId;
			mdl.query(query);
			//After delete employee, update the table by 
			//calling show all employee again
			String resetQuery = "select * from employee";
			mdl = new Model();
			mdl.generateTable(resetQuery, "employee");
			jtb1.setModel(mdl);
		}else if(a.getActionCommand().equals("exit")){
			System.exit(0);
		}
	}

}
