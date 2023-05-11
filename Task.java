import java.util.Vector;
import ProjectManagment.Resource;

public class Task {
	private Object _name;
	private Object _theEmployees;
	private Object _theResources;
	public WorkBreakdownStructure _unnamed_WorkBreakdownStructure_;
	public Vector<Employee> _unnamed_Employee_ = new Vector<Employee>();
	public Vector<Resource> _unnamed_Resource_ = new Vector<Resource>();

	public Task() {
		throw new UnsupportedOperationException();
	}

	public void getName() {
		return this._name;
	}

	public void setName(Object aName) {
		this._name = aName;
	}

	public void getTheEmployees() {
		return this._theEmployees;
	}

	public void setTheEmployees(Object aTheEmployees) {
		this._theEmployees = aTheEmployees;
	}

	public void getTheResources() {
		return this._theResources;
	}

	public void setTheResources(Object aTheResources) {
		this._theResources = aTheResources;
	}
}