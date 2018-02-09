package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Assemblation.Elaboration;

public class Listeners implements ActionListener{
	Form f=new Form();
	Elaboration el=new Elaboration();
	public void actionPerformed(ActionEvent evt) {
        /*el.input=f.input.getText();
        el.traduction();
        f.output.setText(el.trad);*/
		System.out.println("ciao");
	}
}
