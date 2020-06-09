

public abstract class privateCompartment extends planeComponent{
  int isSecured;
	int isCleaned;
	int isMaintained;

	public abstract void ready_check();
	public abstract void process(employee emp);
	public abstract void setSecured();
	public abstract void setMaintained();
	public abstract void setCleaned();
	public abstract int allOk();
}
