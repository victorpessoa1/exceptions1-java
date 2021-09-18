package model.exceptions;

public class DomainException extends Exception //pode ser Exception (o compilador te obriga a tratar) ou Runtimeexception (o compilador não obriga a tratar)
{
	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg)
	{
		super(msg);
	}
}
