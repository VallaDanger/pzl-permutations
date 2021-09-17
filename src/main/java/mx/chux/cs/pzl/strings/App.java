package mx.chux.cs.pzl.strings;

import java.util.Collection;

import java.util.logging.Level;
import java.util.logging.Logger;

import mx.chux.cs.pzl.PuzzleExecutor;
import mx.chux.cs.pzl.TimedPuzzleSolution;

public class App {
    
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    
    public static void main( String[] args ) {

        final PuzzleExecutor<Collection<String>> executor = PuzzleExecutor.from(Permutations.of("abc"));
	    final TimedPuzzleSolution<Collection<String>> solution = executor.executeTimed();
		
    	LOGGER.log(Level.INFO, "IsIsomorphic [ time: {0} ]: {1}", new Object[] { solution.timeElapsed(), solution.get() });
	    
    }
    
}
