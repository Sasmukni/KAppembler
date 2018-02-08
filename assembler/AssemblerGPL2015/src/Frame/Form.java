package Frame;

import javax.swing.JPanel;

import I_O.Read;

import java.awt.Component;
//import java.awt.Color;
import java.awt.TextArea;
import java.io.BufferedReader;
import javax.swing.JFrame;


public class Form {
	BufferedReader br = null;
	JFrame f = new JFrame("Frame");
	Read r=new Read();
	TextArea input=new TextArea();
	TextArea output=new TextArea();
	public void visualizza(){
		f.setSize(700, 700);
		JPanel p1=new JPanel();
		input.setSize(500, 500);
		output.setSize(400, 500);
		output.setEditable(false);
		p1.add(input);
		p1.add(output);
		output.setText(r.readfilePass("Z:\\assembler\\instruction.txt"));
		//output.setText(r.readfilePass("C:\\Users\\Samuele Capani\\Desktop\\Assembler\\assembler\\instruction.txt"));
		f.add(p1);
		f.setVisible(true);
	}
	public String GetInput() {
		String s="";
		s=input.getText();
		return s;
	}
	
}
