package org.bot.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * 
 * close actionlistener.
 *
 */
class close implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	
}

class debugPlayer implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}

class credits implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(Menu.frame, "Thanks to the following person: MalikDz");
		
	}
	
}
public class Menu {
	/**
	 * 
	 * Fields
	 * 
	 */
	public static JMenuBar bar = new JMenuBar();
	
	public static JMenu menu1 = new JMenu("File");
	public static JMenuItem close = new JMenuItem("Exit");
	
	
	public static JMenu menu2 = new JMenu("Debug");
	public static JMenuItem player = new JMenuItem("Player");
	public static JMenuItem npc = new JMenuItem("NPC");
	public static JMenuItem item = new JMenuItem("Item");
	
	public static JMenu menu3 = new JMenu("Info");
	public static JMenuItem credits = new JMenuItem("Credits");
	
	
	public static JFrame frame = new JFrame();
	
	
	public static void setMenu() {
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(780, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(TheCanvas.canvas);
		
		bar.add(menu1);
		menu1.add(close);
		close.addActionListener(new close());
		
		bar.add(menu2);
		menu2.add(player);
		menu2.add(npc);
		menu2.add(item);
		
		bar.add(menu3);
		menu3.add(credits);
		credits.addActionListener(new credits());
		
		
		frame.setJMenuBar(bar);
		
		frame.setVisible(true);
		
		
	}


}
