package com.uws.designpatterns.structural.bridge.abstracts;

import com.uws.designpatterns.structural.bridge.implementors.*;

public class RefinedAbstraction extends Abstraction {

	/*
	 * (non-Javadoc)
	 * @see abstracts.Abstraction#loadImplementor()
	 * The ConcreteImplementor is instantiated as the Implementor type attribute
	 * inherited from the super class Abstraction. Thus, the operation() method is
	 * actually the implementation of the operationImp() method of ConcreteImplementor.
	 */
	@Override
	public Implementor loadImplementor() {
		imp = new ConcreteImplementor();//Hidden
		
		return imp;

	}

}
