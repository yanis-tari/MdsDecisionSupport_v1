package cdss;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "Vital parameter measurement")
public class VitalParameterMeasurement implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;

    public VitalParameterMeasurement() {
    }
    
    public VitalParameterMeasurement(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return this.name;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }

}