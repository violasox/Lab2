public class Lab2 {
    
    public static void main(String[] args) {

	System.out.println("As I was going to St. Ives");
	System.out.println("I met a man with seven wives");
	System.out.println("Each wife had seven sacks");
	System.out.println("Each sack had seven cats");
	System.out.println("Each cat had seven kits");
	System.out.println("Kittens, cats, sacks, wives");
	System.out.println("How many were going to St. Ives?");
	
	// 1. Each of the following variable declarations has something
	// wrong with it.  Uncomment the line and fix it.  If your code
	// compiles, you are probably on the right track!
	// Assume that the original man is also going to St. Ives, so
	// the boolean variable manGoingToStIves should be true.
	
	boolean manGoingToStIves = true;

	short numWives = (short)7;

	double numSacksPerWife = (double)7;
	
	double numCatsPerSack = 7.0;

	long numKitsPerCat = (long)7;

	double total;

	// If the original man is going to St. Ives, then all are going
	// the narrator, original man, kitten, cats, sacks, wives.
	// If the original man is going AWAY from St. Ives, then the only
	// person going is the narrator

	if (manGoingToStIves) {
	    // 2. Remember, if the original man is going to St. Ives, then
	    // all of the wives, sacks, cats, and kittens are as well, along
	    // with the narrator.
	    // Calculate the number going to St. Ives
	    total = (numWives * numSacksPerWife * numCatsPerSack * numKitsPerCat);
		total += (numWives * numSacksPerWife * numCatsPerSack);
		total += (numWives * numSacksPerWife);
		total += numWives;
		total += 2.0;
		
	} else {
	    // Otherwise, only the narrator is going!
	    total = 1;
	}
	
	// 3. Right before exiting, the system should print
	// "Number going to St. Ives is " and then, on the same line,
	// the number going to St. Ives (stored in the _total_ variable).
	// Add a statement or statements that will do this.
	
	System.out.println("Number going to St. Ives is " + total);
	
    }
    
}