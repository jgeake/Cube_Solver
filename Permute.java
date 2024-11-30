import java.util.Arrays;

public class Permute {
	public void permute(int[] cube, int input) {

		Turns rubiks = new Turns();
		Permute topFace = new Permute();

		if ((cube[4]+cube[5] == 3 && cube[20]+cube[21] == 9) || (cube[4]+cube[5] == 9 && cube[20]+cube[21] == 3)) {
			topFace.fullCase(cube);
			return;
		}

		for (int i = 0; i<4; i++) {
			if (cube[4] == cube[5] && cube[15] == cube[14]) {
				System.out.println("Top layer already solved.");
				return;
			}
			if (cube[14] == cube[15]) {
				topFace.twoCase(cube);
				return;
			} else {
				rubiks.U(cube);
			}
		}

		int layer = 0;
		while (cube[14] != input) {
			rubiks.U(cube);
			layer++;
			if (layer > 5) {
				System.exit(1);
			}
		}
	}






	public void twoCase(int[] cube) {
		Turns rubiks = new Turns();
		System.out.println("Two case");
		rubiks.Ra(cube);
		rubiks.F(cube);
		rubiks.Ra(cube);
		rubiks.B(cube);
		rubiks.B(cube);
		rubiks.R(cube);
		rubiks.Fa(cube);
		rubiks.Ra(cube);
		rubiks.B(cube);
		rubiks.B(cube);
		rubiks.R(cube);
		rubiks.R(cube);
		System.out.println("Two-case success");
	}



	public void fullCase(int[] cube) {
		Turns rubiks = new Turns();
		System.out.println("Full case");
		rubiks.F(cube);
		rubiks.R(cube);
		rubiks.Ua(cube);
		rubiks.Ra(cube);
		rubiks.Ua(cube);
		rubiks.R(cube);
		rubiks.U(cube);
		rubiks.Ra(cube);
		rubiks.Fa(cube);
		rubiks.R(cube);
		rubiks.U(cube);
		rubiks.Ra(cube);
		rubiks.Ua(cube);
		rubiks.Ra(cube);
		rubiks.F(cube);
		rubiks.R(cube);
		rubiks.Fa(cube);
		System.out.println("Full case success");
	}



	public void switching(int[] cube) {
		Turns rubiks = new Turns();
		System.out.println("Rotating the cube.");
		rubiks.L(cube);
		rubiks.L(cube);
		rubiks.R(cube);
		rubiks.R(cube);
	}



	public void finalTwists(int[] cube) {
		Turns rubiks = new Turns();
		if (cube[7] != 1 || cube[4] != 1) { 
			System.out.println("Final twists!");
		}
		while (cube[4] != 1) {
			rubiks.U(cube);
		}
		while (cube[4] != cube[7]) {
			rubiks.D(cube);
		}
		System.out.println("The cube has been solved!");
	}
}
