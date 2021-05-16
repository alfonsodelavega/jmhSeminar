package ase.seminars;

import org.openjdk.jmh.infra.Blackhole;

public class ConcatStringsBenchmarksComplete {

	//	@Benchmark
	public void stringBuilder(ConcatStringsState state, Blackhole bh) {
		String message = "";
		for (int i = 0; i < state.numChars; i++) {
			message += "a";
		}
		bh.consume(message);
	}

	//	@Benchmark
	public void stringConcat(ConcatStringsState state, Blackhole bh) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < state.numChars; i++) {
			s.append("a");
		}
		bh.consume(s.toString());
	}
}
