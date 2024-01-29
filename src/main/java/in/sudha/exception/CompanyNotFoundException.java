package in.sudha.exception;

public class CompanyNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CompanyNotFoundException() {
		super();
	}
	public CompanyNotFoundException(String msg) {
		super(msg);
	}

}
