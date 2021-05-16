package ase.seminars;

import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class ConcatStringsState {

	@Param({ "10", "100", "1000", "2000", "5000", "10000" })
	int numChars;
}
