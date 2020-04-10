/*

 * Tue Mar 03 18:40:09 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProxyObjectType_ESTest extends ProxyObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, objectType0);
      boolean boolean0 = indexedType0.isGlobalThisType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_PROTOTYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      boolean boolean0 = jSType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSType jSType0 = mock(JSType.class, new ViolatedAssumptionAnswer());
      ProxyObjectType proxyObjectType0 = new ProxyObjectType((JSTypeRegistry) null, jSType0);
      boolean boolean0 = proxyObjectType0.hasDisplayName();
      assertFalse(boolean0);
  }
}
