package com.view;
import com.model.Model;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Dialog extends JDialog implements ActionListener{
	//Declare the swing components
	JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10;
	JButton jbt1,jbt2;
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9,jtf10;
	JPanel jp1,jp2,jp3;
	
	//Creates a dialog box with the specified Dialog owner,
	//title, and modality.
	//Frame: Parent frame
	//Modal: If model is true, then when this window is open, others
	//will be blocked
	public Dialog (Frame owner, String title, boolean modal){
		super(owner,title,modal);
		if(title.equals("Add New Employee")){
			//Create panel 1 and labels then add all labels to panel 1
			jp1 = new JPanel();
			jlb1 = new JLabel("LastName");
			jlb2 = new JLabel("FirstName");
			jlb3 = new JLabel("SIN#");
			jlb4 = new JLabel("Department Id");
			jlb5 = new JLabel("Position");
			jlb6 = new JLabel("Base Salary");
			jlb7 = new JLabel("Gender");
			jlb8 = new JLabel("Age");
			jlb9 = new JLabel("Email Adress");
			jlb10 = new JLabel("Phone#");
			jp1.add(jlb1);
			jp1.add(jlb2);
			jp1.add(jlb3);
			jp1.add(jlb4);
			jp1.add(jlb5);
			jp1.add(jlb6);
			jp1.add(jlb7);
			jp1.add(jlb8);
			jp1.add(jlb9);
			jp1.add(jlb10);
			
			//Create panel 2 and text fields
			//then add all text fields to panel 2
			jp2 = new JPanel();
			jtf1 = new JTextField();
			jtf2 = new JTextField();
			jtf3 = new JTextField();
			jtf4 = new JTextField();
			jtf5 = new JTextField();
			jtf6 = new JTextField();
			jtf7 = new JTextField();
			jtf8 = new JTextField();
			jtf9 = new JTextField();
			jtf10 = new JTextField();
			jp2.add(jtf1);
			jp2.add(jtf2);
			jp2.add(jtf3);
			jp2.add(jtf4);
			jp2.add(jtf5);
			jp2.add(jtf6);
			jp2.add(jtf7);
			jp2.add(jtf8);
			jp2.add(jtf9);
			jp2.add(jtf10);
			
			//Create panel 3 and buttons
			//then add all buttons to panel 3
			jp3 = new JPanel();
			jbt1 = new JButton("Add");
			jbt1.addActionListener(this);
			jbt1.setActionCommand("add");
			jbt2 = new JButton("Cancle");
			jbt2.addActionListener(this);
			jbt2.setActionCommand("cancel");
			jp3.add(jbt1);
			jp3.add(jbt2);
			
			//Set layout
			jp1.setLayout(new GridLayout(10,1));
			jp2.setLayout(new GridLayout(10,1));
			
			this.add(jp1, BorderLayout.WEST);
			this.add(jp2, BorderLayout.CENTER);
			this.add(jp3, BorderLayout.SOUTH);
			
			this.setSize(400,300);
			this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
			this.setVisible(true);
			
			
		}else if(title.equals("Update Current Employee")){
			//Create panel 1 and labels then add all labels to panel 1
			jp1 = new JPanel();
			jlb1 = new JLabel("LastName");
			jlb2 = new JLabel("FirstName");
			jlb3 = new JLabel("SIN#");
			jlb4 = new JLabel("Department Id");
			jlb5 = new JLabel("Position");
			jlb6 = new JLabel("Base Salary");
			jlb7 = new JLabel("Gender");
			jlb8 = new JLabel("Age");
			jlb9 = new JLabel("Email Adress");
			jlb10 = new JLabel("Phone#");
			jp1.add(jlb1);
			jp1.add(jlb2);
			jp1.add(jlb3);
			jp1.add(jlb4);
			jp1.add(jlb5);
			jp1.add(jlb6);
			jp1.add(jlb7);
			jp1.add(jlb8);
			jp1.add(jlb9);
			jp1.add(jlb10);
			
			//Create panel 2 and text fields
			//then add all text fields to panel 2
			jp2 = new JPanel();
			jtf1 = new JTextField();
			jtf2 = new JTextField();
			jtf3 = new JTextField();
			jtf4 = new JTextField();
			jtf5 = new JTextField();
			jtf6 = new JTextField();
			jtf7 = new JTextField();
			jtf8 = new JTextField();
			jtf9 = new JTextField();
			jtf10 = new JTextField();
			jp2.add(jtf1);
			jp2.add(jtf2);
			jp2.add(jtf3);
			jp2.add(jtf4);
			jp2.add(jtf5);
			jp2.add(jtf6);
			jp2.add(jtf7);
			jp2.add(jtf8);
			jp2.add(jtf9);
			jp2.add(jtf10);
			
			//Create panel 3 and buttons
			//then add all buttons to panel 3
			jp3 = new JPanel();
			jbt1 = new JButton("Update");
			jbt1.addActionListener(this);
			jbt1.setActionCommand("update");
			jbt2 = new JButton("Cancel");
			jbt2.addActionListener(this);
			jbt2.setActionCommand("cancel");
			jp3.add(jbt1);
			jp3.add(jbt2);
			
			//Set layout
			jp1.setLayout(new GridLayout(10,1));
			jp2.setLayout(new GridLayout(10,1));
			
			this.add(jp1, BorderLayout.WEST);
			this.add(jp2, BorderLayout.CENTER);
			this.add(jp3, BorderLayout.SOUTH);
			
			this.setSize(400,300);
			this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
			this.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		Model mdl = null;
		// TODO Auto-generated method stub
		if(a.getActionCommand().equals("add")){
			mdl = new Model();
			String addEmployee = "insert into employee (lastName,firstName,sinNum,"
					+ "departmentId, position, baseSalary) values (" + "'" + jtf1.getText() +"'"+", " + "'" +jtf2.getText()+"'"
					+", "+ jtf3.getText() + ", " + jtf4.getText()+", "+ "'" +jtf5.getText()+ "'"+", " + jtf6.getText()+")";
			String addPerson = "insert into person (sinNum,gender,age,emailAddr, phoneNum) "
					+ "values (" + jtf3.getText() +", " +"'"+ jtf7.getText()+"'"
					+", "+ jtf8.getText() + ", " + "'"+jtf9.getText()+"'"+", "+ jtf10.getText() + ")";
//			mdl.query(addPerson);
//			mdl.query(addEmployee);
			if(!mdl.query(addPerson)||!mdl.query(addEmployee)){
				JOptionPane.showMessageDialog(this, "Add Employee Failed");
			}
			
			this.dispose();
		}else if(a.getActionCommand().equals("update")){
			System.out.println("update clicked");
		}else if(a.getActionCommand().equals("cancel")){
			this.dispose();
		}
	}
}
