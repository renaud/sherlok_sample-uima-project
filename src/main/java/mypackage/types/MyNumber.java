

/* First created by JCasGen Wed Mar 04 10:11:31 CET 2015 */
package mypackage.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** TODO
 * Updated by JCasGen Wed Mar 04 10:11:31 CET 2015
 * XML source: /Volumes/HDD2/ren_data/dev_hdd/uima/sherlok/sherlok_sample-uima-project/target/jcasgen/typesystem.xml
 * @generated */
public class MyNumber extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MyNumber.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MyNumber() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MyNumber(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MyNumber(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MyNumber(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets TODO
   * @generated
   * @return value of the feature 
   */
  public float getValue() {
    if (MyNumber_Type.featOkTst && ((MyNumber_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "mypackage.types.MyNumber");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((MyNumber_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets TODO 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(float v) {
    if (MyNumber_Type.featOkTst && ((MyNumber_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "mypackage.types.MyNumber");
    jcasType.ll_cas.ll_setFloatValue(addr, ((MyNumber_Type)jcasType).casFeatCode_value, v);}    
  }

    