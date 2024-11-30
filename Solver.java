
public class Solver {
	public static void main(String[] args) {
		
		//beginning state
		//int cube[] = {0, 0, 0 ,0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
		/* 0-top 1-front 2-bottom 3-back 4-right 5-left clockwise starting in top left corner*/
		//int cube[] = {0,3,0,1,2,4,5,4,1,3,0,4,2,5,2,3,3,4,1,2,5,5,0,1};
		//int cube[] = {2,1,3,2,3,4,1,1,4,0,4,5,3,3,0,1,2,4,0,5,5,5,2,0};
			//random scramble
		//int cube[] = {3,2,2,4,1,5,4,0,5,1,0,1,2,5,4,0,3,3,1,2,4,0,3,5};
			//random scramble
		//int cube[] = {3,1,2,4,2,1,2,5,3,3,4,0,3,0,5,2,5,0,1,4,5,1,0,4};
		//int cube[] = {0, 0, 0, 0, 5, 5, 3, 1, 2, 2, 2, 2, 1, 3, 4, 4, 1, 1, 4, 5, 3, 3, 5, 4};
		//int cube[] = {5,1,3,1,0,4,3,3,4,2,0,5,3,5,4,2,2,2,1,5,1,4,0,0};
			//this will be SOLVED PERFECTLYYYYY
		//int cube[] = {5,0,4,3,4,1,1,4,1,5,3,5,2,4,5,1,2,3,2,2,0,0,0,3};
			//this will also be solved
		//int cube[] = {4,1,3,4,3,5,3,5,2,0,1,4,1,0,2,1,0,5,5,4,2,2,3,0};
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
		
		//the permute algorithm still needs some work. And always be on the look out for little mistakes, such
		//as the wrong alg I just found in .solveCornerTwo.
	}
}