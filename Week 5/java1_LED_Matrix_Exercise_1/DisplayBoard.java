public class DisplayBoard {

	public int[][] ledMatrix = new int[16][16];

	public DisplayBoard(){
	    int x = 0;
	    int y = 0;
	    while (x < ledMatrix.length) {
	            ledMatrix[x][y] = 2;
	            x++;
	            y++;
	    }
        TCPClient.sentToBoard(ledMatrix);
	}

	public static void main(String[] args) {
		new DisplayBoard();
	}
}