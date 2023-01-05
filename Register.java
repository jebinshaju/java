import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{


		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t3;
		JTextArea t2;
		JRadioButton male,female;
		JComboBox day,month,year;
		JCheckBox terms;
		JButton submit;
		JLabel msg;
		JTextArea screen;
		
		
	Myframe() {

		setTitle("REGISTERATION FORM");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		l1=new JLabel("Name");
		l1.setBounds(20,50,100,20);
		c.add(l1);

		t1=new JTextField();
		t1.setBounds(130,50,100,20);
		c.add(t1);

		l2=new JLabel("Address");
		l2.setBounds(20,100,100,20);
		c.add(l2);

		t2=new JTextArea();
		t2.setBounds(130,100,100,40);
		c.add(t2);

		l3=new JLabel("Phone Number");
		l3.setBounds(20,150,100,20);
		c.add(l3);

		t3=new JTextField();
		t3.setBounds(130,150,100,20);
		c.add(t3);

		l4=new JLabel("Gender");
		l4.setBounds(20,200,100,20);
		c.add(l4);

		male=new JRadioButton("Male");
		female= new JRadioButton("Female");
		
		male.setBounds(130,200,80,20);
		female.setBounds(220,200,80,20);
		male.setSelected(true);

		c.add(male);
		c.add(female);

		ButtonGroup gen=new ButtonGroup();
		gen.add(male);
		gen.add(female);

		l5=new JLabel("Date of Birth");
		l5.setBounds(20,250,80,20);
		c.add(l5);

		String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
		"16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		String years[]={"2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993",
		"1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980"};

		day=new JComboBox(days);
		month=new JComboBox(months);
		year=new JComboBox(years);

		day.setBounds(120,250,80,20);
		month.setBounds(220,250,80,20);
		year.setBounds(320,250,80,20);

		c.add(day);
		c.add(month);
		c.add(year);

		
		terms=new JCheckBox("Agree to Our Terms and Conditions");
		terms.setBounds(50,300,300,20);
		c.add(terms);

		submit=new JButton("Submit");
		submit.setBounds(300,350,100,20);
		c.add(submit);
		
		submit.addActionListener(this);
		
		screen=new JTextArea();
		screen.setBounds(450,50,300,200);
		c.add(screen);

		msg=new JLabel();
		msg.setBounds(20,400,200,20);
		c.add(msg);
	

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if(terms.isSelected()) {
				
				msg.setText("Registration Successfull...");

				String name=t1.getText();
				String address=t2.getText();
				String phone=t3.getText();
				String gender="Male";
				if(female.isSelected()) {
					gender="Female";
					}
				String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();

				screen.setText("Name : "+name+"\n"+"Address : "+address+"\n"+"Phone : "+phone+"\n"+"Gender : "+gender+"\n"+"Date of Birth : "+dob);
				
				
				
		}
		
		else {
		
			msg.setText("Agree to Terms and Conditions First!!!");
			}			
				
	}

}

class Register {
	public static void main(String args[]) {

			Myframe frame=new Myframe();



	}

}