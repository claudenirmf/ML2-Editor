/**
 */
package br.ufes.inf.nemo.ml2.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML2 Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Number#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Number()
 * @model
 * @generated
 */
public interface ML2Number extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Number_Value()
	 * @model unique="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.ML2Number#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" objUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((obj instanceof <%br.ufes.inf.nemo.ml2.meta.ML2Number%>))\n{\n\tdouble _value = this.getValue();\n\tdouble _value_1 = ((<%br.ufes.inf.nemo.ml2.meta.ML2Number%>)obj).getValue();\n\treturn (_value == _value_1);\n}\nelse\n{\n\treturn super.equals(obj);\n}'"
	 * @generated
	 */
	boolean equals(Object obj);

} // ML2Number
