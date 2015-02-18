package org.bot.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class actie implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(1);
		
	}
	
}

public class Frame {

	
	public static void setFrame() throws InstantiationException, IllegalAccessException{
		JFrame frame = new JFrame();
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Exit");
		
		item.addActionListener(new actie());
		
		bar.add(menu);
		menu.add(item);

		frame.setJMenuBar(bar);
		
		frame.setSize(200, 200);
		
		frame.setVisible(true);
	}
	
	public class eenActie implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("geklikt");
			
		}
		
	}

}
