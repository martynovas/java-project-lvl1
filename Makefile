build:
	gradle clean installDist
run:
	./build/install/app/bin/app
run-dist: build run

.PHONY: build
