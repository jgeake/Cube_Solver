
public class Solver {
	public static void main(String[] args) {
		
		//beginning state
		//int cube[] = {0, 0, 0 ,0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
		
		/* 0-top 1-front 2-bottom 3-back 4-right 5-left -clockwise starting in top left corner*/

		//Example of a configuration to see how the algorithm solves it.
		//int cube[] = {5,0,4,3,4,1,1,4,1,5,3,5,2,4,5,1,2,3,2,2,0,0,0,3};


		//ENTER YOUR CONFIGURATION HERE
		int cube[] = {5,3,0,1,4,5,2,4,0,1,4,4,3,0,0,3,1,5,1,5,2,2,3,2};
		
		
		//Creating Rubik's object
		Turns rubiks = new Turns();
		Orientation two = new Orientation();
		Yellow face = new Yellow();
		Permute four = new Permute();
		
		//Running through the functions to solve
		face.yellowFace(cube);	//yellow
		two.orientation(cube);	//OLL
		four.permute(cube, 1);		//PLL
		four.switching(cube);
		four.permute(cube, 3);
		four.switching(cube);
		four.finalTwists(cube);
		
		//the permute algorithm still needs some work to make it more efficient
		/*note that occasionally some extra moves may be done after it is solved, as it
		is not oriented properly in the program*/
	}
}
