
public class main {
	public static void main(String[] args) {

	Plane newPlane=new Plane(" Superfortress " , 350 ) ;

	employee sEmp= new securityEmployee("Michael");
	employee mEmp =new maintenanceEmployee("Sotiria");
	employee cEmp =new cleaningEmployee("Johnnie");

	sEmp.report();
	newPlane.process(sEmp);

	mEmp.report();
	newPlane.process(mEmp);

	cEmp.report();
	newPlane.process(cEmp);

	newPlane.ready_check();

    }
}
