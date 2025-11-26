import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TabbedDemo extends JFrame{
	Label l;
	TabbedDemo(){
		super("Tabbed Pane Demo");
		JTabbedPane jtp = new JTabbedPane(3);
		//JTabbedPane jtp1 = new JTabbedPane();
		jtp.addTab("Tab1",new Label("Tabbed pane 1"));
		//JTabbedPane jtp2 = new JTabbedPane();
		jtp.addTab("Tab2",new Label("Tabbed pane 2"));
		//JTabbedPane jtp3 = new JTabbedPane();
		jtp.addTab("Tab3",new Label("Tabbed pane 3"));
		
		/*jtp.addTab("Tab1",jtp1);
		jtp.addTab("Tab2",jtp2);
		jtp.addTab("Tab3",jtp3);*/
		
		add(jtp);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TabbedDemo();
	}
}
		
