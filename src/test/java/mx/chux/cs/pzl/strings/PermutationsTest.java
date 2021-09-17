package mx.chux.cs.pzl.strings;

import org.junit.Test;

import mx.chux.cs.pzl.PuzzleExecutor;
import mx.chux.cs.pzl.PuzzleSolution;

import static org.assertj.core.api.Assertions.*;

import java.util.Collection;

public class PermutationsTest {

    @Test
    public void permutationsTest() {
        final PuzzleSolution<Collection<String>> puzzle = Permutations.of("abc");
        final PuzzleExecutor<Collection<String>> executor = PuzzleExecutor.from(puzzle);
        final Collection<String> solution = executor.execute();
        assertThat(solution).containsOnlyOnce("abc", "acb", "bac", "bca", "cab", "cba");
    }

}
