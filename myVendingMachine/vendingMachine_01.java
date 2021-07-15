package myVendingMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class vendingMachine_01 extends JFrame implements ActionListener{
	
	static myVendingMachineText b = new myVendingMachineText();
	
	public double ck,ps,sd;
	public JLabel vn, ich, chng, clist;
	public JButton clear, exit, Coke, Pepsi, Soda, Refund;
	
	public TextField ichtf,ch;
	public TextArea chngta;
	
	public vendingMachine_01 () {
		Container c = getContentPane();
		c.setLayout(null);
		
		c.add(vn = new JLabel ("Vending Machine"));
		c.add(ich = new  JLabel ("Insert Coin Here"));
		c.add(chng = new JLabel ("Change"));
		c.add(clist = new JLabel (""));
		
		c.add(Coke = new JButton ("Coke 25¢"));
		c.add(Pepsi = new JButton ("Pepsi 35¢"));
		c.add(Soda = new JButton("Soda 45¢"));
		c.add(clear = new JButton("Clear"));
		c.add(exit = new JButton ("Exit"));
		c.add(Refund = new JButton ("Refund"));
		
		c.add(ichtf = new TextField ());
		c.add(chngta = new TextArea ());
		Coke.addActionListener(this);
		Pepsi.addActionListener(this);
		Soda.addActionListener(this);
		clear.addActionListener(this);
		exit.addActionListener(this);
		Refund.addActionListener(this);
		
		Color c1 = Color.lightGray;
		Color c2 = Color.black;
		Font f = (new Font ("Verdana", Font.PLAIN, 14));
		Font f1 = (new Font ("Verdana", Font.BOLD, 22));
		
		vn.setFont(f1);ich.setFont(f);chng.setFont(f);ichtf.setFont(f);chngta.setFont(f);clist.setFont(f);
		
		c.setBackground(c2);
		vn.setForeground(c1);ich.setForeground(c1);chng.setForeground(c1);clist.setForeground(c1);
		
		vn.setBounds(245,20,240,30);
		ich.setBounds(293,60,150,20);
		clist.setBounds(325,80,100,20);
		ichtf.setBounds(330,120,40,20);
		
		Coke.setBounds(100,180,90,20);
		Pepsi.setBounds(300,180,90,20);
		Soda.setBounds(500,180,90,20);
		
		
		chngta.setBounds(260,240,180,120);
		
		clear.setBounds(70,380,70,20);
		exit.setBounds(560,380,70,20);
		Refund.setBounds(310,380,80,20);
		
		chngta.setEditable(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==Coke) {
			b.coke = ((ck = Double.parseDouble(ichtf.getText())));
			
			b.Coke();
			chngta.setText(""+b.ckreceipt);
		}
		if (e.getSource()==Pepsi) {
			b.pepsi = ((ps = Double.parseDouble(ichtf.getText())));
			
			b.Pepsi();
			chngta.setText(""+b.psreceipt);
		}
		if (e.getSource()==Soda) {
			b.soda = ((sd = Double.parseDouble(ichtf.getText())));
			
			b.Soda();
			chngta.setText(""+b.sdreceipt);
		}
		if (e.getActionCommand().equals("Clear")) {
			ichtf.setText("");chngta.setText("");
		}
		if (e.getActionCommand().equals("Refund")) {
			ichtf.setText("");chngta.setText("You get your coins back");
		}
		if (e.getSource()==exit) {
			System.exit(0);
		}
		
	}
}
