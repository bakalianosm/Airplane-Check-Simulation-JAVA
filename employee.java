
public abstract class employee {

	String name;
	public String getName() {
		return this.name;
	}
	public abstract void report();
	public void workOn(passengerCompartment pass_comp) {};
	public abstract void workOn(equipmentCompartment eq_comp);
	public abstract void workOn(cargoBay c_bay);

}
