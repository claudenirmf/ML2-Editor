package br.ufes.inf.nemo.ml2.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings("all")
public abstract class ValidationIssue {
  public final static int NO_INDEX = (-1);
  
  public final static String[] NO_ISSUE_CODE = null;
  
  private String message;
  
  private EStructuralFeature feature;
  
  private int index;
  
  private String code;
  
  private String[] issueData;
  
  private EObject source;
  
  public ValidationIssue() {
    this.message = null;
    this.feature = null;
    this.index = (-1);
    this.code = null;
    this.issueData = null;
    this.source = null;
  }
  
  public ValidationIssue(final String message, final EStructuralFeature feature, final int index, final String code, final String[] issueData, final EObject source) {
    this.message = message;
    this.feature = feature;
    this.index = index;
    this.code = code;
    this.issueData = issueData;
    this.source = source;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(final String message) {
    this.message = message;
  }
  
  public EStructuralFeature getFeature() {
    return this.feature;
  }
  
  public void setFeature(final EStructuralFeature feature) {
    this.feature = feature;
  }
  
  public int getIndex() {
    return this.index;
  }
  
  public void setIndex(final int index) {
    this.index = index;
  }
  
  public String getCode() {
    return this.code;
  }
  
  public void setCode(final String code) {
    this.code = code;
  }
  
  public String[] getIssueData() {
    return this.issueData;
  }
  
  public void setIssueData(final String[] issueData) {
    this.issueData = issueData;
  }
  
  public EObject getSource() {
    return this.source;
  }
  
  public void setSource(final EObject source) {
    this.source = source;
  }
}
