package mx.chux.cs.pzl.strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import mx.chux.cs.pzl.PuzzleSolution;

public class Permutations implements PuzzleSolution<Collection<String>> {

    public static Permutations of(final String string) {
        return new Permutations(string);
    }

    private final String string;

    private Permutations(final String string) {
        this.string = string;
    }

    @Override
    public Collection<String> bruteForceSolution() {
        return optimalSolution();
    }

    @Override
    public Collection<String> optimalSolution() {
        final Set<String> permutations = new HashSet<>();
        return permutations(permutations, this.string.toCharArray(), 0);
    }

    private Collection<String> permutations(final Collection<String> permutations, final char[] array, final int start) {

        final int end = array.length;
        
        if( start == (end-1) ) {
            // no more places to swap
            return Collections.singleton(new String(array));
        }
        
        for( int index = start ; index < end ; index++ ) {
            // swap values from index and start
            swap(array, start, index);
            // recurse from next position from start ( after swapping )
            permutations.addAll(permutations(permutations, array, start+1));
            // return values to original positions
            swap(array, index, start);
        }
        
        return permutations;
    }
    
    private void swap(final char[] array, int i, int j) {
        final char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
