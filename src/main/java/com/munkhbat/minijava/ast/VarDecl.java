package com.munkhbat.minijava.ast;

import com.munkhbat.minijava.tree.IRVisitor;
import com.munkhbat.minijava.tree.exp.IRExp;
import com.munkhbat.minijava.visitor.TypeVisitor;
import com.munkhbat.minijava.visitor.Visitor;

public class VarDecl {
  public Type t;
  public Identifier i;
  
  public VarDecl(Type at, Identifier ai) {
    t=at; i=ai;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
  
  public IRExp accept(IRVisitor v) 
  {
	 return v.visit(this);
  }
}
