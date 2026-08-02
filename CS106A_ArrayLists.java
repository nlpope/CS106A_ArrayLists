/**
 * File: CS106A_ArrayLists.java
 * ----------------------------
 * Example of how ArrayList<E> works. This function
 * is provided via the 'java.util.*' import.
 */

import acm.program.*;
import java.util.*;

public class CS106A_ArrayLists extends ConsoleProgram
{		
	public void run()
	{ 
		ArrayList<Integer> arrayListExample = new ArrayList<Integer>();
		int arraySum = 0;
		
		arrayListExample.add(6);
		arrayListExample.add(28);
		
		arraySum += arrayListExample.get(0);
		arraySum += arrayListExample.get(1);
	}
}