import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main extends JFrame{
	static void Picerija(String vards){
		ArrayList<Pica> picasSaraksts = new ArrayList<Pica>();
		String[] nosaukumi = {"Margarita(4.80 Eur)","Pepperoni(5.99 Eur)","Studenta(5.59 Eur)","Četri gadalaiki(5.09 Eur)","Diavola(6.19 Eur)","Ferrara(6.99 Eur)","Vezuva(5.69 Eur)"};
		JFrame jf = new JFrame("Kronberga picerija");
		 JButton clear = new JButton("Notīrīt");
		 JButton add = new JButton("Pievienot");
		 JButton count = new JButton("Aprēķinat");
		 JButton order = new JButton("Pasūtīt");
		JComboBox nosaukumaKastite = new JComboBox<String>(nosaukumi);
		JRadioButton izmers1 = new JRadioButton("Maza(20 cm)");
		JRadioButton izmers2 = new JRadioButton("Vidēja(30 cm)");
		JRadioButton izmers3 = new JRadioButton("Liela(50 cm)");
		JRadioButton piepild0 = new JRadioButton("Bez");
	    JRadioButton irKarte = new JRadioButton("Ir");
	    JRadioButton navKartes = new JRadioButton("Nav");
	    JRadioButton uz_vietas = new JRadioButton("Uz vietas");
	    JRadioButton piegade = new JRadioButton("Piegāde");
		JCheckBox piepild1 = new JCheckBox("Pepperoni desa (+0.79 Eur)");
		JCheckBox piepild2 = new JCheckBox("Tomāti (+0.59 Eur)");
		JCheckBox piepild3 = new JCheckBox("Sēnes (+0.80 Eur)");
		JCheckBox piepild4 = new JCheckBox("Sīpoli (+0.65 Eur)");
		JCheckBox piepild5 = new JCheckBox("Paprika (+0.55 Eur)");
		JCheckBox piepild6 = new JCheckBox("Marinēti gurķi (+0.69 Eur)");
		JCheckBox piepild7 = new JCheckBox("Vistas gaļa (+0.99 Eur)");
		JCheckBox piepild8 = new JCheckBox("Čīli pipāri (+0.89 Eur)");
		JLabel picasNosaukums = new JLabel("Picas nosaukums:");
		JLabel klientaKarte = new JLabel("Klienta karte:");
	    JLabel piegadesVariants = new JLabel("Kā Jūs gribāt ēst?");
	    JLabel adreseVards = new JLabel("Adrese:");
	    JLabel telefonsVards = new JLabel("Telefons:");
	    JLabel eur = new JLabel("Eur");
	    JLabel cena = new JLabel("");
		JLabel picasPiedavajumi = new JLabel("Piedāvājumi:");
		JLabel izmers = new JLabel("Picas izmērs: ");
		JTextField adrese = new JTextField();
	    JTextField telefons = new JTextField();
	    JTextField ievadaKarti = new JTextField();
	    ButtonGroup karte = new ButtonGroup();
	    karte.add(irKarte);
	    karte.add(navKartes);
	    ButtonGroup esana = new ButtonGroup();
	    esana.add(uz_vietas);
	    esana.add(piegade);
		nosaukumaKastite.setBounds(140,50,150,20);
		picasNosaukums.setBounds(20,50,120,20);
		picasPiedavajumi.setBounds(20,100,90,20);
		izmers.setBounds(20,340,120,20);
		piepild0.setBounds(30,130,180,20);
		piepild1.setBounds(30,150,180,20);
		piepild2.setBounds(30,170,180,20);
		piepild3.setBounds(30,190,180,20);
		piepild4.setBounds(30,210,180,20);
		piepild5.setBounds(30,230,180,20);
		piepild6.setBounds(30,250,180,20);
		piepild7.setBounds(30,270,180,20);
		piepild8.setBounds(30,290,180,20);
		izmers1.setBounds(30,370,130,20);
		izmers2.setBounds(30,390,130,20);
		izmers3.setBounds(30,410,130,20);
		irKarte.setBounds(270, 120, 100, 20);
	    navKartes.setBounds(370, 120, 100, 20);
	    uz_vietas.setBounds(260, 230, 100, 20);
	    piegade.setBounds(370, 230, 100, 20);
	    ievadaKarti.setBounds(300, 150, 100, 20);
	    adreseVards.setBounds(220, 260, 100, 20);
	    adrese.setBounds(290, 260, 160, 20);
	    telefonsVards.setBounds(220, 290, 100, 20);
	    telefons.setBounds(290, 290, 160, 20);
	    cena.setBounds(350,320,60,30);
	    clear.setBounds(250,380,100,30);
	    add.setBounds(370,380,100,30);
	    count.setBounds(250,430,100,30);
	    order.setBounds(370,430,100,30);
	    eur.setBounds(405,320,100,30);
	    ievadaKarti.setVisible(false);
	    adrese.setVisible(false);
	    telefons.setVisible(false);
	    adreseVards.setVisible(false);
	    telefonsVards.setVisible(false);
		jf.add(picasNosaukums);
		jf.add(nosaukumaKastite);
		jf.add(picasPiedavajumi);
		jf.add(piepild0);
		jf.add(piepild1);
		jf.add(piepild2);
		jf.add(piepild3);
		jf.add(piepild4);
		jf.add(piepild5);
		jf.add(piepild6);
		jf.add(piepild7);
		jf.add(piepild8);
		jf.add(izmers);
		jf.add(izmers1);
		jf.add(izmers2);
		jf.add(izmers3);
		jf.add(klientaKarte);
	    jf.add(irKarte);
	    jf.add(navKartes);
	    jf.add(ievadaKarti);
	    jf.add(piegadesVariants);
	    jf.add(uz_vietas);
	    jf.add(piegade);
	    jf.add(adreseVards);
	    jf.add(adrese);
	    jf.add(telefonsVards);
	    jf.add(telefons);
	    jf.add(cena);
	    jf.add(clear);
	    jf.add(add);
	    jf.add(count);
	    jf.add(order);
	    jf.add(cena);
	    jf.add(eur);
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame("Reģistrācijas logs");
		JTextField loginLogs = new JTextField();
		JLabel loginVards = new JLabel("Lietotājvārds:");
		JPasswordField paroleLogs = new JPasswordField();
		JLabel paroleVards = new JLabel("Parole:");
		JButton logIn = new JButton("Ieiet");
		JButton signUp = new JButton("Pieslēgties");
		loginVards.setBounds(10,70,150,30);
		loginLogs.setBounds(150,70,170,30);
		paroleVards.setBounds(10,110,150,30);
		paroleLogs.setBounds(150,110,170,30);
		logIn.setBounds(55,180,130,30);
		signUp.setBounds(220,180,130,30);
		jf.add(loginVards);
		jf.add(loginLogs);
		jf.add(paroleVards);
		jf.add(paroleLogs);
		jf.add(logIn);
		jf.add(signUp);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		signUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			String vards = loginLogs.getText();
			String parole = new String(paroleLogs.getPassword());
			if(vards.equals("") || parole.equals("")){
				JOptionPane.showMessageDialog(null,"Ievadi gan lietotājvārdu, gan paroli lodziņās","Bridinājums",JOptionPane.WARNING_MESSAGE);
				return;
			}
			try{
				File fails = new File("lietotaji.txt");
				if(fails.exists()){
					FileReader fr = new FileReader(fails);
					BufferedReader br = new BufferedReader(fr);
					String teksts;
					while((teksts = br.readLine())!=null){
						String[] dala = teksts.split(" ");
					if(dala[0].equals(vards)){
						JOptionPane.showMessageDialog(null, "Ievadītais vārds jau eksistē!");
						br.close();
						return;
					}
					}
					br.close();
				}
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Problēmas ar failu lietotaji.txt nolasīšanu","Kļūda",JOptionPane.ERROR_MESSAGE);
			}
			try{
				FileWriter fw = new FileWriter(new File("lietotaji.txt"),true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(vards+" "+parole);
				bw.newLine();
				bw.close();
				JOptionPane.showMessageDialog(null,"Lietotājs veiksmīgi pievienots sistēmai!","Informācija",JOptionPane.INFORMATION_MESSAGE);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Problēmas ar failu lietotaji.txt vārdu un paroli pievienošanu!","Kļūda!",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		logIn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			String vards = loginLogs.getText();
			String parole = new String(paroleLogs.getPassword());
			try{
				File fails = new File("lietotaji.txt");
				if(fails.exists()){
					FileReader fr = new FileReader(fails);
					BufferedReader br = new BufferedReader(fr);
					String teksts;
					boolean atrasts = false;
					while((teksts = br.readLine())!=null){
						String[] dala = teksts.split(" ");
						if(dala[0].equals(vards) && dala[1].equals(parole)){
							JOptionPane.showMessageDialog(null,"Jūs veiksmīgi ienākat savā kontā!",
							"Informacija",JOptionPane.INFORMATION_MESSAGE);
							br.close();
							atrasts = true;
							jf.setVisible(false);
							Picerija(vards);
							return;
						}
					}
					br.close();
					if(atrasts == false)
						JOptionPane.showMessageDialog(null,"Pārbaudiet ievadīto lietotājvārdu un paroli!",
						"Bridinājums",JOptionPane.WARNING_MESSAGE);				
				}else{
					JOptionPane.showMessageDialog(null,"Mums vēl nav lietotājus!","Kļūda!",JOptionPane.ERROR_MESSAGE);
					return;
				}
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Problēmas ar lietotāju nolasīšanu!","Kļūda!",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
	}
}
