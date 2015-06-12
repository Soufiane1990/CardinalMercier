package graphique;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFramTEST extends JFrame implements ActionListener{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c;
	private JButton Button;
	public JFramTEST (){
		setTitle("Ma premiere fenetre");
		setBounds (50,100,300,150);
		c = getContentPane();
		
		
		 Button = new JButton("ESSAI");
		c.setLayout(new FlowLayout());
		c.add(Button);
		Button.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String nom = e.getActionCommand();
		System.out.println("action sur bouton ESSAI" + nom);
		
	}
}

