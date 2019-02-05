import java.util.Scanner;

public class Encoded  {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String matrix = input.nextLine();
		int word = (int) Math.sqrt(matrix.length());

		char[][] matris = new char[word][word];

		for (int i = 0; i < word; i++) {
		for (int j = 0; j < word; j++) {
		matris[i][j] = matrix.charAt(word * i + j);

		}

		}
		char[][] rotate = new char[word][word];
		
		for (int x = 0; x < word; x++) {
		for (int y = 0; y < word; y++) {
		rotate[x][y] = matris[y][word-1-x];
		System.out.print(rotate[x][y]);
		}
		}
		}

		}


