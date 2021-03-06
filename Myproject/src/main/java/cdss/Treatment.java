package cdss;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Treatment")
public class Treatment implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("Date")
	@org.kie.api.definition.type.Position(1)
	private java.util.Date date;

    @org.kie.api.definition.type.Label("Name")
	@org.kie.api.definition.type.Position(0)
	private java.lang.String name;

    @org.kie.api.definition.type.Label(value = "Dr agreement")
	@org.kie.api.definition.type.Position(value = 2)
	private java.lang.Boolean drAgreement;

	public java.util.Date getDate() {
        return this.date;
    }
    
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public java.lang.String getName() {
        return this.name;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }

	public java.lang.Boolean getDrAgreement() {
		return this.drAgreement;
	}

	public void setDrAgreement(java.lang.Boolean drAgreement) {
		this.drAgreement = drAgreement;
	}

	public Treatment() {
	}

	public Treatment(java.lang.String name, java.util.Date date,
			java.lang.Boolean drAgreement) {
		this.name = name;
		this.date = date;
		this.drAgreement = drAgreement;
	}

}