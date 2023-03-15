import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame{
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
	}
}
