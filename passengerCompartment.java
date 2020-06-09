
import java.util.Random;

public class passengerCompartment extends planeComponent{
	int isSecured;
	public passengerCompartment() {
		Random Rand= new Random();
		isSecured=0;
		int num =50+ Rand.nextInt(100);
		size=num;
		System.out.println("Constructing a passenger compartment with size = " + size);



	}

	public void ready_check(){
		  if (this.isSecured==1) System.out.println("passengerCompartment is OK !");
		  else System.out.println("passengerCompartment NOT OK");
		}

	public void process(employee emp){
		System.out.println("Processing in passengerCompartment ");
		  emp.workOn(this);
		}

	int getSize(){
		  return this.size;
		}

	void setSecured(){
		  this.isSecured=1;
		  System.out.println("passengerCompartment now is secured ");
		}

	int allOk(){
		  if (isSecured==1) return 1;
		  else return 0;
		}

}
