//Inheritance

//in heritance a sub class
 //1) can aquire all non-private variables and methods not private
// 2)can have its own methods  & varibles
// 3)redefiendes the beahvour


// code reusablity
// code sharing 
// faster development


// multiple inheritance

//1. single = B -> A  class     //B extends A 
//2. multilevel =  C -> B ->   //class C extends class B, class B   extends class A
//3. hierachichacal = C,B -> A  // class C extends class A, class B   extends class A
//4. multiple = C-> A,B       // class C extends class A,B


multiple inheritance is not possible in java

All class form hierachichi

multiple inheritance caused  "Diamond Problem" it causes ambiguity. if we two class A, B and they have parent X, and if classs extends the A, B it cused member(method, variables) ambiguity, 
we'll not know exactly wihch member we'll use in the class C


multiple inheritance achieved by interface. 

multiple inheritance it is not possible throught classes becaus it creaes member(method, variables) ambiguity but it can be possible through interface see an example.


interface A {...}

interface B {...}

interface C {...}

Class X implements A,B,C{  // multiple inheritance with interface

	// here you can use
}

