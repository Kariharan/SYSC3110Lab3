import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class GUI {

	private JFrame frame;
	private JTextField Name;
	private JTextField Address;
	private JTextField Phone_Number;
	private JTextPane Display;
	public AddressBook Homies = new AddressBook();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreateANew = new JButton("Create A New Address Book");
		btnCreateANew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homies = new AddressBook();
				JOptionPane.showMessageDialog(frame, "New Address Book Made!");
				Display.setText(Homies.toString());
			}
		});
		btnCreateANew.setBounds(52, 33, 177, 23);
		frame.getContentPane().add(btnCreateANew);
		
		JButton btnSaveAddressBook = new JButton("Save Address Book");
		btnSaveAddressBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					FileOutputStream file = new FileOutputStream("M:\\SYSC3110Lab3\\k.ser");
					ObjectOutputStream oos = new ObjectOutputStream(file);
					oos.writeObject(Homies);
					oos.close();
					JOptionPane.showMessageDialog(frame, "Address Book Saved!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSaveAddressBook.setBounds(459, 228, 125, 23);
		frame.getContentPane().add(btnSaveAddressBook);
		
		Name = new JTextField();
		Name.setBounds(123, 80, 86, 20);
		frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		Address = new JTextField();
		Address.setBounds(123, 111, 86, 20);
		frame.getContentPane().add(Address);
		Address.setColumns(10);
		
		Phone_Number = new JTextField();
		Phone_Number.setBounds(123, 142, 86, 20);
		frame.getContentPane().add(Phone_Number);
		Phone_Number.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(52, 83, 46, 14);
		frame.getContentPane().add(lblName);
		
		Display = new JTextPane();
		Display.setBounds(239, 11, 345, 206);
		frame.getContentPane().add(Display);
		
		JButton btnAddBuddy = new JButton("Add Buddy");
		btnAddBuddy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String sName;
				String sAddress;
				String sPhone;
				
				sName = Name.getText();
				sAddress = Address.getText();
				sPhone = Phone_Number.getText();
				
				if(sName.equals("")||sAddress.equals("")||sPhone.equals("")){
					JOptionPane.showMessageDialog(frame, "The fields cannot be empty!");
				}
				
				else{
					BuddyInfo Homie = new BuddyInfo(sName,sAddress,sPhone);
					Homies.addBuddy(Homie);
					JOptionPane.showMessageDialog(frame, "Friend added!");
					Name.setText(""); 
					Address.setText("");
					Phone_Number.setText("");
					Display.setText(Homies.toString());
					
				}
			}
		});
		btnAddBuddy.setBounds(52, 173, 89, 23);
		frame.getContentPane().add(btnAddBuddy);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(52, 114, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone #");
		lblPhone.setBounds(52, 145, 46, 14);
		frame.getContentPane().add(lblPhone);
		
	}
}
