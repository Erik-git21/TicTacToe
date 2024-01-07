package pisk;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame implements ActionListener{

	
	JButton button = new JButton();
	JButton[] btn = new JButton[9];
	boolean playerX = true;
	boolean playerO = false;
	JLabel label = new JLabel();
	JPanel panelLabel = new JPanel();
	JPanel panelTicTac = new JPanel();
	
	public GameFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(600,600);
		this.setLayout(new BorderLayout());
		
		
		panelLabel.setPreferredSize(new Dimension(140,140));
		panelLabel.add(label);
		label.setFont(new Font("Segoe Print", Font.BOLD, 60));
		label.setText("PlayerX");
		
		panelTicTac.setPreferredSize(new Dimension(450,450));
		panelTicTac.setLayout(new GridLayout(3,3));
		
		
		for(int i = 0; i < 9; i ++) {
			btn[i] = new JButton();
			btn[i].addActionListener(this);
			panelTicTac.add(btn[i]);
		}
		
		
		this.add(panelTicTac, BorderLayout.SOUTH);
		this.add(panelLabel, BorderLayout.NORTH);
		this.setVisible(true);
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 9; i++) {
			if(e.getSource() == btn[i] && playerX && btn[i].getText() == "") {
				btn[i].setFont(new Font("Segoe Print", Font.BOLD,120));
				btn[i].setText("X");
				playerX = false;
				playerO = true;
				label.setText("PlayerO");
				winsX();
				winsO();
			
			} else if(e.getSource() == btn[i] && playerO && btn[i].getText() == "") {
				btn[i].setFont(new Font("Segoe Print", Font.BOLD,120));
				btn[i].setText("O");
				playerX = true;
				playerO = false;
				label.setText("PlayerX");
				winsX();
				winsO();
			
			}
		}
	
	}
	
	public boolean winsX() {
		if(btn[0].getText().equals("X") &&
		   btn[1].getText().equals("X") &&
		   btn[2].getText().equals("X")) {
			btn[0].setBackground(Color.green);
			btn[1].setBackground(Color.green);
			btn[2].setBackground(Color.green);
			
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			label.setText("PlayerX Won");
			return true;
		}
		
		if(btn[0].getText().equals("X") &&
		   btn[3].getText().equals("X") &&
		   btn[6].getText().equals("X")) {
			btn[0].setBackground(Color.green);
			btn[3].setBackground(Color.green);
			btn[6].setBackground(Color.green);
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			label.setText("PlayerX Won");
			return true;
		}
		if(btn[1].getText().equals("X") &&
		   btn[4].getText().equals("X") &&
		   btn[7].getText().equals("X")) {
			btn[1].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[7].setBackground(Color.green);
			label.setText("PlayerX Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		if(btn[2].getText().equals("X") &&
		   btn[5].getText().equals("X") &&
		   btn[8].getText().equals("X")) {
			btn[2].setBackground(Color.green);
			btn[5].setBackground(Color.green);
			btn[8].setBackground(Color.green);
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		
		if(btn[3].getText().equals("X")&&
		   btn[4].getText().equals("X") &&
		   btn[5].getText().equals("X")) {
			btn[3].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[5].setBackground(Color.green);
			label.setText("PlayerX Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		
		if(btn[6].getText().equals("X") &&
		   btn[7].getText().equals("X") &&
		   btn[8].getText().equals("X")) {
			btn[6].setBackground(Color.green);
			btn[7].setBackground(Color.green);
			btn[8].setBackground(Color.green);	
			label.setText("PlayerX Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		if(btn[0].getText().equals("X") &&
		   btn[4].getText().equals("X") &&
		   btn[8].getText().equals("X")) {
			btn[0].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[8].setBackground(Color.green);	
			label.setText("PlayerX Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		
		if(btn[6].getText().equals("X") &&
		   btn[4].getText().equals("X") &&
		   btn[2].getText().equals("X")) {
			btn[6].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[2].setBackground(Color.green);	
			label.setText("PlayerX Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		return false;
	}
	
	public boolean winsO() {
		if(btn[0].getText().equals("O") &&
		   btn[1].getText().equals("O") &&
		   btn[2].getText().equals("O")) {
			btn[0].setBackground(Color.green);
			btn[1].setBackground(Color.green);
			btn[2].setBackground(Color.green);
			label.setText("PlayerO Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		
		if(btn[0].getText().equals("O") &&
		   btn[3].getText().equals("O") &&
		   btn[6].getText().equals("O")) {
			btn[0].setBackground(Color.green);
			btn[3].setBackground(Color.green);
			btn[6].setBackground(Color.green);
			label.setText("PlayerO Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		if(btn[1].getText().equals("O") &&
		   btn[4].getText().equals("O") &&
		   btn[7].getText().equals("O")) {
			btn[1].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[7].setBackground(Color.green);
			label.setText("PlayerO Won");	
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		if(btn[2].getText().equals("O") &&
		   btn[5].getText().equals("O") &&
		   btn[8].getText().equals("O")) {
			btn[2].setBackground(Color.green);
			btn[5].setBackground(Color.green);
			btn[8].setBackground(Color.green);
			label.setText("PlayerO Won");
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}	
			return true;
		}
		
		if(btn[3].getText().equals("O") &&
		   btn[4].getText().equals("O") &&
		   btn[5].getText().equals("O")) {
			btn[3].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[5].setBackground(Color.green);
			label.setText("PlayerO Won");	
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		
		if(btn[6].getText().equals("O") &&
		   btn[7].getText().equals("O") &&
		   btn[8].getText().equals("O")) {
			btn[6].setBackground(Color.green);
			btn[7].setBackground(Color.green);
			btn[8].setBackground(Color.green);
			label.setText("PlayerO Won");	
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		if(btn[0].getText().equals("O") &&
		   btn[4].getText().equals("O") &&
		   btn[8].getText().equals("O")) {
			btn[0].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[8].setBackground(Color.green);
			label.setText("PlayerO Won");	
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		
		if(btn[6].getText().equals("O") &&
		   btn[4].getText().equals("O") &&
		   btn[2].getText().equals("O")) {
			btn[6].setBackground(Color.green);
			btn[4].setBackground(Color.green);
			btn[2].setBackground(Color.green);
			label.setText("PlayerO Won");	
			for(int i =0; i < 9; i++) {
				btn[i].setEnabled(false);
			}
			return true;
		}
		return false;
	}
	
	
}
