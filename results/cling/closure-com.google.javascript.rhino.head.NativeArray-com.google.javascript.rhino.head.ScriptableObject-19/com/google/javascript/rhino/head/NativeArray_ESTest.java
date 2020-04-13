/*

 * Tue Mar 03 19:08:38 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(150L);
      boolean boolean0 = nativeArray0.contains((Object) null);
      assertTrue(boolean0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray.init(importerTopLevel0, false);
      NativeArray nativeArray0 = new NativeArray(0);
      // Undeclared exception!
      try { 
        nativeArray0.get((-959));
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
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.size();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Float float0 = new Float((double) 140);
      nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) nativeArray0, true);
      assertEquals(141L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, importerTopLevel0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Class<NativeWith> class0 = NativeWith.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, false, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeWith\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(844L);
      Object[] objectArray0 = new Object[9];
      boolean boolean0 = nativeArray0.isGetterOrSetter("JavaPackage", 1676, true);
      assertFalse(boolean0);
      
      Object[] objectArray1 = nativeArray0.toArray(objectArray0);
      assertEquals(844, objectArray1.length);
      assertEquals(844L, nativeArray0.jsGet_length());
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeGenerator.init(nativeBoolean0, true);
      NativeArray nativeArray0 = new NativeArray(8);
      // Undeclared exception!
      try { 
        nativeArray0.get(843L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-229));
      Class<NativeObject> class0 = NativeObject.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeObject
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2219L));
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) nativeArray0;
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.containsAll(nativeArray1);
      assertFalse(boolean0);
      assertTrue(nativeArray1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.getIds();
      nativeArray0.toArray(objectArray1);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Float float0 = new Float((double) 140);
      nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) nativeArray0, true);
      assertEquals(141L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.get(0);
      NativeArray.init(nativeArray0, true);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      assertFalse(importerTopLevel0.isSealed());
      
      context0.initStandardObjects((ScriptableObject) importerTopLevel0, true);
      NativeArray nativeArray0 = new NativeArray(1655L);
      nativeArray0.get(1497L);
      assertEquals(1655L, nativeArray0.jsGet_length());
  }
}
