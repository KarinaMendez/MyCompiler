public MyError implements ANTLRErrorStrategy{
	
	/*inErrorRecoveryMode(Parser recognizer){

	}
	
	//Tests whether or not recognizer is in the process of recovering from an error.
	void	recover(Parser recognizer, RecognitionException e){

	}
	
	//This method is called to recover from exception e.
	Token	recoverInline(Parser recognizer){

	}*/

	//This method is called when an unexpected symbol is encountered during an inline match operation, such as Parser.match(int).
	void reportError(Parser recognizer, RecognitionException e){
		System.out.println("Error: " + e);
	}
}