package ko.co.log;

import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

@SuppressWarnings({ "serial", "unused" })
public class logViewer extends JFrame{

	private JButton loginBtn;
	
	private JTextField idField;
	private JPasswordField pwField;
	
	private JTextField field;
	
	private Set<String> undefinedId = new HashSet<String>();


	public JTextField getField() {
		return field;
	}

	public Set<String> getUndefinedId() {
		return undefinedId;
	}

	public logViewer() {
		super("쌍용 2조");
		
		idField = new JTextField();//JTextField id = new JTextField();
		JPanel panel = new JPanel();//getter
		loginBtn = new JButton("Login");//loginBtn
		JLabel idLabel = new JLabel("ID");
		JLabel pwLabel = new JLabel("PASSWORD");//pw
		field = new JTextField();
		pwField = new JPasswordField();
		JTextArea area = new JTextArea();
		JScrollPane areaScrollPane = new JScrollPane(area);

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,150);//넓이(w), 높이(h)
		setLocation(200,110);//x, y
		
		
		LoginCheck lc =new LoginCheck(this);
		idField.addActionListener(lc);
		pwField.addActionListener(lc);
		loginBtn.addActionListener(lc);

		panel.setLayout(null);
		panel.setBackground(new Color(0,0,0,100));
		panel.setBounds(0,0,1000,455);

		//label.setIcon(iconimg);
		idLabel.setBounds(20,20,150,30);
		pwLabel.setBounds(20,60,150,30);
		loginBtn.setBounds(320,20,100,70);
		idField.setBounds(130,20,150,30);
		pwField.setBounds(130,60,150,30);
		area.setFont(new Font("Dialog", Font.PLAIN, 16));
		field.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		area.setLineWrap(true);

		panel.add(idLabel);
		panel.add(pwLabel);
		panel.add(loginBtn);
		panel.add(idField);
		panel.add(pwField);
		panel.add(areaScrollPane);

		add(panel);
		getContentPane().setBackground(Color.GRAY);
		setResizable(false);
		setVisible(true);
		}
	
	public JButton getLoginBtn() {
		return loginBtn;
	}
		

	public JTextField getIdField() {
		return idField;
	}

	public JPasswordField getPwField() {
		return pwField;
	}

	public void setField(JTextField field) {
		this.field = field;
	}

	public void setIdField(JTextField idField) {
		this.idField = idField;
	}

	public void setPwField(JPasswordField pwField) {
		this.pwField = pwField;
	}
	
	public static void main(String[] args) {
		new logViewer();

	}//main

}//class
