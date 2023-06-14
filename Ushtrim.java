import javax.swing.*;
import java.awt.*;

public class Ushtrim extends JFrame{
	
	private JButton addBookBt;
	private JButton viewAllBt; 
	private JButton addJournalBt;
	
	private JTextField idTf;
	private JTextField titleTf;
	private JTextField authorOrEditorTf;
	
	private JLabel idLb;
	private JLabel titleLb;
	private JLabel authorOrEditorLb;
	
	
	private JPanel contentPanel;
	private JPanel mainPanel;
	private JPanel buttonsPanel;
	
	public Ushtrim () {
		contentPanel = (JPanel) getContentPane();
		addBookBt = new JButton ("Add Book");
		addJournalBt = new JButton ("Add Journal");
		viewAllBt = new JButton ("View All");
		idTf = new JTextField();
		titleTf = new JTextField();
		authorOrEditorTf = new JTextField();
		idLb = new JLabel("ID:");
		titleLb = new JLabel("Title:");
		authorOrEditorLb = new JLabel("Author(book) or Editor(Journal):");
		mainPanel = new JPanel(new GridLayout (3, 2));
		buttonsPanel = new JPanel();
		//Add components to the main Panel
		
		
		
	}
		
	

}
