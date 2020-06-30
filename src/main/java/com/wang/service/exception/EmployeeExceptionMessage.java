package com.wang.service.exception;

public class EmployeeExceptionMessage extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4886148293651704375L;
	public String message;
    public Throwable throwable;
    public EmployeeExceptionMessage(String message){
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

	public EmployeeExceptionMessage(Throwable throwable){
        super(throwable);
        this.throwable = throwable;
    }
}
