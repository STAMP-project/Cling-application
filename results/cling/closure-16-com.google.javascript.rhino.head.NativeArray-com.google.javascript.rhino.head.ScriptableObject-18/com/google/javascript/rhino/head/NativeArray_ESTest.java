/*

 * Tue Mar 03 19:10:38 GMT 2020
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
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaMethod;
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
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.get(3272);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-8878612607581929669L));
      ScriptableObject.getClassPrototype(nativeArray0, "C\"NTN$m=");
      // Undeclared exception!
      try { 
        nativeArray0.get((-316522074587315140L));
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
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(323L);
      assertFalse(nativeArray0.isSealed());
      
      Class<NativeContinuation> class0 = NativeContinuation.class;
      ScriptableObject.buildClassCtor((Scriptable) null, class0, false, false);
      boolean boolean0 = nativeArray0.contains((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1293L);
      nativeArray0.toArray();
      // Undeclared exception!
      try { 
        nativeArray0.get(10000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      int int0 = nativeArray0.size();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(304L);
      nativeArray0.equivalentValues(nativeArray0.READONLY);
      assertEquals(304L, nativeArray0.getLength());
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) nativeJavaTopPackage0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.contains((Object) null);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[0];
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod(memberBoxArray0, "{(1");
      NativeArray nativeArray0 = new NativeArray(4);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeJavaMethod0, false);
      assertTrue(nativeJavaMethod0.isEmpty());
      
      int int0 = nativeArray0.indexOf(contextFactory0);
      assertEquals((-1), int0);
      assertEquals(4L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(175L);
      Object[] objectArray0 = new Object[9];
      nativeArray0.toArray(objectArray0);
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.ImporterTopLevel
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(323L);
      Class<NativeContinuation> class0 = NativeContinuation.class;
      ScriptableObject.buildClassCtor((Scriptable) null, class0, false, false);
      nativeArray0.toArray();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeArray0, (Class<?>) class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(13, nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, nativeArray0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray.init(nativeArray0, true);
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("4(3}o#K~=mY0m!qX", classLoader0);
      nativeArray0.indexOf(nativeJavaPackage0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeArray.init(scriptable0, true);
      NativeArray nativeArray0 = new NativeArray(1293L);
      Object[] objectArray0 = nativeArray0.toArray();
      assertEquals(1293, objectArray0.length);
  }
}
