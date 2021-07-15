package mockSystem

public abstract class PhoneNumber {
	protected string original;
	public PhoneNumber(string raw){
		original = raw;
	}
	public string getOriginal() = {
		return original;
	}
	bool isValid;
	bool isSmsAble;
}
