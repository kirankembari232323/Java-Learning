Two types of the  Exception


1) checked Exception
   the class that extendes throwable class except runtimeException and error are checked Exception

   checked Exception checked during compile time

   ex. IOExcepetion, SQLException


   - must use a try catch block


2) unChecked Exception

   the classes that extendes runtime exceptions and errrors are called as unChecked exception

    ex. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

    - no try cache block



  3) Error
    
    ex, OutOfMemoryError, VirtualMachineError, AssertionError



Exception handling using try, cache, throw, throws, finally


1) try{

	code - might throw an exception
}

2) catch(Exception e){

	 handling SOP(e);
	e.printStacktrace();
	 SOP(e.getMessage())
}

3) finally{

	// always get executed wheter exception occurs or not
	// we can use this to write some cleanup code
	//
}


4) throw - explicistely for custom exceptions

5) throws - ddeclare exceptions classess

exc