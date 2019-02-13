JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

CLASSES = \
TipCalculator.java\
TipAppClass.java

default: classes

classes: $(CLASSES:.java=.class)

clean: ; $(RM) *.class
