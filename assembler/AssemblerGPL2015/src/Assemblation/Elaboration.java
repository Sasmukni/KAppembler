package Assemblation;

import java.util.ArrayList;

import Frame.Form;
import I_O.Read;
public class Elaboration {
	Form obj=new Form();
	Read r=new Read();
	instructions in;
	public String input;
	public String trad="";
	public ArrayList<instructions> inst= new ArrayList<instructions>();
	public ArrayList<codeline> code= new ArrayList<codeline>();
	String[] RegList;
	public void setInstructions() {
		String instructionSet=r.readfilePass("C:\\\\Users\\\\s5067966h\\\\Desktop\\\\KappemblerPRJ\\\\KAppembler\\\\assembler\\\\instruction.txt");
		//String instructionSet=r.readfilePass("C:\\Users\\Samuele Capani\\Desktop\\Assembler\\assembler\\instruction.txt");
		String[] atemp=instructionSet.split("___");
		RegList= r.linedivision(atemp[0]);
		String[] linesSet=r.linedivision(atemp[1]);
		for(int i=1;i<linesSet.length;i++) {
			atemp=linesSet[i].split("�");
			inst.add(new instructions(atemp[0],atemp[1],RegList));
		}
	}
	public void traduction() {
		String[] atemp=r.linedivision(input);
		for(int i=1;i<atemp.length;i++)
			code.add(new codeline(atemp[i],RegList));
		for(int i=0;i<code.size();i++){
			for(int c=0;c<inst.size();c++) {
				if(code.get(i).Key==inst.get(c).Key)
					trad+=inst.get(c).MachineCode+"/n";
			}
		}
	}
	public void getInsMC(int val) {
		System.out.println("Machine Code "+(val+1)+" :"+ inst.get(val).MachineCode);
	}
	public void getInsSHC(int val) {
		System.out.println("Human Code "+(val+1)+" :"+ inst.get(val).SemiHumanCode);
	}
	public void getInsFF(int val) {
		System.out.println("First Factor "+(val+1)+" :"+ inst.get(val).FirstFactor);
		System.out.println("First Factor Modifier "+(val+1)+" :"+ inst.get(val).FirstModifier);
		if(inst.get(val).FirstModifier.contains("n")) 
		System.out.println("Number Of Bytes "+(val+1)+" :"+ inst.get(val).FirstNB);
	}
	public void getInsSF(int val) {
		System.out.println("Second Factor "+(val+1)+" :"+ inst.get(val).SecondFactor);
		System.out.println("Second Factor Modifier "+(val+1)+" :"+ inst.get(val).SecondModifier);
		if(inst.get(val).SecondModifier.contains("n")) 
			System.out.println("Number Of Bytes "+(val+1)+" :"+ inst.get(val).SecondNB);
	}
	public void getInsKey(int val) {
		System.out.println("Key "+(val+1)+" :"+ inst.get(val).Key);
	}
	
}
