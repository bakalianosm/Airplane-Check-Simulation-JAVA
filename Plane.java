
import java.util.Random;

public class Plane {
	String title;
    int capacity;
    cargoBay cargoB;
    equipmentCompartment eqComp[];
    passengerCompartment passComp[];
    int passengerCompartmentNum;
    int isReady;

    public Plane(String in_title , int in_capacity){
				System.out.println("Constructing a new Plane...");
    	  Random Rand= new Random();
    	  title=in_title;
    	  capacity=in_capacity;
    	  int num =1+ Rand.nextInt(5);
    	  passengerCompartmentNum=num ;
    	  isReady=0;
    	  cargoB=new cargoBay();
    	  eqComp=new equipmentCompartment[3];
    	  passComp=new passengerCompartment[passengerCompartmentNum];
    	  for (int i=0 ; i<3 ; i++){
      	    eqComp[i] =new equipmentCompartment();
      	  }
//
    	  for (int i=0 ; i<passengerCompartmentNum ; i++){
    	    passComp[i] =new passengerCompartment();
    	  }
    	  System.out.println("A new PLANE has just created");
    	}

    public void process(employee pr_emp){
    	  cargoB.process(pr_emp);
    	  for (int i=0 ; i<3 ; i++) eqComp[i].process(pr_emp);
    	  for (int i=0 ; i<passengerCompartmentNum ; i++) passComp[i].process(pr_emp);
    	}



    public void ready_check(){
    	  this.beReady();
    	  if (isReady==1) System.out.println("Plane ready to take off!");
    	  else System.out.println("Plane NOT ready to take off!");

    	}

    	                  // ---accessors
    public int getNum(){
    	return passengerCompartmentNum;
    	}

    public cargoBay returnCB(){
    	  return this.cargoB;
    	}

    public equipmentCompartment[] returnEC(){
    	  return this.eqComp ;
    	}

    public passengerCompartment[] returnPC(){
    	  return this.passComp;
    	}

    public void beReady(){
    	  int limit=this.passengerCompartmentNum;
    	  int cargoCheck=0,passCompCheck=0,equipCompCheck=0;
    	  if (cargoB.allOk()==1) cargoCheck=1; //cargo is ready
    	  //System.out.println("cargoCheck = " + cargoCheck);
    	  for(int i=0 ; i<3 ; i++){
    	    if (eqComp[i].allOk()==1) {
    	      equipCompCheck=1;
    	      continue;
    	    }
    	    else equipCompCheck=0;
    	    break;
    	  }
    	  //System.out.println("equipCompCheck =" + equipCompCheck);
    	   //equipment is READY
    	  for(int i=0 ; i<limit ; i++){
    	    if(passComp[i].allOk()==1)  {
    	      passCompCheck=1;
    	      continue;
    	    }
    	    else passCompCheck=0;
    	  }
    	  //System.out.println("passCompCheck = " + passCompCheck);
    	  if ( (cargoCheck==1) &&(equipCompCheck==1) && (passCompCheck==1) ) this.isReady= 1;
    	  else this.isReady= 0;

    	}

}
