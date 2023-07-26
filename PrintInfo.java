package ko.co.log;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class PrintInfo extends JFrame{

	JTextArea jta=new JTextArea();
	JButton loadBtn=new JButton("Load");
	JButton logRangeBtn=new JButton("LogRange");
	JButton viewBtn=new JButton("View");
	JButton reportBtn=new JButton("Report");
	
	private logViewer lv;
	
	
	public PrintInfo(logViewer lv) {
		this.lv = lv;
		
		//생성
		//JTextArea에 스크롤 추가
		JScrollPane jsp=new JScrollPane(jta);
		
		//배치
		add(jsp);
		add(loadBtn);
		add(logRangeBtn);
		add(viewBtn);
		add(reportBtn);
		
		//크기설정
		setLayout(null);
		reportBtn.setEnabled(!lv.getUndefinedId().contains(lv.getIdField().getText()));

		jsp.setBounds(30,10,720,200);
		loadBtn.setBounds(570,250,150,70);
		logRangeBtn.setBounds(570,450,150,70);
		viewBtn.setBounds(30,600,150,70);
		reportBtn.setBounds(570,600,150,70);
		
		logRangeBtn.addActionListener(null);
		//원도우 크기설정
		
		setBounds(800,800,800,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}//PrintInfo
	
	public static void main(String[] args) {
       logViewer lv = new logViewer();
		new PrintInfo(lv);
	}//main


}//class
