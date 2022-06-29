package mypagepanel_comps;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

import labels.TopLabel;
import panels.ImagePanel;

public class PaymentPanel extends ImagePanel {
	public PaymentPanel() {
		setBackground(new Color(245, 222, 179));
		setBounds(118, 0, 1093, 800);	
		setLayout(null);
		
		TopLabel toplabel = new TopLabel("결제 하기");
		toplabel.setLocation(335, 31);
		add(toplabel);
		
		JPanel panel = new JPanel(); //탈퇴시 안내사항label, 비밀번호작성 textField,버튼 이 들어가는 패널 (장바구니 panel)
		panel.setBounds(162, 155, 730, 569);
		panel.setLayout(null);
		add(panel);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 58, 730, 430);		
		tablePanel.setLayout(null);
		panel.add(tablePanel);
		
		JScrollPane scrollPane = new JScrollPane(MyPageMainPanel3.table2);
		scrollPane.setBounds(0, 0, 730, 430);		
		tablePanel.add(scrollPane);		
		panel.add(tablePanel);
		
		
	}
}
