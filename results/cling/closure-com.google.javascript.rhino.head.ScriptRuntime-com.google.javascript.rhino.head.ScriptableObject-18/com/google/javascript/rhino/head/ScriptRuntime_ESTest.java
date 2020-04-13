/*

 * Tue Mar 03 20:01:56 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaScriptException;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaConstructor;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Ref;
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
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptRuntime.setConst((Scriptable) null, "", context0, "Dalvik");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptRuntime.setObjectProp((Object) nativeIterator_StopIteration0, "", (Object) nativeIterator_StopIteration0, (Context) null);
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) topLevel0, class0, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeJavaConstructor\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = ScriptRuntime.testUint32String("a");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.strictSetName(scriptable0, scriptable0, context0, scriptable0, "z&-q'D0{X+T}$");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        ScriptRuntime.getArrayElements(baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScriptRuntime.isSpecialProperty("r~N|Q>ii6}dR");
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, false, false);
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
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.nameIncrDecr(scriptable0, "", (-2072));
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
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      boolean boolean0 = ScriptRuntime.eqNumber(4.9E-324, scriptable0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        ScriptRuntime.cmp_LT(nativeIterator_StopIteration0, nativeIterator_StopIteration0.DONTENUM);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("x");
      assertEquals("x", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeString nativeString0 = new NativeString("language version");
      Delegator delegator0 = new Delegator(nativeString0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(delegator0).when(scriptable0).getParentScope();
      doReturn(delegator0).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.bind(context0, scriptable0, "error reporter");
      assertNull(scriptable1);
      assertTrue(nativeString0.isExtensible());
      assertTrue(nativeString0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeString nativeString0 = new NativeString("language version");
      Delegator delegator0 = new Delegator(nativeString0);
      Scriptable scriptable0 = ScriptRuntime.bind(context0, delegator0, "error reporter");
      assertNull(scriptable0);
      assertTrue(nativeString0.isExtensible());
      assertTrue(nativeString0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeGenerator.init(baseFunction0, true);
      JavaScriptException javaScriptException0 = new JavaScriptException(baseFunction0);
      Context context0 = new Context();
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
  public void test14()  throws Throwable  {
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context0, (-3384));
      assertNotNull(object0);
      assertEquals(1.0, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        ScriptRuntime.getObjectProp((Object) baseFunction0, "Dalvik", context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Long long0 = new Long((-2910L));
      Object object0 = ScriptRuntime.toPrimitive((Object) long0);
      assertEquals((-2910L), object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        ScriptRuntime.getGlobal(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }
}
