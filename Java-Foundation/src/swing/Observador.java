package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		janela.setSize(600, 200);
		janela.setLocationRelativeTo(null); // centralizar na tela
		
		JButton botao = new JButton("Clique aqui!");
		janela.add(botao);
		
//		botao.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento Ocorreu!");
//			}
//		});
		
		botao.addActionListener(event -> {
			System.out.println("Evento aconteceu!");
		});
		
		janela.setVisible(true);
	}

}
