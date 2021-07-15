package MockSystem

public class InvalidPhoneNumber extends PhoneNumber {
	public InvalidPhoneNumber(string raw) : super(raw) {
	}
	@override
	public bool isValid = false;
	@override
	public bool isSmsAble = false;
}

