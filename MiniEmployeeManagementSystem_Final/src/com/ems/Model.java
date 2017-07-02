package com.ems;

import javax.swing.table.AbstractTableModel;
import java.util.Vector;

/**
 * This class is to create the model. It will display the data fetched
 * from database
 * @author Jeffery
 *
 */
public class Model extends AbstractTableModel{
	
	//To store the data of each row
	Vector rowData;
	//To create the column title
	Vector<String> columnTitle;
	
	public void printTable(String query, String tableName){
		columnTitle = new Vector<String>();
		//Fill the title column with column name of employee table  
		if(tableName.equals("Employee")){
			columnTitle.add("EmployeeId");
			columnTitle.add("LastName");
			columnTitle.add("FirstName");
			columnTitle.add("SIN#");
			columnTitle.add("DepartmentId");
			columnTitle.add("Position");
			columnTitle.add("BaseSalary");
			
			rowData = new Vector();
			
		}else if(tableName.equals("Person")){
			columnTitle.add("SIN#");
			columnTitle.add("Gender");
			columnTitle.add("Age");
			columnTitle.add("Email");
			columnTitle.add("Phone#");

			
			rowData = new Vector();
			
		}else if(tableName.equals("Department")){
			columnTitle.add("DepartmentId");
			columnTitle.add("DepartmentName");
			columnTitle.add("DepartmentDuty");

			rowData = new Vector();
			
		}
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
