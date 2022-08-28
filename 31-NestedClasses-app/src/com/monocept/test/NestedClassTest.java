package com.monocept.test;

import com.monocept.model.OuterClass;

public class NestedClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass outer = new OuterClass();
		outer.WhereAmI();
		
		//Inner Class
		//OuterClass.InnerClass inner = outer.new InnerClass();
		//inner.WhereAmI();
		
		//Static Class
		OuterClass.InnerClass staticInner = new OuterClass.InnerClass();
		staticInner.WhereAmI();
	}

}
