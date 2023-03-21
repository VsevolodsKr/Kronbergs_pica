import java.util.ArrayList;

public class Piegade extends Pica{
	private String adrese,telefons;
	public static ArrayList<Piegade> piegadesPicasSaraksts = new ArrayList<Piegade>();
	public Piegade(String nosaukums, String izmers, String karte, 
	boolean irPepperoni, boolean irSenes, boolean irSipoli, boolean irPaprika, 
	boolean irGurki, boolean irPipars, boolean irGala, boolean irTomati, double cena,
	String adrese,String telefons){
		super(nosaukums,izmers,karte,irPepperoni,irSenes,irSipoli,
		irPaprika,irGurki,irPipars,irGala,irTomati,cena);
		this.adrese = adrese;
		this.telefons = telefons;
	}
}
