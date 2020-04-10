/*

 * Tue Mar 03 19:12:00 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(470L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray.init(nativeObject0, true);
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.get((-2058L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1260L));
      int int0 = nativeArray0.size();
      assertEquals((-1260), int0);
      
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeArray0, (-913));
      assertNotNull(object0);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray.init(nativeObject0, true);
      NativeArray nativeArray0 = new NativeArray(0);
      int int0 = nativeArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeArray.getLengthProperty(context0, scriptable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.RegExp;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, baseFunction0);
      assertNull(scriptableObject0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.get(1701, (Scriptable) null);
      // Undeclared exception!
      try { 
        nativeArray0.toArray((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter((Context) null);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(importerTopLevel0, importerTopLevel0, 455);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1260L));
      nativeArray0.size();
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1260L));
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.contains(nativeObject0);
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(253L);
      nativeArray0.lastIndexOf((Object) null);
      EcmaError ecmaError0 = null;
      try {
        ecmaError0 = new EcmaError(nativeArray0, "Hpjh56E@Z7xV>", 18, 80, "Hpjh56E@Z7xV>");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2961L);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(2961, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2992);
      nativeArray0.get(0);
      NativeArray.init(nativeArray0, true);
      assertEquals("Array", nativeArray0.getClassName());
  }
}
