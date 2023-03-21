import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pica {
	private String nosaukums,izmers,karte;
	private boolean irPepperoni,irSenes,irSipoli,irPaprika,irGurki,irPipars,irGala,irTomati;
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
}
