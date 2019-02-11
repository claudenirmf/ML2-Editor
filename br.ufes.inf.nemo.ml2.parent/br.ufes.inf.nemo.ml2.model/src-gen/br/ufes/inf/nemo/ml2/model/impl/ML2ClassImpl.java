/**
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.CategorizationType;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.ML2Class;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.Reference;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl#getSubordinators <em>Subordinators</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl#getPowertypeOf <em>Powertype Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl#getCategorizedClass <em>Categorized Class</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl#getCategorizationType <em>Categorization Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ML2ClassImpl extends EntityDeclarationImpl implements ML2Class {
	/**
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ML2Class> superClasses;

	/**
	 * The cached value of the '{@link #getSubordinators() <em>Subordinators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubordinators()
	 * @generated
	 * @ordered
	 */
	protected EList<ML2Class> subordinators;

	/**
	 * The cached value of the '{@link #getPowertypeOf() <em>Powertype Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeOf()
	 * @generated
	 * @ordered
	 */
	protected ML2Class powertypeOf;

	/**
	 * The cached value of the '{@link #getCategorizedClass() <em>Categorized Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedClass()
	 * @generated
	 * @ordered
	 */
	protected ML2Class categorizedClass;

	/**
	 * The default value of the '{@link #getCategorizationType() <em>Categorization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizationType()
	 * @generated
	 * @ordered
	 */
	protected static final CategorizationType CATEGORIZATION_TYPE_EDEFAULT = CategorizationType.CATEGORIZER;

	/**
	 * The cached value of the '{@link #getCategorizationType() <em>Categorization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizationType()
	 * @generated
	 * @ordered
	 */
	protected CategorizationType categorizationType = CATEGORIZATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ML2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ML2_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ML2Class> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectResolvingEList<ML2Class>(ML2Class.class, this, ModelPackage.ML2_CLASS__SUPER_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ML2Class> getSubordinators() {
		if (subordinators == null) {
			subordinators = new EObjectResolvingEList<ML2Class>(ML2Class.class, this, ModelPackage.ML2_CLASS__SUBORDINATORS);
		}
		return subordinators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ML2Class getPowertypeOf() {
		if (powertypeOf != null && powertypeOf.eIsProxy()) {
			InternalEObject oldPowertypeOf = (InternalEObject)powertypeOf;
			powertypeOf = (ML2Class)eResolveProxy(oldPowertypeOf);
			if (powertypeOf != oldPowertypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ML2_CLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
			}
		}
		return powertypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Class basicGetPowertypeOf() {
		return powertypeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowertypeOf(ML2Class newPowertypeOf) {
		ML2Class oldPowertypeOf = powertypeOf;
		powertypeOf = newPowertypeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ML2_CLASS__POWERTYPE_OF, oldPowertypeOf, powertypeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ML2Class getCategorizedClass() {
		if (categorizedClass != null && categorizedClass.eIsProxy()) {
			InternalEObject oldCategorizedClass = (InternalEObject)categorizedClass;
			categorizedClass = (ML2Class)eResolveProxy(oldCategorizedClass);
			if (categorizedClass != oldCategorizedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ML2_CLASS__CATEGORIZED_CLASS, oldCategorizedClass, categorizedClass));
			}
		}
		return categorizedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Class basicGetCategorizedClass() {
		return categorizedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategorizedClass(ML2Class newCategorizedClass) {
		ML2Class oldCategorizedClass = categorizedClass;
		categorizedClass = newCategorizedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ML2_CLASS__CATEGORIZED_CLASS, oldCategorizedClass, categorizedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategorizationType getCategorizationType() {
		return categorizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategorizationType(CategorizationType newCategorizationType) {
		CategorizationType oldCategorizationType = categorizationType;
		categorizationType = newCategorizationType == null ? CATEGORIZATION_TYPE_EDEFAULT : newCategorizationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ML2_CLASS__CATEGORIZATION_TYPE, oldCategorizationType, categorizationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, ModelPackage.ML2_CLASS__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		final BasicEList<Attribute> l = new BasicEList<Attribute>();
		final Consumer<Feature> _function = new Consumer<Feature>() {
			public void accept(final Feature it) {
				if ((it instanceof Attribute)) {
					l.add(((Attribute)it));
				}
			}
		};
		this.getFeatures().forEach(_function);
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReferences() {
		final BasicEList<Reference> l = new BasicEList<Reference>();
		final Consumer<Feature> _function = new Consumer<Feature>() {
			public void accept(final Feature it) {
				if ((it instanceof Reference)) {
					l.add(((Reference)it));
				}
			}
		};
		this.getFeatures().forEach(_function);
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ML2_CLASS__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ML2_CLASS__SUPER_CLASSES:
				return getSuperClasses();
			case ModelPackage.ML2_CLASS__SUBORDINATORS:
				return getSubordinators();
			case ModelPackage.ML2_CLASS__POWERTYPE_OF:
				if (resolve) return getPowertypeOf();
				return basicGetPowertypeOf();
			case ModelPackage.ML2_CLASS__CATEGORIZED_CLASS:
				if (resolve) return getCategorizedClass();
				return basicGetCategorizedClass();
			case ModelPackage.ML2_CLASS__CATEGORIZATION_TYPE:
				return getCategorizationType();
			case ModelPackage.ML2_CLASS__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ML2_CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends ML2Class>)newValue);
				return;
			case ModelPackage.ML2_CLASS__SUBORDINATORS:
				getSubordinators().clear();
				getSubordinators().addAll((Collection<? extends ML2Class>)newValue);
				return;
			case ModelPackage.ML2_CLASS__POWERTYPE_OF:
				setPowertypeOf((ML2Class)newValue);
				return;
			case ModelPackage.ML2_CLASS__CATEGORIZED_CLASS:
				setCategorizedClass((ML2Class)newValue);
				return;
			case ModelPackage.ML2_CLASS__CATEGORIZATION_TYPE:
				setCategorizationType((CategorizationType)newValue);
				return;
			case ModelPackage.ML2_CLASS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ML2_CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case ModelPackage.ML2_CLASS__SUBORDINATORS:
				getSubordinators().clear();
				return;
			case ModelPackage.ML2_CLASS__POWERTYPE_OF:
				setPowertypeOf((ML2Class)null);
				return;
			case ModelPackage.ML2_CLASS__CATEGORIZED_CLASS:
				setCategorizedClass((ML2Class)null);
				return;
			case ModelPackage.ML2_CLASS__CATEGORIZATION_TYPE:
				setCategorizationType(CATEGORIZATION_TYPE_EDEFAULT);
				return;
			case ModelPackage.ML2_CLASS__FEATURES:
				getFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ML2_CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case ModelPackage.ML2_CLASS__SUBORDINATORS:
				return subordinators != null && !subordinators.isEmpty();
			case ModelPackage.ML2_CLASS__POWERTYPE_OF:
				return powertypeOf != null;
			case ModelPackage.ML2_CLASS__CATEGORIZED_CLASS:
				return categorizedClass != null;
			case ModelPackage.ML2_CLASS__CATEGORIZATION_TYPE:
				return categorizationType != CATEGORIZATION_TYPE_EDEFAULT;
			case ModelPackage.ML2_CLASS__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.ML2_CLASS___GET_ATTRIBUTES:
				return getAttributes();
			case ModelPackage.ML2_CLASS___GET_REFERENCES:
				return getReferences();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (categorizationType: ");
		result.append(categorizationType);
		result.append(')');
		return result.toString();
	}

} //ML2ClassImpl
