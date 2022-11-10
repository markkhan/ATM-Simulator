package ASimulatorSystem;
import javax.swing.*;
public class table
{
	JFrame f;
	table()
	{
		f=new JFrame();
		String data[][]={ {"500","1000"},{"2000","3000"}, {"3000","4000"}}; 
		String column[]={"WITHDRAWL(RS)","DEPOSIT(DEPOSIT(RS)"};
		JTable jt=new JTable(data,column); 
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt); 
		f.add(sp);    
		f.setSize(300,400);
		f.setVisible(true);
	}
}
