package ase.seminars;

import org.openjdk.jmh.annotations.Benchmark;

public class ConcatStringsBenchmarks {

	@Benchmark
	public void stringBuilder() {
		int numChars = 1000;
		String message = "";
		for (int i = 0; i < numChars; i++) {
			message += "a";
		}
	}

	@Benchmark
	public void stringConcat() {
		int numChars = 1000;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numChars; i++) {
			s.append("a");
		}
	}
}
