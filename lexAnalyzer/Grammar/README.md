# Grammar

Instructions for testing the grammar using ANTLR:

1) Generate the Java files using this command:

```
antlr4 Grammar.g4
```

2) The generated Java files can be "compiled" using javac using this command:

```
javac Grammar*.java
```

3) The generated grammar can be tested with one of the following commands:

This command outputs the tree in the terminal/console:

```
grun Grammar source -tree sample.txt
```

This command outputs the parse tree graphically in a window:

```
grun Grammar source -gui sample.txt
```

This command outputs the resulting tokens in the terminal/console:

```
grun Grammar source -tokens sample.txt
```

The file sample.txt contains the code to be tested.
