# **Automata Project**

This project was based on [__Automata Theory__](https://en.wikipedia.org/wiki/Automata_theory) which deals with simple machines also known as Automatas/State_machines, and their ability to follow computational logic to carry out simple tasks or processes.

The focus for the project was the [__Finite_Automaton__](https://en.wikipedia.org/wiki/Finite-state_machine) model, this model specify that the abstruct machine can only be in a finite number of states at any given time.

There are two ways to model the machines, the first type is the **Definite Finite Automaton**; in this model the machine is characterized by having any number of states as long as it has one *start state* and one *ending(finish state)*.

 The **Nondefinite Finite Automaton** on the other hand can have more than one ending, i.e the machine can have more than one way to *finish* the task or to *end* a process, but even in this model the machine cant have more than one way to *start (start_ state).*

 For this project we had to model the automata, the task of our machine was to read words of any form and only accept words that contain two consecutive characters of type integer 1 and 0. Read the descriptions of the java classes in the [__source code__](https://github.com/MrRutledge/Automata_Project/tree/master/src) to get a better understanding of the tasks.

We later had to implement our models in programs, the results of which can be tried out by git cloning this project and experiment with it using the above source code.

Project Trees.

```bash
Automata_Project 
        |─Readme.md
        |-bin
        |──src
             |-bits.txt
             |──Bits1XParallel.java
             |──DFA.java
             |──DFAFilter.Java

```