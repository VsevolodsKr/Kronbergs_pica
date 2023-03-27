import java.util.ArrayList;

public class Piegade extends Pica{
	private String adrese,telefons;
	public static ArrayList<Piegade> piegadesPicasSaraksts = new ArrayList<Piegade>();
	public Piegade(String nosaukums, String izmers, String karte, 
	boolean irPepperoni, boolean irSenes, boolean irSipoli, boolean irPaprika, boolean irGurki, boolean irPipars, boolean irGala, boolean irTomati, double cena,
	String adrese,String telefons){
		super(nosaukums,izmers,karte,irPepperoni,irSenes,irSipoli,
		irPaprika,irGurki,irPipars,irGala,irTomati,cena);
		this.adrese = adrese;
		this.telefons = telefons;
	}
	public String getTelefons(){
		return telefons;
	}
	public String getAdrese(){
		return adrese;
	}
	public static void pievienot(Piegade pica){
		piegadesPicasSaraksts.add(pica);
	}
	public static void dzest(Piegade pica){
		piegadesPicasSaraksts.remove(pica);
	}
	public static void dzestPiegadesSarakstu(){
		piegadesPicasSaraksts.clear();
	}
	public static String nolasitPiegadi(){
		String str="";
		for(int i=0;i<piegadesPicasSaraksts.size();i++){
		      str += "Picas nosaukums: "+piegadesPicasSaraksts.get(i).getNosaukums()+
		      "\nPepperoni: "+piegadesPicasSaraksts.get(i).getPepperoni()+"\nSēnes: "
		    +piegadesPicasSaraksts.get(i).getSenes()+"\nSīpoli: "
		    +piegadesPicasSaraksts.get(i).getSipoli()+"\nPaprika: "
		    +piegadesPicasSaraksts.get(i).getPaprika()+
		    "\nMarinēti gurķi: "+piegadesPicasSaraksts.get(i).getGurki()+
		    "\nPīpars: "+piegadesPicasSaraksts.get(i).getPipars()+
		    "\nVistas gaļa: "+piegadesPicasSaraksts.get(i).getGala()+
		    "\nTomāti: "+piegadesPicasSaraksts.get(i).getTomati()+
		    "\nKlienta telefona numurs: "+piegadesPicasSaraksts.get(i).getTelefons()+
		    "\nPiegādes adrese: "+piegadesPicasSaraksts.get(i).getAdrese()+
		    "\nCena: "+piegadesPicasSaraksts.get(i).getCena()+
		    " Eur\n-------------------------\n";
		    }
		return str;
	}
	public static double aprekinaCenu(){
		double rez=0;
		for(int i=0;i<piegadesPicasSaraksts.size();i++){
			rez += piegadesPicasSaraksts.get(i).getCena();
		}
		rez = aprekinaCenu2(rez);
		return rez;
	}
}
