

public class securityEmployee extends employee {
	public securityEmployee(String in_name) {
		this.name=in_name;
		System.out.println("We just hire a new security employee with name " + this.name);
	}

	public void report() {
		System.out.println("It's time for SECURITY employee to give a report" );
		System.out.println("...everything about security is OK");
	}

	public void workOn(passengerCompartment pass_comp){
		  pass_comp.setSecured();
		  System.out.println("\t\t\t\tA maintenance Employee is working on EQUIPMENT compartment");
		}

	public void workOn(equipmentCompartment eq_comp){
		  eq_comp.setSecured();
		  System.out.println("\t\t\t\tA maintenance Employee is working on EQUIPMENT compartment");
		}

	public void workOn(cargoBay c_bay){
		  c_bay.setSecured();
		  System.out.println("\t\t\t\t\tA maintenanceEmployee is working on CARGO BAY compartment");

		}

}
