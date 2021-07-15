package MockSystem

public class LandlinePhoneNumber extends PhoneNumber {
	public LandlinePhoneNumber(string raw){
		super(raw);
	}
	@override
	public bool isValid = true;
	@override
	public bool isSmsAble = false;
}

