package Pieces;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class PieceModells {
		public PieceModells(){}
		
		public static Image WHITEKING() throws IOException{
			File file = new File("White_king.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image BLACKKING() throws IOException{
			File file = new File("Black_king.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image WHITEKNIGHT() throws IOException{
			File file = new File("White_knight.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image BLACKKNIGHT() throws IOException{
			File file = new File("Black_knight.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image WHITEQUEEN() throws IOException{
			File file = new File("White_Queen.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image BLACKQUEEN() throws IOException{
			File file = new File("Black_Queen.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image WHITETOWER() throws IOException{
			File file = new File("White_tower.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image BLACKTOWER() throws IOException{
			File file = new File("Black_tower.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image WHITERUNNER() throws IOException{
			File file = new File("White_runner.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image BLACKRUNNER() throws IOException{
			File file = new File("Black_runner.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image WHITEPAWN() throws IOException{
			File file = new File("White_bonne.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		public static Image BLACKPAWN() throws IOException{
			File file = new File("Black_bonne.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}

		public static Image EMPTY() throws IOException{
			File file = new File("Empty.png");
			BufferedImage whiteKing = ImageIO.read(file);
			return whiteKing;
		}
		
		

}
