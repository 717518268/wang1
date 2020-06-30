package com.wang.service.exception;

public class EmployeeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4886148293651704375L;
	public String message;
    public Throwable throwable;
    public EmployeeException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	public EmployeeException(Throwable throwable){
        super(throwable);
        this.throwable = throwable;
    }
}
