package com.munkhbat.minijava.tree;

abstract public class Stm {
	abstract public ExpList kids();
	abstract public Stm build(ExpList kids);
}

