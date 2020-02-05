target:
	mkdir -p target

.PHONY: clean
clean:
	rm -fr target

target/classes/foo/bar.class: src/**/* target
	make clean && clojure -m foo.build

.PHONY: build
build: target/classes/foo/bar.class

.PHONY: run
run: build
	java -cp "target/classes:target/lib/lib/*" foo.bar
