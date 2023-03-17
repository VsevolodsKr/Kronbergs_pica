import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pica {
	private String izmers,kods,adrese,telefons;
	private Object nosaukums;
	private ArrayList<Object> piedavajumi;
	public static ArrayList<Pica> picasSaraksts = new ArrayList<Pica>();
	public Pica(Object nosaukums,ArrayList<Object> piedavajumi,String izmers,String kods,String adrese,String telefons){
		this.nosaukums = nosaukums;
		this.piedavajumi = piedavajumi;
		this.izmers = izmers;
		this.kods = kods;
		this.adrese = adrese;
		this.telefons = telefons;
	}
	public void nolasitInformaciju(){
		String str="";
		for(int i=0;i<piedavajumi.size();i++){
			str += piedavajumi.get(i)+"\n";
		}
		JOptionPane.showMessageDialog(null,"Picas nosaukums: "+nosaukums+"\nPicas sastāvdaļas: "+str+"\nPicas izmers: "+izmers+"\nKlienta karte: "+kods+"\nPiegādes adrese: "+adrese+"\nKlienta telefons: "+telefons,"Informācija",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void pievienotPicu(Pica a){
		picasSaraksts.add(a);
	}
	public static void izdzestPicu(){
		picasSaraksts.clear();
	}
}
