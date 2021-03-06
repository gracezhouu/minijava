package com.munkhbat.minijava.visitor;

import com.munkhbat.minijava.ast.And;
import com.munkhbat.minijava.ast.ArrayAssign;
import com.munkhbat.minijava.ast.ArrayLength;
import com.munkhbat.minijava.ast.ArrayLookup;
import com.munkhbat.minijava.ast.Assign;
import com.munkhbat.minijava.ast.Block;
import com.munkhbat.minijava.ast.BooleanType;
import com.munkhbat.minijava.ast.Call;
import com.munkhbat.minijava.ast.ClassDeclExtends;
import com.munkhbat.minijava.ast.ClassDeclSimple;
import com.munkhbat.minijava.ast.False;
import com.munkhbat.minijava.ast.Formal;
import com.munkhbat.minijava.ast.Identifier;
import com.munkhbat.minijava.ast.IdentifierExp;
import com.munkhbat.minijava.ast.IdentifierType;
import com.munkhbat.minijava.ast.If;
import com.munkhbat.minijava.ast.IntArrayType;
import com.munkhbat.minijava.ast.IntegerLiteral;
import com.munkhbat.minijava.ast.IntegerType;
import com.munkhbat.minijava.ast.LessThan;
import com.munkhbat.minijava.ast.MainClass;
import com.munkhbat.minijava.ast.MethodDecl;
import com.munkhbat.minijava.ast.Minus;
import com.munkhbat.minijava.ast.NewArray;
import com.munkhbat.minijava.ast.NewObject;
import com.munkhbat.minijava.ast.Not;
import com.munkhbat.minijava.ast.Plus;
import com.munkhbat.minijava.ast.Print;
import com.munkhbat.minijava.ast.Program;
import com.munkhbat.minijava.ast.This;
import com.munkhbat.minijava.ast.Times;
import com.munkhbat.minijava.ast.True;
import com.munkhbat.minijava.ast.Type;
import com.munkhbat.minijava.ast.VarDecl;
import com.munkhbat.minijava.ast.While;

public interface TypeVisitor {
  public Type visit(Program n);
  public Type visit(MainClass n);
  public Type visit(ClassDeclSimple n);
  public Type visit(ClassDeclExtends n);
  public Type visit(VarDecl n);
  public Type visit(MethodDecl n);
  public Type visit(Formal n);
  public Type visit(IntArrayType n);
  public Type visit(BooleanType n);
  public Type visit(IntegerType n);
  public Type visit(IdentifierType n);
  public Type visit(Block n);
  public Type visit(If n);
  public Type visit(While n);
  public Type visit(Print n);
  public Type visit(Assign n);
  public Type visit(ArrayAssign n);
  public Type visit(And n);
  public Type visit(LessThan n);
  public Type visit(Plus n);
  public Type visit(Minus n);
  public Type visit(Times n);
  public Type visit(ArrayLookup n);
  public Type visit(ArrayLength n);
  public Type visit(Call n);
  public Type visit(IntegerLiteral n);
  public Type visit(True n);
  public Type visit(False n);
  public Type visit(IdentifierExp n);
  public Type visit(This n);
  public Type visit(NewArray n);
  public Type visit(NewObject n);
  public Type visit(Not n);
  public Type visit(Identifier n);
}
