/**
 */
package br.ufes.inf.nemo.ml2.meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML2 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getPowertypeOf <em>Powertype Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getCategorizedClass <em>Categorized Class</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getCategorizationType <em>Categorization Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class()
 * @model abstract="true"
 * @generated
 */
public interface ML2Class extends EntityDeclaration {
	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.ML2Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class_SuperClasses()
	 * @model
	 * @generated
	 */
	EList<ML2Class> getSuperClasses();

	/**
	 * Returns the value of the '<em><b>Subordinators</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.ML2Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subordinators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subordinators</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class_Subordinators()
	 * @model
	 * @generated
	 */
	EList<ML2Class> getSubordinators();

	/**
	 * Returns the value of the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Of</em>' reference.
	 * @see #setPowertypeOf(ML2Class)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class_PowertypeOf()
	 * @model
	 * @generated
	 */
	ML2Class getPowertypeOf();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getPowertypeOf <em>Powertype Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype Of</em>' reference.
	 * @see #getPowertypeOf()
	 * @generated
	 */
	void setPowertypeOf(ML2Class value);

	/**
	 * Returns the value of the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Class</em>' reference.
	 * @see #setCategorizedClass(ML2Class)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class_CategorizedClass()
	 * @model
	 * @generated
	 */
	ML2Class getCategorizedClass();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getCategorizedClass <em>Categorized Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorized Class</em>' reference.
	 * @see #getCategorizedClass()
	 * @generated
	 */
	void setCategorizedClass(ML2Class value);

	/**
	 * Returns the value of the '<em><b>Categorization Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.ml2.meta.CategorizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorization Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorization Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ml2.meta.CategorizationType
	 * @see #setCategorizationType(CategorizationType)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class_CategorizationType()
	 * @model unique="false"
	 * @generated
	 */
	CategorizationType getCategorizationType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.ML2Class#getCategorizationType <em>Categorization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorization Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ml2.meta.CategorizationType
	 * @see #getCategorizationType()
	 * @generated
	 */
	void setCategorizationType(CategorizationType value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getML2Class_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%br.ufes.inf.nemo.ml2.meta.Attribute%>> l = new <%org.eclipse.emf.common.util.BasicEList%><<%br.ufes.inf.nemo.ml2.meta.Attribute%>>();\n<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ml2.meta.Feature%>> _features = this.getFeatures();\nfinal <%java.util.function.Consumer%><<%br.ufes.inf.nemo.ml2.meta.Feature%>> _function = new <%java.util.function.Consumer%><<%br.ufes.inf.nemo.ml2.meta.Feature%>>()\n{\n\tpublic void accept(final <%br.ufes.inf.nemo.ml2.meta.Feature%> it)\n\t{\n\t\tif ((it instanceof <%br.ufes.inf.nemo.ml2.meta.Attribute%>))\n\t\t{\n\t\t\tl.add(((<%br.ufes.inf.nemo.ml2.meta.Attribute%>)it));\n\t\t}\n\t}\n};\n_features.forEach(_function);\nreturn l;'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%br.ufes.inf.nemo.ml2.meta.Reference%>> l = new <%org.eclipse.emf.common.util.BasicEList%><<%br.ufes.inf.nemo.ml2.meta.Reference%>>();\n<%org.eclipse.emf.common.util.EList%><<%br.ufes.inf.nemo.ml2.meta.Feature%>> _features = this.getFeatures();\nfinal <%java.util.function.Consumer%><<%br.ufes.inf.nemo.ml2.meta.Feature%>> _function = new <%java.util.function.Consumer%><<%br.ufes.inf.nemo.ml2.meta.Feature%>>()\n{\n\tpublic void accept(final <%br.ufes.inf.nemo.ml2.meta.Feature%> it)\n\t{\n\t\tif ((it instanceof <%br.ufes.inf.nemo.ml2.meta.Reference%>))\n\t\t{\n\t\t\tl.add(((<%br.ufes.inf.nemo.ml2.meta.Reference%>)it));\n\t\t}\n\t}\n};\n_features.forEach(_function);\nreturn l;'"
	 * @generated
	 */
	EList<Reference> getReferences();

} // ML2Class
