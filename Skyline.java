import java.util.*;

//Initialize object of type Building
	 class Building{
		public int left, height, right; 
		
		public Building(int l, int h, int r){ //Constructor
			this.left = l;
			this.height = h; 
			this.right = r;
		}
	}

public class Skyline {

	Vector skyline = new Vector(); //Output that should be the final answer. Add merged lists to this? ///Output to screen
	//v.add(s); // adds s to the end of the Vector v //I'll need that later I guess
	
	//Basically we simply pick the greater of the two to put in the gap.
	//heights[i] = Math.max(heights[i], building.getHeight()); //something for later to put the larger of the heights in?
	
	public static void main(String[] args){
		
		//Building[] buildings; 
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter stuff here");
		
		int numBuildings = stdin.nextInt(); 
		
		
		while(numBuildings != 0){ //Go through all cases
			
			ArrayList<Building> buildings = new ArrayList<Building>(); //An array of buildings //ArrayList automatically allocates space when more come in
	

		for (int i = 0; i < numBuildings; i++){
			int left = stdin.nextInt();
			int height = stdin.nextInt();
			int right = stdin.nextInt();
			buildings.add(new Building(left, height, right));
		}
		
			for(int i = 0; i < numBuildings; i++){
				System.out.println(buildings.get(i).left + " " + buildings.get(i).height + " " + buildings.get(i).right);
			}
		
		//System.out.println("Building1 " + buildings[1].left);
		
		
			numBuildings = stdin.nextInt(); //Go to next case
		}
		
		/*We can keep two variables, one to store the current height in the 
		 * first set of buildings and the other to keep the current height in the second set of buildings
		 * 
		 * If the current skyline is empty add the two P(l1, h1), P(r1, 0) points representing B1 to the skyline.
			Otherwise find the first Pi(x, h) point of the skyline which immediately precedes lj, the left coordinate of the building Bj, that is xi < lj ≤ xi + 1. 
				Save hi to H if there is such a Pi point, otherwise set H to 0.
			Prepend the skyline with P(lj, hj) if there is no such Pi point or insert P after Pi if hi < hj.
			For every Pk(x, h) point where lj ≤ xk < rj replace Pk with P(xk, hj) if hj > hk and hj ≠ hk - 1, or remove Pk if hj ≥ hk and hj = hk - 1. Save hk to H.
			Let Pl(x, h) denote the first point in the skyline such that rj ≤ xl. Append P(rj, 0) to the skyline if there is no such point or insert P(rj, H) before Pl if rj < xl and H < hj.
		 */
		
		
		/*First I'll need to determine the Skyline for each set of buildings
		 * Then, I'll have two lists for each skyline that I need to mer
		 */
	}
}
