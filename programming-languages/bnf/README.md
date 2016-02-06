
# Backus-naur Form (BNF)

> Peter Naur referred to BNF as a metalinguistic formulae,
>
> "Sequences of characters enclosed in the bracket <> represent
> metalinguistic variables whose values are sequences of symbols.
> The marks ::= and | (the latter with the meaning of or) are
> metalinguistic connectives. Any mark in a formula, which is not a
> variable or a connective, denotes itself (or the class of marks which
> are similar to it). Juxtaposition<sup>[definition][def]</sup> of marks
> and/or variables in a formula signifies juxtaposition of the sequences
> denoted."
>
> &mdash; [Revised Report on the Algorithmic Language Algol 60](http://www.masswerk.at/algol60/report.htm)

[def]:https://www.wordnik.com/words/juxtaposition

This is a meta-language used to describe syntax of languages. It (and its
variants) has seen widespread usage in defining protocols and instruction
sets.

It's at times referred to as 'Backus Normal Form'.

BNF has impacted majorly the development of programming languages. It has
been used in constructing compiler-compiler systems, most notably **yacc**.

BNF has inspired several variants to be developed, usually to make it
more precise and human-readble. The most notable variants, with defined
specification include:

* Extended Backus-Naur Form (EBNF)
* Augmented Backus-Naur Form (ABNF)


## specification:

A specification using BNF is a set of derivation rules, written as:

```
<symbol> ::= _expression_
```

`::=` can be read as "is defined as". `expression` is a sequence of one or
more symbols. Symbols can be separated using `|`, and can be read as "or".


## possible representation:

A possible representation of BNF, in BNF:

```
<syntax>         ::= <rule> | <rule> <syntax>
<rule>           ::= <opt-whitespace> "<" <rule-name> ">" <opt-whitespace>
                     "::=" <opt-whitespace> <expression> <line-end>
<opt-whitespace> ::= "" | " " <opt-whitespace>
<expression>     ::= <list> | <list> "|" <expression>
<line-end>       ::= <opt-whitespace> <EOL> | <line-end> <line-end>
<list>           ::= <term> | <term> <opt-whitespace> <list>
<term>           ::= <literal> | "<" <rule-name> ">"
<literal>        ::= '"' <text> '"' | "'" <text> "'"
```

## references:

* [Wikipedia &mdash; Backus-Naur Form](https://en.wikipedia.org/wiki/Backus%E2%80%93Naur_Form)
* [RFC &mdash; Augmented BNF][abnf]

[abnf]:https://tools.ietf.org/html/rfc5234

