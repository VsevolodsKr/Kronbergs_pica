import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

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
		String[] nosaukumi = {"Margarita","Pepperoni","Studenta","Četri gadalaiki","Diavola","Ferrara","Vezuva"};
		JFrame jf = new JFrame("Kronberga picerija");
		JComboBox nosaukumaKastite = new JComboBox<String>(nosaukumi);
		JRadioButton izmers1 = new JRadioButton("Maza(20 cm)");
		JRadioButton izmers2 = new JRadioButton("Vidēja(30 cm)");
		JRadioButton izmers3 = new JRadioButton("Liela(50 cm)");
		JRadioButton piepild0 = new JRadioButton("Bez");
		JCheckBox piepild1 = new JCheckBox("Pepperoni desa");
		JCheckBox piepild2 = new JCheckBox("Tomāti");
		JCheckBox piepild3 = new JCheckBox("Sēnes");
		JCheckBox piepild4 = new JCheckBox("Sīpoli");
		JCheckBox piepild5 = new JCheckBox("Paprika");
		JCheckBox piepild6 = new JCheckBox("Marinēti gurķi");
		JCheckBox piepild7 = new JCheckBox("Vistas gaļa");
		JCheckBox piepild8 = new JCheckBox("Čīli pipāri");
		JLabel picasNosaukums = new JLabel("Picas veids:");
		JLabel picasPiedavajumi = new JLabel("Piedāvājumi:");
		nosaukumaKastite.setBounds(100,50,100,20);
		picasNosaukums.setBounds(20,50,90,20);
		picasPiedavajumi.setBounds(20,100,90,20);
		piepild0.setBounds(30,130,130,20);
		piepild1.setBounds(30,150,130,20);
		piepild2.setBounds(30,170,130,20);
		piepild3.setBounds(30,190,130,20);
		piepild4.setBounds(30,210,130,20);
		piepild5.setBounds(30,230,130,20);
		piepild6.setBounds(30,250,130,20);
		piepild7.setBounds(30,270,130,20);
		piepild8.setBounds(30,290,130,20);
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
