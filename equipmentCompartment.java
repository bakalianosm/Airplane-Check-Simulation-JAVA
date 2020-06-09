

public class equipmentCompartment extends privateCompartment{

	public equipmentCompartment(){
		  isSecured=0;
		  isCleaned=0;
		  isMaintained=0;
		  System.out.println("An equipmentCompartment has just created ");

		}
	public void ready_check(){
		  if( (isCleaned==1) &&(isSecured==1)&& (isMaintained==1) ) System.out.println( "equipmentCompartment is OK");
		  else System.out.println("equipmentCompartment NOT OK" );
		}

	public void process(employee emp){
		  System.out.println("Processing in equipmentCompartment");
		  emp.workOn(this);
		}

	public void setSecured(){
		  isSecured=1;
		  System.out.println("equipmentCompartment is is Maintained");
		}

	public void setCleaned(){
		  isCleaned=1;
		  System.out.println("equipmentCompartment is Cleaned ");
		}
	public void setMaintained(){
		  isMaintained=1;
		  System.out.println("equipmentCompartment is is Maintained");
		}
	public void checkSec(){
		  if (isSecured==1) System.out.println("EQUIPMENT is secured");
		  else System.out.println("EQUIPMENT NOT secured");
		}

	public void checkCl(){
		  if (isCleaned==1) System.out.println("EQUIPMENT is Cleaned");
		  else System.out.println("EQUIPMENT NOT Cleaned");
		}

	public void checkMaint(){
		  if (isMaintained==1) System.out.println("EQUIPMENT is Maintained");
		  else System.out.println("EQUIPMENT NOT maintained");
		}
	public int allOk(){
		  if( (isSecured==1) && (isCleaned==1) && (isMaintained==1) ) return 1;
		  else return 0;
		}

}
