/*

 * Tue Mar 03 19:04:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(4);
      int int0 = nativeArray0.size();
      assertTrue(nativeArray0.isExtensible());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1152));
      nativeArray0.toArray();
      NativeGenerator.init(nativeArray0, false);
      assertEquals((-1152L), nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
      assertEquals((-1152L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      assertFalse(importerTopLevel0.isSealed());
      
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(importerTopLevel0, importerTopLevel0, 0);
      assertTrue(scriptableObject0.isExtensible());
      assertTrue(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Float float0 = new Float((double) 130);
      NativeError nativeError0 = new NativeError();
      ScriptableObject.buildDataDescriptor(nativeError0, float0, 5);
      assertTrue(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-1911460416));
      NativeArray nativeArray0 = new NativeArray(150);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.get((-1152));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(4);
      // Undeclared exception!
      try { 
        nativeArray0.get((long) 12);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2276L);
      LinkedList<NativeJavaMethod> linkedList0 = new LinkedList<NativeJavaMethod>();
      nativeArray0.containsAll(linkedList0);
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaTopPackage
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptableObject scriptableObject0 = mock(ScriptableObject.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptableObject0).associateValue(any() , any());
      doReturn((Object) null).when(scriptableObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptableObject0).getParentScope();
      doReturn((String) null, (String) null).when(scriptableObject0).toString();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeGenerator0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(150);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
