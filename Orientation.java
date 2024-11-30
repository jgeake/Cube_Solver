
public class Orientation {
	public void orientation(int[] cube) {
		Turns rubiks = new Turns();
		
		int counter = 0;
		for (int i=0; i<4; i++) {
			if (cube[i] == 0) {
				counter++;
			}
		}
		
		if (counter == 3) {
			System.out.println ("Impossible position. Solve failed.");
			return;
		}
		if (counter == 4) {
			System.out.println("Lucky solve! White face is already oriented!");
			return;
		}
		
		//sune case
		//moving piece into [3]
		if (counter == 1) {
			System.out.println("Sune case!");
			if (cube[0] == 0) {
				rubiks.Ua(cube);
			} else if (cube[1] == 0) {
				rubiks.U(cube);
				rubiks.U(cube);
			} else if (cube[2] == 0) {
				rubiks.U(cube);
			}
		
			
		//doing alg	
		if (cube[5] == 0) {
			System.out.println("Right case.");
			rubiks.R(cube);
			rubiks.U(cube);
			rubiks.Ra(cube);
			rubiks.U(cube);
			rubiks.R(cube);
			rubiks.U(cube);
			rubiks.U(cube);
			rubiks.Ra(cube);	
		} else {
			System.out.println("Left case.");
			rubiks.Ua(cube);
			rubiks.La(cube);
			rubiks.Ua(cube);
			rubiks.L(cube);
			rubiks.Ua(cube);
			rubiks.La(cube);
			rubiks.U(cube);
			rubiks.U(cube);
			rubiks.L(cube);
		}
		
		
		} else if (counter == 0) {			//empty face cases
			System.out.println("Empty face. What now?");
			if (cube[20] + cube[21] == 0) {
				rubiks.Ua(cube);
			} else if (cube[14] + cube[15] == 0) {
				rubiks.U(cube);
				rubiks.U(cube);
			} else if (cube[16] + cube[17] == 0) {
				rubiks.U(cube);
			}
		
			//H-case
			if (cube[4] + cube[5] + cube[15] == 0) {
				System.out.println("H-case!");
				rubiks.R(cube);
				rubiks.R(cube);
				rubiks.U(cube);
				rubiks.U(cube);
				rubiks.R(cube);
				rubiks.U(cube);
				rubiks.U(cube);
				rubiks.R(cube);
				rubiks.R(cube);
			} else {				//pi case
				System.out.println("Pi-case!");
				rubiks.Ra(cube);
				rubiks.F(cube);
				rubiks.R(cube);
				rubiks.R(cube);
				rubiks.Ua(cube);
				rubiks.R(cube);
				rubiks.R(cube);
				rubiks.F(cube);
				rubiks.R(cube);
			}
		} else if (counter == 2) {				//counter == 2 cases
			System.out.println("Half the face is right...");
			//diagonal case
			if (cube[1] + cube[3] == 0) {
				rubiks.U(cube);
			}
			if (cube[0] + cube[2] == 0) {
				if (cube[4] != 0) {
					rubiks.U(cube);
					rubiks.U(cube);
				}
				System.out.println("Diagonal case!");
				rubiks.F(cube);
				rubiks.R(cube);
				rubiks.Ua(cube);
				rubiks.Ra(cube);
				rubiks.Ua(cube);
				rubiks.R(cube);
				rubiks.U(cube);
				rubiks.Ra(cube);
				rubiks.Fa(cube);
				counter = 5;
			
		} else {		//T1 and T2 cases
			if (cube[2] + cube[3] == 0) {
				rubiks.Ua(cube);
			} else if (cube[0] + cube[3] == 0) {
				rubiks.U(cube);
				rubiks.U(cube);
			} else if (cube[0] + cube[1] == 0) {
				rubiks.U(cube);
			}
			
			if (cube[4] == 0) {
				System.out.println("T1 case!");
				rubiks.R(cube);
				rubiks.U(cube);
				rubiks.Ra(cube);
				rubiks.Ua(cube);
				rubiks.Ra(cube);
				rubiks.F(cube);
				rubiks.R(cube);
				rubiks.Fa(cube);
			} else {
				System.out.println("T2 case!");
				rubiks.F(cube);
				rubiks.R(cube);
				rubiks.U(cube);
				rubiks.Ra(cube);
				rubiks.Ua(cube);
				rubiks.Fa(cube);
			}
		} 
		} //counter == 2 if-statement
		
		if (cube[0] + cube[1] + cube[2] + cube[3] != 0) {
			System.out.println("System failure.");
		} else {
			System.out.println("Top face has been solved.");
		}
	
	} 	//method
}	//class
