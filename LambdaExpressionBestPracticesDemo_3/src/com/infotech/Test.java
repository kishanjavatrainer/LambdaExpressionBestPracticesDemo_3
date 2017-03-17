package com.infotech;

public class Test {

	private String value ="Eclosing scope value";
	public static void main(String[] args) {

		new Test().scopeExperiment();
	}
	private  void scopeExperiment() {
		Foo foo1 = new Foo() {
			private String value ="Inner Class value";
			@Override
			public String method() {
				return this.value;
			}
		};
		
		System.out.println(foo1.method());
		Foo foo2 =()->{
			//String value ="Lambda value";
			return this.value;
		};
		
		System.out.println(foo2.method());
	}

}


@FunctionalInterface
interface Foo{
	String method();
}