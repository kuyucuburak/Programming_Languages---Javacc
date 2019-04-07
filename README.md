Programming Languages - Javacc
==============================

### Introduction
This project is created for writing an interpreter of the language which is named _**ETU TVL**_. 

### Description
In this section, grammar and rules of the language are described.

* **The Grammar**<br>
  Its grammar description in EBNF is given below.
  
  `<ETU TVL Language> -> PROGRAM <ID> ; <Declaration Section> <Initialization Section> <Main Section>`<br>
  
  `<Declaration Section> -> DECLARATION SECTION [<Variable Name List>] ;`<br>
  `<Variable Name List> -> <Variable Name> | <Variable Name> , <Variable Name List>`<br>
  `<Variable Name> -> id `<br>
  
  `<Initialization Section> -> INITIALIZATION SECTION f<Init List> ;`<br>
  `<Init List> -> <Variable Name> = <Logical Value>`<br>
  `<Logical Value> -> TRUE | FALSE | UNKNOWN`<br>
  
  `<Main Section> -> MAIN SECTION f <Statement> ;g`<br>
  `<Statement> -> <Input Stmt> | <Output Stmt> | <Bool Assignment Stmt>`<br>
  `<Input Stmt> -> INPUT 'message ' <Variable Name>`<br>
  `<Output Stmt> -> OUTPUT 'message ' <Bool Expression>`<br>
  `<Bool Assignment Stmt> -> <Variable Name> = <Bool Expression>`<br>
  `<Bool Expression> -> <Bool Term> | <Bool Expression> OR <Bool Term>`<br>
  `<Bool Term> -> <Bool Factor> | <Bool Term> AND <Bool Factor>`<br>
  `<Bool Factor> -> <Bool Primary> | NOT <Bool Primary>`<br>
  `<Bool Primary> -> <Logical Value> | <Variable Name> | (<Bool Expression>)`<br>

* **The Rules**

    * _**Tokens:**_ There are 2 tokens:
    
      * _**id:**_ It is a letter followed by any number of letters or digits, i.e. ["a"-"z","A"-"Z"] ( ["a"-"z","A"-"Z", "0"-"9"])*.
      * _**message:**_ Any sequence of characters other than newline, for user interaction. The other tokens have exactly one lexeme.
    
    * _**Comments:**_ The rest of any line starting with the text "--" is comment, therefore it is skipped. Multi-line comments are not allowed.
    
    * _**Whitespace characters:**_ All whitespace characters, blank, tab and newline, are neglected. The only exception is the whitespace characters within the message.
    
    * _**Operator Precedence:**_ Parenthesis have the highest precedence. The unary operator NOT has the second while the AND operator has the third highest precedences. Operator OR has the lowest precedence. Note that the operator precedences are already enforced by the grammar.
    
    * _**Operator Associativity:**_ Operators OR and AND are associative. Their details are given below:
    
      * _**OR operator:**_ The usual 'OR' logic applies in case both operands are either TRUE or FALSE. In case, one of the operand is UNKNOWN and the other is TRUE, the result is TRUE. The result is UNKNOWN otherwise.
      * _**AND operator:**_ The usual 'AND' logic applies in case both operands are either TRUE or FALSE. In case, one of the operand is UNKNOWN and the other is FALSE, the result is FALSE. The result is UNKNOWN otherwise.
      * _**NOT operator:**_ The usual 'NOT' logic applies in case the operand is either TRUE or FALSE. Otherwise, the result is UNKNOWN, i.e. NOT UNKNOWN = UNKNOWN).
    
    * _**Variables and Types:**_ Every variable belongs to the only type of three-valued logic type, e.g. the set {TRUE, FALSE, UNKNOWN}. Every variable has to be declared but need not to be initialized in initialization section. At declaration, every variable is initialized with the value UNKNOWN. Use of undeclared variables in initialization section or main section is an error and this encounter terminates the execution.
    
    * _**Case sensitivity:**_ The language is case-sensitive like C and Java.
    
    * _**Reserved Keywords:**_ All the lexemes (e.g. TRUE, PROGRAM, OR etc) are reserved and can not be used as identifiers.

### How to use?

Language is implemented in the _**ETU_TVL.jj**_ file. It is compiled already by using _**javacc**_ and _**javac**_. However, if you do any changes in the _**ETU_TVL.jj**_ file, you need to compile the file again. Follow the following steps to compile the file again:

1) Download and move javac into the directory _"C:\Program Files\Java\jdk-10\bin"_.
2) Enter to the terminal _"cd src"_.
3) Enter to the terminal _"set path=C:\Program Files\Java\jdk-10\bin;"_.
4) Enter to the terminal _"javacc ETU_TVL.jj"_.
5) Enter to the terminal _"javac *.java"_.

**Note:** Please change the paths according to your Java installation folder.

Now, all necessary files are created. There are 5 examples to examine the language. You can run examples like the following:

* We need to set environment variable and change the directory:

    1) Enter to the terminal _"set path=C:\Program Files\Java\jdk-10\bin;"_.
    2) Enter to the terminal _"cd src"_.

* Now, we can run the programs which is written in _**ETU TVL**_ as below:

    *  Enter to the terminal "Java ETU_TVL example_1.etutvl":

       > EXCEPTION: You can't declare variables which have same names: "Q"
    
    *  Enter to the terminal "Java ETU_TVL example_2.etutvl":
    
       > EXCEPTION: Use of undeclared variable in the initialization section: "T"
    
    *  Enter to the terminal "Java ETU_TVL example_3.etutvl":
    
       > Enter Z:<br>
         EXCEPTION: Use of undeclared variable in the main section: "Z"
    
    *  Enter to the terminal "Java ETU_TVL example_4.etutvl":
    
       > Enter P:UNKNOWN<br>
         Enter Q:TRUE<br>
         P XOR Q is:UNKNOWN<br>
         P XNOR Q is:UNKNOWN<br>
    
    *  Enter to the terminal "Java ETU_TVL example_5.etutvl":
    
       > Enter P:UNKNOWN<br>
         Enter Q:TRUE<br>
         Enter R:FALSE<br>
         P AND Q:  UNKNOWN<br>
         NOT P AND NOT Q:  FALSE<br>
         P AND Q OR NOT P AND NOT Q:  UNKNOWN<br>
         Q OR R:  TRUE<br>
         P OR NOT R:  TRUE<br>
         NOT Q OR NOT P:  UNKNOWN<br>

### License
Copyright 2019 Burak Kuyucu

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


