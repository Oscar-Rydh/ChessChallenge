import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.Icon;

import Pieces.PieceModells;

import java.awt.Color;


public class ChessBoardView extends JFrame{
	/**
	 * Launch the application.
	 * @throws IOException 
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
		public void run() throws IOException {
//				try {
//				ChessBoardView frame = new ChessBoardView();
//					frame.setVisible(true);
////				} catch (Exception e) {
//					e.printStackTrace();
				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public ChessBoardView(ChessBoardModell board) throws IOException {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 498);
		getContentPane().setLayout(new GridLayout(8, 8, 0, 0));
		

		File file = new File("Black_knight.png");
		File file2 = new File("Black_bonne.png");
		File file3 = new File("Black_king.png");
		File file4 = new File("Black_Queen.png");
		File file5 = new File("Black_runner.png");
		File file6 = new File("Black_tower.png");
		File file7 = new File("White_knight.png");
		File file8 = new File("White_bonne.png");
		File file9 = new File("White_king.png");
		File file10 = new File("White_Queen.png");
		File file11 = new File("White_runner.png");
		File file12 = new File("White_tower.png");
		
        BufferedImage Black_knight = ImageIO.read(file);
        BufferedImage Black_bonne = ImageIO.read(file2);
        BufferedImage Black_king = ImageIO.read(file3);
        BufferedImage Black_Queen = ImageIO.read(file4);
        BufferedImage Black_runner = ImageIO.read(file5);
        BufferedImage Black_tower = ImageIO.read(file6);
        BufferedImage White_knight = ImageIO.read(file7);
        BufferedImage White_bonne = ImageIO.read(file8);
//        BufferedImage White_king = ImageIO.read(file9);
        BufferedImage White_Queen = ImageIO.read(file10);
        BufferedImage White_runner = ImageIO.read(file11);
        BufferedImage White_tower = ImageIO.read(file12);
        
        
		
		JButton A1 = new JButton(new ImageIcon(Black_tower));
		A1.setForeground(Color.RED);
		getContentPane().add(A1);
		
		JButton A2 = new JButton(new ImageIcon(Black_knight));
		A2.setForeground(Color.RED);
		getContentPane().add(A2);
		
		JButton A3 = new JButton(new ImageIcon(Black_runner));
		A3.setForeground(Color.RED);
		getContentPane().add(A3);
		
		JButton A4 = new JButton(new ImageIcon(Black_Queen));
		A4.setForeground(Color.RED);
		getContentPane().add(A4);
		
		JButton A5 = new JButton(new ImageIcon(Black_king));
		A5.setForeground(Color.RED);
		getContentPane().add(A5);
		
		JButton A6 = new JButton(new ImageIcon(Black_runner));
		A6.setForeground(Color.RED);
		getContentPane().add(A6);
		
		JButton A7 = new JButton(new ImageIcon(Black_knight));
		A7.setForeground(Color.RED);
		getContentPane().add(A7);
		
		JButton A8 = new JButton(new ImageIcon(Black_tower));
		A8.setForeground(Color.RED);
		getContentPane().add(A8);
		
		JButton B1 = new JButton(new ImageIcon(Black_bonne));
		B1.setForeground(Color.RED);
		getContentPane().add(B1);
		
		JButton B2 = new JButton(new ImageIcon(Black_bonne));
		B2.setForeground(Color.RED);
		getContentPane().add(B2);
		
		JButton B3 = new JButton(new ImageIcon(Black_bonne));
		B3.setForeground(Color.RED);
		getContentPane().add(B3);
		
		JButton B4 = new JButton(new ImageIcon(Black_bonne));
		B4.setForeground(Color.RED);
		getContentPane().add(B4);
		
		JButton B5 = new JButton(new ImageIcon(Black_bonne));
		B5.setForeground(Color.RED);
		getContentPane().add(B5);
		
		JButton B6 = new JButton(new ImageIcon(Black_bonne));
		B6.setForeground(Color.RED);
		getContentPane().add(B6);
		
		JButton B7 = new JButton(new ImageIcon(Black_bonne));
		B7.setForeground(Color.RED);
		getContentPane().add(B7);
		
		JButton B8 = new JButton(new ImageIcon(Black_bonne));
		B8.setForeground(Color.RED);
		getContentPane().add(B8);
		
		JButton C1 = new JButton("New label");
		C1.setForeground(Color.RED);
		getContentPane().add(C1);
		
		JButton C2 = new JButton("New label");
		C2.setForeground(Color.RED);
		getContentPane().add(C2);
		
		JButton C3 = new JButton("New label");
		C3.setForeground(Color.RED);
		getContentPane().add(C3);
		
		JButton C4 = new JButton("New label");
		C4.setForeground(Color.RED);
		getContentPane().add(C4);
		
		JButton C5 = new JButton("New label");
		C5.setForeground(Color.RED);
		getContentPane().add(C5);
		
		JButton C6 = new JButton("New label");
		C6.setForeground(Color.RED);
		getContentPane().add(C6);
		
		JButton C7 = new JButton("New label");
		C7.setForeground(Color.RED);
		getContentPane().add(C7);
		
		JButton C8 = new JButton("New label");
		C8.setForeground(Color.RED);
		getContentPane().add(C8);
		
		JButton D1 = new JButton("New label");
		D1.setForeground(Color.RED);
		getContentPane().add(D1);
		
		JButton D2 = new JButton("New label");
		D2.setForeground(Color.RED);
		getContentPane().add(D2);
		
		JButton D3 = new JButton("New label");
		D3.setForeground(Color.RED);
		getContentPane().add(D3);
		
		JButton D4 = new JButton("New label");
		D4.setForeground(Color.RED);
		getContentPane().add(D4);
		
		JButton D5 = new JButton("New label");
		D5.setForeground(Color.RED);
		getContentPane().add(D5);
		
		JButton D6 = new JButton("New label");
		D6.setForeground(Color.RED);
		getContentPane().add(D6);
		
		JButton D7 = new JButton("New label");
		D7.setForeground(Color.RED);
		getContentPane().add(D7);
		
		JButton D8 = new JButton("New label");
		D8.setForeground(Color.RED);
		getContentPane().add(D8);
		
		JButton E1 = new JButton("New label");
		E1.setForeground(Color.RED);
		getContentPane().add(E1);
		
		JButton E2 = new JButton("New label");
		E2.setForeground(Color.RED);
		getContentPane().add(E2);
		
		JButton E3 = new JButton("New label");
		E3.setForeground(Color.RED);
		getContentPane().add(E3);
		
		JButton E4 = new JButton("New label");
		E4.setForeground(Color.RED);
		getContentPane().add(E4);
		
		JButton E5 = new JButton("New label");
		E5.setForeground(Color.RED);
		getContentPane().add(E5);
		
		JButton E6 = new JButton("New label");
		E6.setForeground(Color.RED);
		getContentPane().add(E6);
		
		JButton E7 = new JButton("New label");
		E7.setForeground(Color.RED);
		getContentPane().add(E7);
		
		JButton E8 = new JButton("New label");
		E8.setForeground(Color.RED);
		getContentPane().add(E8);
		
		JButton F1 = new JButton("New label");
		F1.setForeground(Color.RED);
		getContentPane().add(F1);
		
		JButton F2 = new JButton("New label");
		F2.setForeground(Color.RED);
		getContentPane().add(F2);
		
		JButton F3 = new JButton("New label");
		F3.setForeground(Color.RED);
		getContentPane().add(F3);
		
		JButton F4 = new JButton("New label");
		F4.setForeground(Color.RED);
		getContentPane().add(F4);
		
		JButton F5 = new JButton("New label");
		F5.setForeground(Color.RED);
		getContentPane().add(F5);
		
		JButton F6 = new JButton("New label");
		F6.setForeground(Color.RED);
		getContentPane().add(F6);
		
		JButton F7 = new JButton("New label");
		F7.setForeground(Color.RED);
		getContentPane().add(F7);
		
		JButton F8 = new JButton("New label");
		F8.setForeground(Color.RED);
		getContentPane().add(F8);
		
		JButton G1 = new JButton(new ImageIcon(White_bonne));
		G1.setForeground(Color.RED);
		getContentPane().add(G1);
		
		JButton G2 = new JButton(new ImageIcon(White_bonne));
		G2.setForeground(Color.RED);
		getContentPane().add(G2);
		
		JButton G3 = new JButton(new ImageIcon(White_bonne));
		G3.setForeground(Color.RED);
		getContentPane().add(G3);
		
		JButton G4 = new JButton(new ImageIcon(White_bonne));
		G4.setForeground(Color.RED);
		getContentPane().add(G4);
		
		JButton G5 = new JButton(new ImageIcon(White_bonne));
		G5.setForeground(Color.RED);
		getContentPane().add(G5);
		
		JButton G6 = new JButton(new ImageIcon(White_bonne));
		G6.setForeground(Color.RED);
		getContentPane().add(G6);
		
		JButton G7 = new JButton(new ImageIcon(White_bonne));
		G7.setForeground(Color.RED);
		getContentPane().add(G7);
		
		JButton G8 = new JButton(new ImageIcon(White_bonne));
		G8.setForeground(Color.RED);
		getContentPane().add(G8);
		
		JButton H1 = new JButton(new ImageIcon(White_tower));
		H1.setForeground(Color.RED);
		getContentPane().add(H1);
		
		JButton H2 = new JButton(new ImageIcon(White_knight));
		H2.setForeground(Color.RED);
		getContentPane().add(H2);
		
		JButton H3 = new JButton(new ImageIcon(White_runner));
		H3.setForeground(Color.RED);
		getContentPane().add(H3);
		
		JButton H4 = new JButton(new ImageIcon(White_Queen));
		H4.setForeground(Color.RED);
		getContentPane().add(H4);
		
		JButton H5 = new JButton(new ImageIcon(PieceModells.WHITEKING()));
		H5.setForeground(Color.RED);
		getContentPane().add(H5);
		
		JButton H6 = new JButton(new ImageIcon(White_runner));
		H6.setForeground(Color.RED);
		getContentPane().add(H6);
		
		JButton H7 = new JButton(new ImageIcon(White_knight));
		H7.setForeground(Color.RED);
		getContentPane().add(H7);
		
		JButton H8 = new JButton(new ImageIcon(White_tower));
		H8.setForeground(Color.RED);
		getContentPane().add(H8);
       
		
	}


}
