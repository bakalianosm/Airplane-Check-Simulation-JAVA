
public class maintenanceEmployee extends employee {

	public maintenanceEmployee(String in_name) {
		this.name=in_name;
		System.out.println("We just hire a new maintenance employee with name " + this.name);
	}

	public void report() {
		System.out.println("It's time for MAINTENANCE employee to give a report" );
		System.out.println("...everything about maintain is OK");
	}


	public void workOn(equipmentCompartment eq_comp){
		  eq_comp.setMaintained();
		  System.out.println("\t\t\t\tA maintenance Employee is working on EQUIPMENT compartment");

		}

	public void workOn(cargoBay c_bay){
		  c_bay.setMaintained();
		  System.out.println("\t\t\t\tA maintenance Employee is working on EQUIPMENT compartment");

		}
}
