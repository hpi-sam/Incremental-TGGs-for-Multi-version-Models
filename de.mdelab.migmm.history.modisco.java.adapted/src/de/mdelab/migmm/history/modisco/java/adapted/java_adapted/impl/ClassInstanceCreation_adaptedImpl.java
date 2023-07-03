/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_argumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_methodItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_typeArgumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_anonymousClassDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance Creation adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adaptedImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adaptedImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adaptedImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adaptedImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adaptedImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adaptedImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassInstanceCreation_adaptedImpl extends Expression_adaptedImpl implements ClassInstanceCreation_adapted {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation_adapted_methodItem> method;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation_adapted_argumentsItem> arguments;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation_adapted_typeArgumentsItem> typeArguments;

	/**
	 * The cached value of the '{@link #getAnonymousClassDeclaration() <em>Anonymous Class Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassInstanceCreation_adapted_anonymousClassDeclarationItem> anonymousClassDeclaration;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassInstanceCreation_adapted_expressionItem> expression;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassInstanceCreation_adapted_typeItem> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInstanceCreation_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getClassInstanceCreation_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation_adapted_methodItem> getMethod() {
		if (method == null) {
			method = new EObjectResolvingEList<AbstractMethodInvocation_adapted_methodItem>(AbstractMethodInvocation_adapted_methodItem.class, this, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation_adapted_argumentsItem> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<AbstractMethodInvocation_adapted_argumentsItem>(AbstractMethodInvocation_adapted_argumentsItem.class, this, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation_adapted_typeArgumentsItem> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectResolvingEList<AbstractMethodInvocation_adapted_typeArgumentsItem>(AbstractMethodInvocation_adapted_typeArgumentsItem.class, this, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassInstanceCreation_adapted_anonymousClassDeclarationItem> getAnonymousClassDeclaration() {
		if (anonymousClassDeclaration == null) {
			anonymousClassDeclaration = new EObjectResolvingEList<ClassInstanceCreation_adapted_anonymousClassDeclarationItem>(ClassInstanceCreation_adapted_anonymousClassDeclarationItem.class, this, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION);
		}
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassInstanceCreation_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<ClassInstanceCreation_adapted_expressionItem>(ClassInstanceCreation_adapted_expressionItem.class, this, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassInstanceCreation_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<ClassInstanceCreation_adapted_typeItem>(ClassInstanceCreation_adapted_typeItem.class, this, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD:
				return getMethod();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS:
				return getArguments();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS:
				return getTypeArguments();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__EXPRESSION:
				return getExpression();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE:
				return getType();
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
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends AbstractMethodInvocation_adapted_methodItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends AbstractMethodInvocation_adapted_argumentsItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends AbstractMethodInvocation_adapted_typeArgumentsItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				getAnonymousClassDeclaration().clear();
				getAnonymousClassDeclaration().addAll((Collection<? extends ClassInstanceCreation_adapted_anonymousClassDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends ClassInstanceCreation_adapted_expressionItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ClassInstanceCreation_adapted_typeItem>)newValue);
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
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD:
				getMethod().clear();
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS:
				getArguments().clear();
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				getAnonymousClassDeclaration().clear();
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__EXPRESSION:
				getExpression().clear();
				return;
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE:
				getType().clear();
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
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD:
				return method != null && !method.isEmpty();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				return anonymousClassDeclaration != null && !anonymousClassDeclaration.isEmpty();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation_adapted.class) {
			switch (derivedFeatureID) {
				case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD: return Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__METHOD;
				case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS: return Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__ARGUMENTS;
				case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS: return Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation_adapted.class) {
			switch (baseFeatureID) {
				case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__METHOD: return Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__METHOD;
				case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__ARGUMENTS: return Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__ARGUMENTS;
				case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__TYPE_ARGUMENTS: return Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ClassInstanceCreation_adaptedImpl
