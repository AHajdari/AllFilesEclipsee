import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTitleGUI extends JFrame implements ActionListener {
	
	private Library library;
	
	private JButton addBookBt;
	private JButton addJournalBt;
	private JButton viewAllBt;
	
	private JTextField idTf;
	private JTextField titleTf;
	private JTextField authEdTf;
	
	private JLabel idLb;
	private JLabel titleLb;
	private JLabel authEdLb;
	
	private JPanel contentPanel;
	private JPanel mainPanel;
	private JPanel buttonsPanel;
	
	
	public AddTitleGUI() {
		contentPanel = (JPanel) getContentPane();
		addBookBt = new JButton("Add Book");
		addJournalBt = new JButton("Add Journal");
		viewAllBt =	new JButton("View All");
		addBookBt.addActionListener(e->addBookActionPerformed());
		addJournalBt.addActionListener(e->addJournalActionPerformed());
		viewAllBt.addActionListener(e->viewAllActionPerformed());
		
		idLb = new JLabel("ID:");
		titleLb = new JLabel("Title:");
		authEdLb = new JLabel("Author(book) or Editor(Journal) ");
		idTf = new JTextField();
		titleTf = new JTextField();
		authEdTf = new JTextField();
		mainPanel = new JPanel(new GridLayout (3,2));
		buttonsPanel = new JPanel();
		//add components to the main Panel
		mainPanel.add(idLb);
		mainPanel.add(idTf);
		mainPanel.add(titleLb);
		mainPanel.add(titleTf);
		mainPanel.add(authEdLb);
		mainPanel.add(authEdTf);
		//main panel ready. Add it to the content panel
		contentPanel.add(mainPanel, BorderLayout.CENTER);
		//add components to the button panel
		buttonsPanel.add(addBookBt);
		buttonsPanel.add(viewAllBt);
		buttonsPanel.add(addJournalBt);
		//buttons panel is ready
		//Add it to the content panel
		contentPanel.add(buttonsPanel, BorderLayout.SOUTH);
		
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void addBookActionPerformed() {
		int id = Integer.parseInt(idTf.getText());
		String title = titleTf.getText();
		String author = authEdTf.getText();
		
		Book b = new Book (id, title, author);
		library.addTitle(b);
	}
	
	public void addJournalActionPerformed() {
		int id = Integer.parseInt(idTf.getText());
		String title = titleTf.getText();
		String editor = authEdTf.getText();
		
		Journal j = new Journal(id, title, editor);
		library.addTitle(j);
		
	}

}
	
