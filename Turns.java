import java.util.Arrays;
//The array calculations for how the rubiks cubes turns affect it's position
public class Turns {
	
	
	
	//Right turn
	public void R(int[] cube) {
		int[] values = {1, 14, 13, 10, 9, 6, 5, 2, 16, 17, 18, 19};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 	

	System.out.println(Arrays.toString(cube) + "R");
	}
	
	

	//Right Prime turn
	public void Ra(int[] cube) {
		int[] values = {2, 5, 6, 9, 10, 13, 14, 1, 19, 18, 17, 16};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 

	System.out.println(Arrays.toString(cube) + "R'");
	}



	//Left turn
	public void L(int[] cube) {
		int[] values = {0, 3, 4, 7, 8, 11, 12, 15, 20, 21, 22, 23};			        
	    int[] current = new int[cube.length];
	        
	    for (int i = 0; i < cube.length; i++) {
    			current[i] = cube[i];
	    }
		
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 	
		
	System.out.println(Arrays.toString(cube) + "L");	
	}
	
	
	
	//Left Prime turn
	public void La(int[] cube) {
	    int[] values = {15, 12, 11, 8, 7, 4, 3, 0, 23, 22, 21, 20};
        int[] current = new int[cube.length];
        
       	for (int i = 0; i < cube.length; i++) {
        		current[i] = cube[i];
       	}
       	
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 
    
	System.out.println(Arrays.toString(cube) + "L'");		
	}
	

	
	//Upper layer turn
	public void U(int[] cube) {
		int[] values = {21, 20, 15, 14, 17, 16, 5, 4, 0, 1, 2, 3};
        int[] current = new int[cube.length];
        
        for (int i = 0; i < cube.length; i++) {
		        	current[i] = cube[i];
		}
        
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 	
			
	System.out.println(Arrays.toString(cube) + "U");
	}
	
	
	
	//Upper face prime turn
	public void Ua(int[] cube) {

		int[] values = {4, 5, 16, 17, 14, 15, 20, 21, 3, 2, 1, 0};	
		int[] current = new int[cube.length];
	        
	    for (int i = 0; i < cube.length; i++) {
	      		current[i] = cube[i];
	    }
		
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 
		
	System.out.println(Arrays.toString(cube) + "U'");
	}
	


	//Forward turn
	public void F(int[] cube) {
		int values[] = {3, 2, 16, 19, 9, 8, 22, 21, 4, 5, 6, 7};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 	

	System.out.println(Arrays.toString(cube) + "F");
	}
	
	
	
	//Forward prime turn
	public void Fa(int[] cube) {
		int values[] = {21, 22, 8, 9, 19, 16, 2, 3, 7, 6, 5, 4};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 

	System.out.println(Arrays.toString(cube) + "F'");
	}
	
	
	
	//Bottom
	public void D(int[] cube) {
		int values[] = {19, 18, 13, 12, 23, 22, 7, 6, 8, 9, 10, 11};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
	    Turns rubiks = new Turns();    
	    rubiks.turningMechanism(values, cube, current);    

	System.out.println(Arrays.toString(cube) + "D");
	}
	
	
	
	//Bottom prime
	public void Da(int[] cube) {
		int values[] = {6, 7, 22, 23, 12, 13, 18, 19, 11, 10, 9, 8};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
	    Turns rubiks = new Turns();    
	    rubiks.turningMechanism(values, cube, current);    

	System.out.println(Arrays.toString(cube) + "D'");
	}
	
	
	
	//Back
	public void B(int[] cube) {
		int values[] = {1, 0, 20, 23, 11, 10, 18, 17, 12, 13, 14, 15};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 

	System.out.println(Arrays.toString(cube) + "B");
	}
	
	
	
	//Back Prime
	public void Ba(int[] cube) {
		int values[] = {17, 18, 10, 11, 23, 20, 0, 1, 15, 14, 13, 12};
	    int[] current = new int[cube.length];
	    
	    for (int i = 0; i < cube.length; i++) {
	    		current[i] = cube[i];
	    }
	    
		Turns rubiks = new Turns();    
		rubiks.turningMechanism(values, cube, current); 
		
	System.out.println(Arrays.toString(cube) + "B'");
	}

	
	//Turning mechanism calculation
	public void turningMechanism(int[] values, int[] cube, int[] current) {
		int i = 0;
		
		//edge turning
		for (i=0; i<8; i++) {
			if (i < 2) {
				cube[values[i]] = current[values[i+6]];
			} else {
				cube[values[i]] = current[values[i-2]];
			}
		}

		//face turning
		for (i=8; i<12; i++) {
			if (i == 8) {
		   		cube[values[i]] = current[values[i+3]];
		   	} else {
		   		cube[values[i]] = current[values[i-1]];
		    }
		}
		
	}
}