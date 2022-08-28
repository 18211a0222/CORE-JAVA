package com.monocept.model;

public class OuterClass {

	int OuterClassVariable = 10;

	public void WhereAmI() {
		System.out.println("In the OuterClass");

		class LocalInnerClass {

			int LocalClassVariable = 20;

			public void WhereAmI() {
				System.out.println("In the LocalInnerClass");
			}

		}

		LocalInnerClass local = new LocalInnerClass();
		local.WhereAmI();
	}

	// InnerClass
	public static class InnerClass {
		int InnerClassVariable = 20;

		public void WhereAmI() {
			System.out.println("In the InnerClass");
		}

	}

}
