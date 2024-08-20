import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
	 
public class Main{
	
	public static void main(String[] args){
		CardGameGUI gui = new CardGameGUI(new ElevensBoard());
		gui.displayGame();
    
	

	}
}


