# foe - fail on errors
# bm  - benchmark mode (avgt: average time, thrpt: throughput)
# tu  - time unit
# f   - number of forks (times each benchmark, with iterations and warmups, is repeated)
# i   - number of iterations
# wi  - number of warmup iterations
# r   - minimum seconds for iteration (repeats benchmark call if not yet reached, then averages)
# w   - minimum seconds for warmup iteration
# gc  - force garbage collection between iterations
# o   - output file (defaults to jhm-result.csv)
# rf  - results format (csv, json, anything else?)

# the "\." before emf diffmerge and emf compare prevents from running parallel tests for all benchmarks
# "Peacemaker" also includes "ParallelPeacemaker" benchmarks

java -jar target/benchmarks.jar -foe true -bm thrpt -tu ms -f 1 -i 5 -wi 2 -r 1 -w 1 -rf csv