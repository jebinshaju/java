import javax.swing.*;
import java.awt.event.*;
class SReg extends JFrame implements ActionListener
{
	private JLabel title,name,addr,adm,gen,dob,crs,pcrs,qualy;
	private JTextField tname,tadm;
	private JTextArea taddr;
	private JRadioButton male,fmale;
	private ButtonGroup tgen;
	private JComboBox date,mnths,yr,tcrs;
	private JButton sub,reset,ok;
	private JCheckBox c1,c2; 
	private JDialog d;
	private String sdate[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	private String smnths[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	private String syr[]={"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007"};
	private String scrs[]={"Computer Science","Civil","Mechanical","Electrical and Elecrtonics","Electronics and Communication"};
	public SReg()
	{
		setTitle("Student Registration Form");
		setSize(1240,980);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		title=new JLabel("STUDENT REGISTRATION FORM");
		title.setBounds(300,30,300,30);
		name=new JLabel("Name");
		name.setBounds(100,100,100,20);
		tname=new JTextField();
		tname.setBounds(200,100,200,20);
		addr=new JLabel("Address");
		addr.setBounds(100,130,100,20);
		taddr=new JTextArea();
		taddr.setBounds(200,130,230,60);
		adm=new JLabel("Adm no.");
		adm.setBounds(100,200,100,20);
		tadm=new JTextField();
		tadm.setBounds(200,200,200,20);
		gen=new JLabel("Gender");
		gen.setBounds(100,230,100,20);
		male=new JRadioButton("Male");
		male.setSelected(false);
		male.setBounds(200,230,75,20);
		fmale=new JRadioButton("Female");
		fmale.setSelected(false);
		fmale.setBounds(275,230,85,20);
		tgen=new ButtonGroup();
		tgen.add(male);
		tgen.add(fmale);
		dob=new JLabel("DOB");
		dob.setBounds(100,260,100,20);
		date=new JComboBox(sdate);
		date.setBounds(200,260,50,20);
		mnths=new JComboBox(smnths);
		mnths.setBounds(250,260,100,20);
		yr=new JComboBox(syr);
		yr.setBounds(350,260,80,20);
		crs=new JLabel("Course");
		crs.setBounds(100,290,100,20);
		tcrs=new JComboBox(scrs);
		tcrs.setBounds(200,290,200,20);
		pcrs=new JLabel("Engineering");
		pcrs.setBounds(410,290,100,20);
		qualy=new JLabel("Qualification");
		qualy.setBounds(100,320,100,20);
		c1=new JCheckBox("Plus Two");
		c1.setBounds(200,320,100,20);
		c2=new JCheckBox("Polytechnic");
		c2.setBounds(310,320,100,20);		
		sub=new JButton("SUBMIT");
		sub.addActionListener(this);
		sub.setBounds(150,360,100,20);
		reset=new JButton("RESET");
		reset.setBounds(280,360,100,20);
		reset.addActionListener(this);
		add(title);
		add(name);add(tname);
		add(addr);add(taddr);
		add(adm);add(tadm);
		add(gen);add(male);add(fmale);
		add(dob);add(date);add(mnths);add(yr);
		add(crs);add(tcrs);add(pcrs);
		add(qualy);add(c1);add(c2);
		add(sub);add(reset);
		d=new JDialog();
		{
			JLabel r=new JLabel("Registration Completed Successfully...Thankyou");
			ok=new JButton("OK");
			ok.setBounds(100,75,100,20);
			ok.addActionListener(this);
			d.add(ok);
			d.add(r);
			d.setSize(300,150);
		}
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sub)
			d.setVisible(true);
		else if(e.getSource()==reset)
		{
			tname.setText("");
			taddr.setText("");
			tadm.setText("");
			c1.setSelected(false);
			c2.setSelected(false);
			male.setSelected(false);
			fmale.setSelected(false);	
			date.setSelectedIndex(0);
			mnths.setSelectedIndex(0);
			yr.setSelectedIndex(0);
			tcrs.setSelectedIndex(0);
		}
		else if(e.getSource()==ok)
		{
			dispose();
			d.dispose();
		}
	}			
	public static void main(String args[])
	{
		SReg s=new SReg();
	}
}