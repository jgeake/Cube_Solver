
public class Orientator {
	public void firstCorner(int[] cube) {
		Turns rubiks = new Turns();

		//corner is one type of turn away
		if ((cube[9] == 2 || cube[10] == 2 || cube[11] == 2)) {
			while (cube[8] != 2) {
				rubiks.D(cube);
			}
		} else if ((cube[4] == 2 || cube[0] == 2 || cube[12] == 2)) {
			while (cube[8] != 2) {
				rubiks.L(cube);
			}
		} else if ((cube[21] == 2 || cube[2] == 2 || cube[19] == 2)) {
			while (cube[8] != 2) {
				rubiks.F(cube);
			}
		}
		if (cube[8] == 2) {
			System.out.println("First corner is in position!");
		} 
	}



	public void solveFirstCorner(int[] cube) {

		//Solves the first corner of the cube, cube[8]
		Turns rubiks = new Turns();
		Orientator use = new Orientator();
		System.out.println("The cube is now being solved.");

		use.firstCorner(cube);	

		if (cube[8] != 2) {
			rubiks.R(cube);
			use.firstCorner(cube);
		}

		if (cube[8] != 2) {
			rubiks.Ra(cube);
			rubiks.U(cube);
			use.firstCorner(cube);
		}		

		if (cube[8] != 2) {
			rubiks.Ua(cube);
			rubiks.B(cube);
			use.firstCorner(cube);
		}

		if (cube[7] == 2) {
			rubiks.F(cube);
			rubiks.L(cube);
		}

		if (cube[8] != 2 ) {
			System.exit(1);
		}
	}



	public void solveSecondCorner(int[] cube) {
		//solves the second corner of the cube
		Turns rubiks = new Turns();
		Orientator use = new Orientator();
		int corner = 0;
		//two a nice case
		if (cube[9] == 2) {
			return;
		}

		if (cube[23] == 2) {
			rubiks.B(cube);
			rubiks.La(cube);
			rubiks.Da(cube);
			rubiks.L(cube);
			return;
		}

		//Let's work on the second corner
		//corner on upper face

		int counter = 0;
		for (int i=0; i<4; i++) {
			if (cube[i] == 2) {
				counter = 1;
				break;
			}
		} 

		if (counter == 1) {
			while (cube[1] != 2) {
				rubiks.U(cube);
			}
			rubiks.R(cube);
			rubiks.R(cube);
			return;
		}

		//if the second corner is on the upper edges		
		int[] lit = {4, 5, 16, 17, 14, 15, 20, 21};

		for (int i=0; i<8; i++) {
			if (cube[lit[i]] == 2) {
				corner = 1;
				break;
			} 
		}		

		if (corner == 1) {
			while (cube[5] != 2 && cube[16] != 2) {
				rubiks.U(cube);
			}

			if (cube[5] == 2) {
				rubiks.Ra(cube);
				return;
			} else {
				rubiks.R(cube);
				rubiks.U(cube);
				rubiks.Ra(cube);
				return;
			}
		}	//end of if (corner == 1) statement

		if (corner == 0) {
			rubiks.R(cube);
			rubiks.R(cube);
			use.solveSecondCorner(cube);
		}
	}



	//third corner
	public void solveThirdCorner(int[] cube) {

		Turns rubiks = new Turns();
		Orientator use = new Orientator();

		int corner = 0;
		int[] lit = {4, 5, 16, 17, 14, 15, 20, 21};

		if (cube[10] == 2) {
			return;
		}

		if (cube[11] == 2) {
			rubiks.D(cube);
			return;
		}

		for (int i=0; i<8; i++) {
			if (cube[lit[i]] == 2) {
				corner = 1;
				break;
			} 
		}

		if (corner == 1) {
			while (cube[14] != 2 && cube[17] != 2) {
				rubiks.U(cube);
			}

			if (cube[14] == 2) {
				rubiks.B(cube);
				rubiks.U(cube);
				rubiks.Ba(cube);
				return;
			} else {
				rubiks.Ba(cube);
				return;
			}
		}

		//checking if the third corner is found on the top side
		for (int i=0; i<4; i++) {
			if (cube[i] == 2) {
				corner = 2;
				break;
			}
		} 

		if (corner == 2) {
			while (cube[0] != 2) {
				rubiks.U(cube);
			}
			rubiks.B(cube);
			rubiks.B(cube);
			return;
		}

		if (cube[10] != 2) {
			rubiks.B(cube);
			rubiks.B(cube);
			use.solveThirdCorner(cube);
		}	
	}



	//fourth corner
	public void solveFourthCorner(int[] cube) {
		Turns rubiks = new Turns();
		int corner = 0;
		int[] lit = {4, 5, 16, 17, 14, 15, 20, 21};

		for (int i=0; i<8; i++) {
			if (cube[lit[i]] == 2) {
				corner = 1;
				break;
			} 
		}

		if (corner == 1) {
			while (cube[17] != 2 && cube[20] != 2) {
				rubiks.U(cube);
			}

			if (cube[17] == 2) {
				rubiks.L(cube);
				rubiks.Ua(cube);
				rubiks.La(cube);
			} else {
				rubiks.L(cube);
				rubiks.U(cube);
				rubiks.La(cube);
			}
		}

		//checking if the fourth corner is found on the top side
		if (corner == 0) {
			for (int i=0; i<4; i++) {
				if (cube[i] == 2) {
					corner = 2;
					break;
				}
			} 

			if (corner == 2) {
				while (cube[1] != 2) {
					rubiks.U(cube);
				}
				rubiks.L(cube);
				rubiks.L(cube);
				rubiks.Ua(cube);
				rubiks.L(cube);
				rubiks.L(cube);
				return;
			}

		}

		if (cube[12] == 2) {
			rubiks.La(cube);
			rubiks.Fa(cube);
			rubiks.L(cube);
			rubiks.F(cube);
			return;
		}	

		if (cube[23] == 2) {
			rubiks.B(cube);
			rubiks.R(cube);
			rubiks.Ba(cube);
			rubiks.Ra(cube);
			return;
		}
	}

}
