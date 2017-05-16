/**
 */
package br.ufes.inf.nemo.ml2.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML2 String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2String#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2String()
 * @model
 * @generated
 */
public interface ML2String extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2String_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.ML2String#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" objUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((obj instanceof <%br.ufes.inf.nemo.ml2.meta.ML2String%>))\n{\n\t<%java.lang.String%> _value = this.getValue();\n\t<%java.lang.String%> _value_1 = ((<%br.ufes.inf.nemo.ml2.meta.ML2String%>)obj).getValue();\n\treturn <%com.google.common.base.Objects%>.equal(_value, _value_1);\n}\nelse\n{\n\treturn super.equals(obj);\n}'"
	 * @generated
	 */
	boolean equals(Object obj);

} // ML2String
