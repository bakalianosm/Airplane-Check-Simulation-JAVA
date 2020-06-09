
public class cleaningEmployee extends employee {
	public cleaningEmployee(String in_name) {
		this.name=in_name;
		System.out.println("We just hire a new cleaning employee with name " + this.name);
	}
	public void report() {
		System.out.println("It's time for CLEANING employee to give a report" );
		System.out.println("...everything about cleaning is OK");
	}

	public void workOn(equipmentCompartment eq_comp){
		  eq_comp.setCleaned();
		  System.out.println("\t\t\t\tA SECURITY worked on equipmentCompartment and proof that this compartment is READY");
		}
	public void workOn(cargoBay c_bay){
		  c_bay.setCleaned();
		  System.out.println("\t\t\t\tA SECURITY worked on cargoBay and proof that this compartment is READY");
		}

}
