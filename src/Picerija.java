
public class Picerija {
	private String nosaukums="";
	private int zvaigznuSk=0;
	private double naudas=100;
	private boolean irSlegta = true, atverta = false;
	
	public Picerija(String nosaukums,int zvaigznuSk,double naudas,boolean irSlegta, boolean atverta){
		this.nosaukums = nosaukums;
		this.zvaigznuSk = zvaigznuSk;
		this.naudas = naudas;
		this.irSlegta = irSlegta;
		this.atverta = atverta;
	}
	public String getNosaukums(){
		return nosaukums;
	}
	public void setNosaukums(String nosauk){
		nosaukums = nosauk;
	}
	public int getZvaigznuSk(){
		return zvaigznuSk;
	}
	public void setZvaigznuSk(int skaits){
		zvaigznuSk = skaits;
	}
	public double getNaudas(){
		return naudas;
	}
	public void setNaudas(double skaits){
		naudas = skaits;
	}
	public boolean getIrSlegta(){
		return irSlegta;
	}
	public void setIrSlegta(String bool){
		if(bool.equals("Jā"))
		irSlegta = true;
		if(bool.equals("Nē"))
		irSlegta = false;
	}
	public boolean getAtverta(){
		return atverta;
	}
	public void setAtverta(boolean bool){
		
	}
	public String nolasitInformaciju(){
		String zvaigznes = "";
		 for(int i=0;i<getZvaigznuSk();i++){
			 zvaigznes += "☆  ";
		 }
			 return getNosaukums()+" "+zvaigznes+" budžets ir "+getNaudas()+"Eur un viņa "+(getIrSlegta()?"ir":"nav")+" slēgta"; 
	}
	
}
