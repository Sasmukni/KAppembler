package Main;

import Assemblation.Elaboration;
import Frame.Form;
import I_O.Read;

public class main {
	static public void main(String[] args) {
		Form obj=new Form();
		obj.visualizza();
		Read r=new Read();
		r.readfile();
		Elaboration k=new Elaboration();
		k.setInstructions();
		for(int i=0;i<k.inst.size();i++) {
			k.getInsMC(i);
			k.getInsSHC(i);
			k.getInsFF(i);
			k.getInsSF(i);
		}
	}
}