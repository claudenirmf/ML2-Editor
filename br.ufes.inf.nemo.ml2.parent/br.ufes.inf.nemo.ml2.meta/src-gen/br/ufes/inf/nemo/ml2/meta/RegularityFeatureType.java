/**
 */
package br.ufes.inf.nemo.ml2.meta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regularity Feature Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getRegularityFeatureType()
 * @model
 * @generated
 */
public enum RegularityFeatureType implements Enumerator {
	/**
	 * The '<em><b>DETERMINES MAX VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_MAX_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINES_MAX_VALUE(0, "DETERMINES_MAX_VALUE", "determinesMaxValue"),

	/**
	 * The '<em><b>DETERMINES MIN VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_MIN_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINES_MIN_VALUE(0, "DETERMINES_MIN_VALUE", "determinesMinValue"),

	/**
	 * The '<em><b>DETERMINES VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINES_VALUE(0, "DETERMINES_VALUE", "determinesValue"),

	/**
	 * The '<em><b>DETERMINES ALLOWED VALUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_ALLOWED_VALUES_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINES_ALLOWED_VALUES(0, "DETERMINES_ALLOWED_VALUES", "determinesAllowedValues"),

	/**
	 * The '<em><b>DETERMINES TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINES_TYPE(0, "DETERMINES_TYPE", "determinesType"),

	/**
	 * The '<em><b>DETERMINES ALLOWED TYPES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_ALLOWED_TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	DETERMINES_ALLOWED_TYPES(0, "DETERMINES_ALLOWED_TYPES", "determinesAllowedTypes");

	/**
	 * The '<em><b>DETERMINES MAX VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINES MAX VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_MAX_VALUE
	 * @model literal="determinesMaxValue"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINES_MAX_VALUE_VALUE = 0;

	/**
	 * The '<em><b>DETERMINES MIN VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINES MIN VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_MIN_VALUE
	 * @model literal="determinesMinValue"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINES_MIN_VALUE_VALUE = 0;

	/**
	 * The '<em><b>DETERMINES VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINES VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_VALUE
	 * @model literal="determinesValue"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINES_VALUE_VALUE = 0;

	/**
	 * The '<em><b>DETERMINES ALLOWED VALUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINES ALLOWED VALUES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_ALLOWED_VALUES
	 * @model literal="determinesAllowedValues"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINES_ALLOWED_VALUES_VALUE = 0;

	/**
	 * The '<em><b>DETERMINES TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINES TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_TYPE
	 * @model literal="determinesType"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINES_TYPE_VALUE = 0;

	/**
	 * The '<em><b>DETERMINES ALLOWED TYPES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETERMINES ALLOWED TYPES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETERMINES_ALLOWED_TYPES
	 * @model literal="determinesAllowedTypes"
	 * @generated
	 * @ordered
	 */
	public static final int DETERMINES_ALLOWED_TYPES_VALUE = 0;

	/**
	 * An array of all the '<em><b>Regularity Feature Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegularityFeatureType[] VALUES_ARRAY =
		new RegularityFeatureType[] {
			DETERMINES_MAX_VALUE,
			DETERMINES_MIN_VALUE,
			DETERMINES_VALUE,
			DETERMINES_ALLOWED_VALUES,
			DETERMINES_TYPE,
			DETERMINES_ALLOWED_TYPES,
		};

	/**
	 * A public read-only list of all the '<em><b>Regularity Feature Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegularityFeatureType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Regularity Feature Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegularityFeatureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegularityFeatureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regularity Feature Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegularityFeatureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegularityFeatureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regularity Feature Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegularityFeatureType get(int value) {
		switch (value) {
			case DETERMINES_MAX_VALUE_VALUE: return DETERMINES_MAX_VALUE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RegularityFeatureType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RegularityFeatureType
