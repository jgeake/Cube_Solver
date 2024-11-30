
public class Yellow {
	public void yellowFace(int[] cube) {
		Turns rubiks = new Turns();
		Orientator use = new Orientator();

		use.solveFirstCorner(cube);
		use.solveSecondCorner(cube);
		System.out.println("Second corner is in position!");
		use.solveThirdCorner(cube);
		System.out.println("Third corner is in position!");
		use.solveFourthCorner(cube);
		System.out.println("Fourth corner is in position!");
		
		if (cube[8] + cube[9] + cube[10] + cube[11] == 8) {
			System.out.println("Successfully solved bottom side.");
		} else {
			System.exit(1);
		}
	}
}
