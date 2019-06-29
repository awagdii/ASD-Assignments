package day05.templete;

public class TravelCompany extends Company
{
	public TravelCompany(String name, String address, String phone, String fax)
	{
		super(name, address, phone, fax);
	}
	
	// Replacement Method
	@Override
	public String getType() { return "Travel"; }

	@Override
	public void showPersonalData() {
		//
	}

	// No need to override show() at this point. Later when Travel Company
	// is associated to Travel objects, it can ask them to show their attributes.
}
