/*

 * Tue Mar 03 18:56:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
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
      NativeArray nativeArray0 = new NativeArray(6L);
      nativeArray0.delete(0);
      assertEquals(6L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(719L);
      NativeArray.setMaximumInitialCapacity(0);
      NativeArray nativeArray1 = new NativeArray(4);
      Context context0 = Context.enter();
      nativeArray1.defineOwnProperty(context0, (Object) null, nativeArray0);
      assertEquals(4L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.delete(2273);
      assertEquals(2147483647L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        importerTopLevel0.getAttributes("_Nbt@5EP!5\")&");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property _Nbt@5EP!5\")& not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) null);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(6L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6L);
      nativeArray0.delete(31);
      NativeArray.init(nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(6L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1847);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(876);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 876 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4057L);
      NativeArray.init(nativeArray0, false);
      Object[] objectArray0 = nativeArray0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("VcABnk<6l*<cP", "VcABnk<6l*<cP").when(context0).toString();
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeArray0, false);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(876);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 876 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(28L);
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaTopPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, importerTopLevel0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(12L);
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "&'7", classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeJavaPackage0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray.init(baseFunction0, true);
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(4, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(28L);
      nativeArray0.delete((-2211));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(12L);
      NativeCall nativeCall0 = new NativeCall();
      nativeArray0.put(12, (Scriptable) nativeCall0, (Object) nativeCall0);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(436);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 436
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }
}
