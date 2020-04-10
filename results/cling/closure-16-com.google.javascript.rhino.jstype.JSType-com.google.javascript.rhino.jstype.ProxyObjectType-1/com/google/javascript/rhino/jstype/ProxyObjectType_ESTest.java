/*

 * Tue Mar 03 18:36:31 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProxyObjectType_ESTest extends ProxyObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      TemplateType templateType0 = new TemplateType(jSTypeRegistry0, "");
      JSTypeRegistry jSTypeRegistry1 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn(templateType0).when(jSTypeRegistry1).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry1, templateType0);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Unknown class name", (ObjectType) null);
      JSType jSType0 = proxyObjectType0.resolveInternal(simpleErrorReporter0, prototypeObjectType0);
      boolean boolean0 = jSType0.isGlobalThisType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      JSType jSType0 = mock(JSType.class, new ViolatedAssumptionAnswer());
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, jSType0);
      boolean boolean0 = proxyObjectType0.isGlobalThisType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectType) null).when(jSTypeRegistry0).getNativeObjectType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "Unknown class name", (ObjectType) null);
      boolean boolean0 = prototypeObjectType0.hasDisplayName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      TemplateType templateType0 = JSType.toMaybeTemplateType((JSType) null);
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, templateType0);
      boolean boolean0 = proxyObjectType0.hasDisplayName();
      assertFalse(boolean0);
  }
}
