import java.util.Vector;

public class Project {
	private Object _name;
	private Object _theResources;
	private Object _theEmployees;
	private Object _theWorkBreakdownStructure;
	public Vector<Resource> _unnamed_Resource_ = new Vector<Resource>();
	public Vector<Employee> _unnamed_Employee_ = new Vector<Employee>();
	public WorkBreakdownStructure _unnamed_WorkBreakdownStructure_;

	public Project() {
		throw new UnsupportedOperationException();
	}

	public Object getName() {
		return this._name;
	}

	public void setName(Object aName) {
		this._name = aName;
	}

	public Object getTheResources() {
		return this._theResources;
	}

	public void setTheResources(Object aTheResources) {
		this._theResources = aTheResources;
	}

	public Object getTheEmployees() {
		return this._theEmployees;
	}

	public void setTheEmployees(Object aTheEmployees) {
		this._theEmployees = aTheEmployees;
	}

	public Object getTheWorkBreakdownStructure() {
		return this._theWorkBreakdownStructure;
	}

	public void setTheWorkBreakdownStructure(Object aTheWorkBreakdownStructure) {
		this._theWorkBreakdownStructure = aTheWorkBreakdownStructure;
	}
}