# Compiler Project

The grammar was modified adding the precedence between the operatores and removing the ambiguity of the grammar.

Instructions to test the project using the tool Ant:

Note: The file sample.txt contains the code to be tested.

First of all, compile the project using the Ant command:

```
ant
```

After this, you can execute the scanner using this command:

```
java -jar dist/Compiler.jar -target scan sample.txt
```

This command shows the relation between the tokens and the lexemes.

Or you can execute the parser using this command:

```
java -jar dist/Compiler.jar sample.txt
```

If the code contains an error, this command shows the error message, like a normal compiler.
