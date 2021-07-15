package MockSystem

public class InternationalMobilePhoneNumber extends PhoneNumber {
	public InternationalPhoneNumber(string raw) : super(raw) {
	}
	@override
	public bool isValid = true;
	@override
	public bool isSmsAble = true;
}
