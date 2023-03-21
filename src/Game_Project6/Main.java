package Game_Project6;



import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	private final int OFFSET = 30;
	
	public Main() {
		initUI();
	}
	
	private void initUI() {
		
		Board board = new Board();
		add(board);
		
		setTitle("SBall");
		
		setSize(board.getBoardWidth() + OFFSET,
				board.getBoardHeight() + 2*OFFSET);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			
			Main game = new Main();
			game.setVisible(true);
		});
	}

}
