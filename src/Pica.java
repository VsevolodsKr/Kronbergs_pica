import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pica {
	private String nosaukums,izmers,karte;
	private boolean irPepperoni,irSenes,irSipoli,irPaprika,irGurki,
	irPipars,irGala,irTomati;
	private double cena=0;
	public static ArrayList<Pica> picasSaraksts = new ArrayList<Pica>();
	public Pica(String nosaukums, String izmers, String karte, boolean irPepperoni, boolean irSenes, boolean irSipoli, boolean irPaprika, boolean irGurki, boolean irPipars, boolean irGala, boolean irTomati, double cena){
		this.nosaukums = nosaukums;
	    this.izmers = izmers;
	    this.karte = karte;
	    this.irPepperoni = irPepperoni;
	    this.irSenes = irSenes;
	    this.irSipoli = irSipoli;
	    this.irPaprika = irPaprika;
	    this.irGurki = irGurki;
	    this.irPipars = irPipars;
	    this.irGala = irGala;
	    this.irTomati = irTomati;
	    this.cena = cena;
	}
	public String getNosaukums(){
		return nosaukums;
	}
	public String getIzmers(){
		return izmers;
	}
	public String getKarte(){
		return karte;
	}
	public String getPepperoni(){
		return irPepperoni ? "Ir" : "Nav";
	}
	public String getSenes(){
		return irSenes ? "Ir" : "Nav";
	}
	public String getSipoli(){
		return irSipoli ? "Ir" : "Nav";
	}
	public String getPaprika(){
		return irPaprika ? "Ir" : "Nav";
	}
	public String getGurki(){
		return irGurki ? "Ir" : "Nav";
	}
	public String getPipars(){
		return irPipars ? "Ir" : "Nav";
	}
	public String getGala(){
		return irGala ? "Ir" : "Nav";
	}
	public String getTomati(){
		return irTomati ? "Ir" : "Nav";
	}
	public double getCena(){
		return cena;
	}
	public static void pievienot(Pica pica){
		picasSaraksts.add(pica);
	}
	public static void dzest(Pica pica){
		picasSaraksts.remove(pica);
	}
	public static void dzestSarakstu(){
		picasSaraksts.clear();
	}
	public static String nolasit(){
		String str="";
		for(int i=0;i<picasSaraksts.size();i++){
			str += "Picas nosaukums: "+picasSaraksts.get(i).getNosaukums()+
			"\nPepperoni: "+picasSaraksts.get(i).getPepperoni()+
			"\nSēnes: "+picasSaraksts.get(i).getSenes()+
			"\nSīpoli: "+picasSaraksts.get(i).getSipoli()+
			"\nPaprika: "+picasSaraksts.get(i).getPaprika()+
			"\nMarinēti gurķi: "+picasSaraksts.get(i).getGurki()+
			"\nČīli pipārs: "+picasSaraksts.get(i).getPipars()+
			"\nVistas gaļa: "+picasSaraksts.get(i).getGala()+
			"\nTomāti: "+picasSaraksts.get(i).getTomati()+
			"\nCena: "+picasSaraksts.get(i).getCena()+
			" Eur\n---------------------\n";
		}
		return str;
	}
	}
