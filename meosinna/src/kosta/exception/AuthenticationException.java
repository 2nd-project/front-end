package kosta.exception;

/**
 * �α��� �� �������� �� ����� �������� �� �߻��ϴ� ����
 * DAO���� ������ ����� null�� ������ AuthenticationException�� �߻���Ų��.
 * */
public class AuthenticationException extends RuntimeException {
	public AuthenticationException() {}
	
	public AuthenticationException(String message) {
		super(message);
	}
}
