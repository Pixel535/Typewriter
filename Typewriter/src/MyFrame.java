import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button15;
	JButton button16;
	JButton button17;
	JButton button18;
	JButton button19;
	JButton button20;
	JButton button21;
	JButton button22;
	JButton button23;
	JButton button24;
	JButton button25;
	JButton button26;
	JButton button27;
	JButton button28;
	JButton back;
	JButton enter;
	JButton spacebar;
	JButton exit;
	ImageIcon icon = new ImageIcon("maszyna2.png");
	ImageIcon icon2 = new ImageIcon("button.png");
	Border border = BorderFactory.createLineBorder(Color.black,3);
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JTextArea textfield = new JTextArea();
	String buffer = "";
	
	MyFrame(){


		Buttons();
		
		textfield.setPreferredSize(new Dimension(500,100));
		textfield.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
		label.setIcon(icon);
		label.setText("Click Buttons on TYPEWRITER to write!");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
		label.setBounds(0,0,1000,1000);
		label.add(button1);
		label.add(button2);
		label.add(button3);
		label.add(button4);
		label.add(button5);
		label.add(button6);
		label.add(button7);
		label.add(button8);
		label.add(button9);
		label.add(button10);
		label.add(button11);
		label.add(button12);
		label.add(button13);
		label.add(button14);
		label.add(button15);
		label.add(button16);
		label.add(button17);
		label.add(button18);
		label.add(button19);
		label.add(button20);
		label.add(button21);
		label.add(button22);
		label.add(button23);
		label.add(button24);
		label.add(button25);
		label.add(button26);
		label.add(button27);
		label.add(button28);
		label.add(back);
		label.add(enter);
		label.add(spacebar);
		label.add(exit);
		label.add(panel);
		
		panel.setBounds(250, 150, 500, 100);
		panel.add(textfield);
		
		
		this.setTitle("TYPEWRITER");
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(icon.getImage());
		this.setResizable(false);
		this.setVisible(true);
		this.add(label);
		
	}
	
	public void Buttons() {
		button1 = new JButton("Q");
		button1.setBounds(110,435,50,50);
		button1.addActionListener(this);
		button2 = new JButton("W");
		button2.setBounds(170,435,50,50);
		button2.addActionListener(this);
		button3 = new JButton("E");
		button3.setBounds(230,435,50,50);
		button3.addActionListener(this);
		button4 = new JButton("R");
		button4.setBounds(290,435,50,50);
		button4.addActionListener(this);
		button5 = new JButton("T");
		button5.setBounds(350,435,50,50);
		button5.addActionListener(this);
		button6 = new JButton("Y");
		button6.setBounds(410,435,50,50);
		button6.addActionListener(this);
		button7 = new JButton("U");
		button7.setBounds(470,435,50,50);
		button7.addActionListener(this);
		button8 = new JButton("I");
		button8.setBounds(530,435,50,50);
		button8.addActionListener(this);
		button9 = new JButton("O");
		button9.setBounds(590,435,50,50);
		button9.addActionListener(this);
		button10 = new JButton("P");
		button10.setBounds(650,435,50,50);
		button10.addActionListener(this);
		button11 = new JButton("A");
		button11.setBounds(110,495,50,50);
		button11.addActionListener(this);
		button12 = new JButton("S");
		button12.setBounds(170,495,50,50);
		button12.addActionListener(this);
		button13 = new JButton("D");
		button13.setBounds(230,495,50,50);
		button13.addActionListener(this);
		button14 = new JButton("F");
		button14.setBounds(290,495,50,50);
		button14.addActionListener(this);
		button15 = new JButton("G");
		button15.setBounds(350,495,50,50);
		button15.addActionListener(this);
		button16 = new JButton("H");
		button16.setBounds(410,495,50,50);
		button16.addActionListener(this);
		button17 = new JButton("J");
		button17.setBounds(470,495,50,50);
		button17.addActionListener(this);
		button18 = new JButton("K");
		button18.setBounds(530,495,50,50);
		button18.addActionListener(this);
		button19 = new JButton("L");
		button19.setBounds(590,495,50,50);
		button19.addActionListener(this);
		button20 = new JButton("Z");
		button20.setBounds(110,555,50,50);
		button20.addActionListener(this);
		button21 = new JButton("X");
		button21.setBounds(170,555,50,50);
		button21.addActionListener(this);
		button22 = new JButton("C");
		button22.setBounds(230,555,50,50);
		button22.addActionListener(this);
		button23 = new JButton("V");
		button23.setBounds(290,555,50,50);
		button23.addActionListener(this);
		button24 = new JButton("B");
		button24.setBounds(350,555,50,50);
		button24.addActionListener(this);
		button25 = new JButton("N");
		button25.setBounds(410,555,50,50);
		button25.addActionListener(this);
		button26 = new JButton("M");
		button26.setBounds(470,555,50,50);
		button26.addActionListener(this);
		button27 = new JButton("?");
		button27.setBounds(530,555,50,50);
		button27.addActionListener(this);
		button28 = new JButton(":");
		button28.setBounds(590,555,50,50);
		button28.addActionListener(this);
		back = new JButton("<--");
		back.setBounds(710,435,100,50);
		back.addActionListener(this);
		enter = new JButton("ENTER");
		enter.setBounds(650,495,160,50);
		enter.addActionListener(this);
		spacebar = new JButton("SPACEBAR");
		spacebar.setBounds(650,555,160,50);
		spacebar.addActionListener(this);
		exit = new JButton("EXIT");
		exit.setBounds(850,100,100,50);
		exit.addActionListener(this);
		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		if(e.getSource() == exit)
		{
			System.exit(0);
		}
		if(e.getSource() == button1)
		{
			buffer += "Q";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button2)
		{
			buffer += "W";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button3)
		{
			buffer += "E";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button4)
		{
			buffer += "R";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button5)
		{
			buffer += "T";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button6)
		{
			buffer += "Y";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button7)
		{
			buffer += "U";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button8)
		{
			buffer += "I";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button9)
		{
			buffer += "O";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button10)
		{
			buffer += "P";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button11)
		{
			buffer += "A";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button12)
		{
			buffer += "S";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button13)
		{
			buffer += "D";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button14)
		{
			buffer += "F";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button15)
		{
			buffer += "G";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button16)
		{
			buffer += "H";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button17)
		{
			buffer += "J";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button18)
		{
			buffer += "K";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button19)
		{
			buffer += "L";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button20)
		{
			buffer += "Z";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button21)
		{
			buffer += "X";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button22)
		{
			buffer += "C";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button23)
		{
			buffer += "V";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button24)
		{
			buffer += "B";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button25)
		{
			buffer += "N";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button26)
		{
			buffer += "M";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button27)
		{
			buffer += "?";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == button28)
		{
			buffer += ":";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == spacebar)
		{
			buffer += " ";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == enter)
		{
			buffer += "\n";
			textfield.setText("" + buffer);
		}
		if(e.getSource() == back)
		{
			buffer = buffer.substring(0, buffer.length()-1);
			textfield.setText("" + buffer);
		}
	}
	
}
