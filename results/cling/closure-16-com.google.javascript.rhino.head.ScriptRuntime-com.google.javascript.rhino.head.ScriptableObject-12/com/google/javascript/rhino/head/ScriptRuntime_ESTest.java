/*

 * Tue Mar 03 20:02:45 GMT 2020
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
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, true);
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = mock(ContextFactory.class, new ViolatedAssumptionAnswer());
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectProp((Object) nativeGenerator0, "Dalvik", (Object) nativeArray0, context0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Dalvik.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = ScriptRuntime.testUint32String("=Ni]yT,PMVH");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.getObjectIndex((Object) importerTopLevel0, 0.0, context0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ImporterTopLevel importerTopLevel1 = (ImporterTopLevel)ScriptRuntime.setConst(importerTopLevel0, importerTopLevel0, context1, "l;9[- (o&?-ttma9");
      assertFalse(importerTopLevel1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, false, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.FunctionObject\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(importerTopLevel0, true);
      // Undeclared exception!
      try { 
        ScriptRuntime.toPrimitive((Object) nativeGenerator0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharSequence charSequence0 = ScriptRuntime.toCharSequence((Object) null);
      assertEquals("null", charSequence0);
      assertNotNull(charSequence0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
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

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = ScriptRuntime.enumInit((Object) null, (Context) null, 250);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("language version");
      assertEquals("language version", object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("$k' F").when(context0).toString();
      String string0 = ScriptRuntime.toStringIdOrIndex(context0, context0);
      assertEquals("$k' F", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = ScriptRuntime.toUint32((Object) null);
      assertEquals(0L, long0);
      
      boolean boolean0 = ScriptRuntime.eq((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = ScriptRuntime.toUint32((Object) null);
      assertEquals(0L, long0);
      
      String string0 = ScriptRuntime.makeUrlForGeneratedScript(true, (String) null, 88);
      assertEquals("null#88(eval)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.setObjectElem((Scriptable) importerTopLevel0, (Object) null, (Object) nativeObject0, context0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.defaultObjectToSource(context1, nativeObject0, importerTopLevel0, (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptRuntime.getGlobal(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(23);
      Class<TopLevel> class0 = TopLevel.class;
      // Undeclared exception!
      try { 
        ScriptRuntime.toObject(scriptable0, (Object) integer0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "OpenJDK 64-Bit Server VM";
      Object object0 = ScriptRuntime.toPrimitive((Object) string0);
      assertEquals("OpenJDK 64-Bit Server VM", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      doReturn((Scriptable) null).when(context0).newArray(any(com.google.javascript.rhino.head.Scriptable.class) , anyInt());
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.enumInit((Object) scriptableObject0, context1, false);
      Context context2 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.add(object0, (Object) null, context2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
