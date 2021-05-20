# COD
### HelloWorld - dfa design
### tabledrivenscanner - r(0-9)*
### tabledrivenscanner - (ab)|(ab)*c
### Maximunch - (ab)|(ab)*c
### Maximunchp1 - pan card verifier
### Recursive Descent Parser(RDP)


### Antlr Codes:
*  Roll no verifier
*  Pancard Verifier

* Vehicle number verfier
* Syntax Analysis
### q4- Write an antlr specification for the below grammar and perform syntax analysis on the sentence (a,a)$. 
####   Sà(L)|a

####    LàL,S|S


### q5- Write an antlr specification for the below grammar and perform syntax analysis on the sentence: (()()).
####    SàS(S)S | ϵ

### p2- Syntax analysis of expressions checking for grammar below
#### E -> E >> T

####  E ->  E << T

#### E ->  T

#### T -> F & T

#### T -> F | T

#### T -> F ^ T

#### T -> F

#### T -> F 
#### F -> ~ F

#### F -> P

#### P -> ( E )

#### P -> id

#### P -> num

* Lexer analysis(passport number verifier and french ssn)
### End semester(ends finally :( )
 1. Write L-attributed grammar to accept nested expressions involving aritmetic operations: expression can have constant or variable with a binary operator( +,-,/,*). Expressions can be combined. Highest precedence should be given to ( ), then *,/ and then +,- operators. 

2. Store in memory the following variable value pairs: 

3. Write appropriate semantic rules to convert the arithmetic expression into prefix expressions 

4. Antlr file generation 

5. Write appropriate java file to display the parse tree

6. Display the evaluated value for each expression. Few samples of input and output is given below.
