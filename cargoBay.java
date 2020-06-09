

public class cargoBay extends privateCompartment{

	public cargoBay(){
	  isSecured=0;
	  isCleaned=0;
	  isMaintained=0;
	  System.out.println("A cargo bay has just created " );
	}

	public void ready_check(){
		if( (isCleaned==1) && (isSecured==1) && (isMaintained==1) ) System.out.println("CargoBay is OK");
		else System.out.println("CargoBay NOT OK");
	}

	public void process(employee emp){
		System.out.println("Processing in cargoBay");
	   emp.workOn(this);
	}

	public void setSecured(){
	  isSecured=1;
	  System.out.println("cargoBay is Secured");
	}
	public void setCleaned(){
	  isCleaned=1;
	  System.out.println("cargoBay is Cleaned ");
	}

	public void setMaintained(){
	  isMaintained=1;
	  System.out.println("cargoBay is is Maintained");
	}

	void checkSec(){
	  if (isSecured==1) System.out.println("CARGO BAY is secured");
	  else System.out.println("CARGO BAY NOT secured");
	}

	public void checkCl(){
	  if (isCleaned==1) System.out.println("CARGO BAY is Cleaned");
	  else System.out.println("CARGO BAY NOT Cleaned");
	}
	public void checkMaint(){
	  if (isMaintained==1) System.out.println("CARGO BAY is Maintained");
	  else System.out.println("CARGO BAY NOT Maintained");
	}


	public int allOk(){
	  if( (this.isSecured==1) && (this.isCleaned==1) && (this.isMaintained==1) ) return 1;
	  else return 0;

	}


}
