package com.munkhbat.minijava.ast;

import com.munkhbat.minijava.tree.IRVisitor;
import com.munkhbat.minijava.visitor.TypeVisitor;
import com.munkhbat.minijava.visitor.Visitor;

public class MainClass {
	public Identifier i1,i2;
	public Statement s;

	public MainClass(Identifier ai1, Identifier ai2, Statement as) {
		i1=ai1; i2=ai2; s=as;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public Type accept(TypeVisitor v) {
		return v.visit(this);
	}
	public void accept(IRVisitor v)
	{
		v.visit(this);
	}
}

