import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Reģistrācijas logs");
		JTextField loginLogs = new JTextField();
		JLabel loginVards = new JLabel("Lietotājvārds:");
		JTextField paroleLogs = new JTextField();
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
			String parole = new String(paroleLogs.getText());
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
					if(dala[0] == vards){
						JOptionPane.showMessageDialog(null, "Ievadītais vārds jau eksistē!");
						br.close();
						return;
					}
					}
					br.close();
				}
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Problēmas ar failu lietotaji.txt nolasīšanu");
			}
			}
		});
	}
}
