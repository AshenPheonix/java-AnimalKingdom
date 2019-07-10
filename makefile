build: compile link

all: compile link view

compile:
	javac src/Animals/*.java -d build

link:
	jar cvfe AnimalKingdom.jar animals.Main -C build transport/

view:
	java -jar AnimalKingdom.jar