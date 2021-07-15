package MockSystem

public class MobilePhoneNumber extends PhoneNumber {
	public MobilePhoneNumber(string raw) : super(raw) {
	}
	@override
	public bool isValid = true;
	@override
	public bool isSmsAble = true;
}

