import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TableDemo extends JFrame{
	Label l;
	TableDemo(){
		super("JTable Demo");
		String[] heading = {"Name", "Course", "Roll No"};
		
		String[][] data = {
						{"DELL", "CSE", "24AG1A05H1"},
						{"BELL", "CSE", "24AG1A05H2"},
						{"CELL", "CSE", "24AG1A05I2"},
						{"HELL", "CSE", "24AG1A05E6"},
					   };
		
		
		JTable jt = new JTable(data, heading);
		JScrollPane jsp = new JScrollPane(jt);
		//jsp.add(jt);
		
		add(jsp);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TableDemo();
	}
}
