/*

 * Tue Mar 03 20:07:09 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Ref;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.tools.shell.Global;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Boolean boolean0 = Boolean.FALSE;
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setConst(scriptable0, boolean0, context0, "msg.ctor.multiple.parms");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<NativeIterator> class0 = NativeIterator.class;
      boolean boolean0 = ScriptRuntime.isRhinoRuntimeType(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      Object object0 = ScriptRuntime.getObjectIndex((Scriptable) baseFunction0, 210, context0);
      assertNotNull(object0);
      
      Float float0 = new Float((double) 4);
      int int0 = ScriptRuntime.toInt32((Object) float0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, true, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeJavaPackage\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(callable0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(callable0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn("bG*").when(scriptable0).toString();
      Object object0 = ScriptRuntime.getObjectPropNoWarn(scriptable0, "", context0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Boolean boolean0 = ScriptRuntime.wrapBoolean(false);
      CharSequence charSequence0 = ScriptRuntime.add((Object) boolean0, (CharSequence) "error reporter");
      assertEquals(19, charSequence0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Synchronizer synchronizer0 = new Synchronizer(scriptable0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setObjectIndex((Object) synchronizer0, 477.2327274, (Object) synchronizer0, context0);
      assertSame(synchronizer0, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ScriptRuntime.propIncrDecr(nativeContinuation0, "tYr", context0, (-296));
      assertFalse(nativeContinuation0.isEmpty());
      
      boolean boolean0 = ScriptRuntime.isSpecialProperty(",3#L!n]OH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        ScriptRuntime.getCallable(nativeError0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("#(?;*tK6q3");
      assertEquals("#(?;*tK6q3", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(7);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      assertNotNull(baseFunction0);
      
      Object object0 = ScriptRuntime.getObjectIndex((Scriptable) baseFunction0, 4, context0);
      assertNotNull(object0);
      
      int int0 = ScriptRuntime.toInt32((Object) context0.generateObserverCount);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context0, 160);
      assertEquals(1.0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeGenerator nativeGenerator0 = NativeGenerator.init((ScriptableObject) null, false);
      String string0 = ScriptRuntime.typeofName(nativeGenerator0, "b");
      assertTrue(nativeGenerator0.isExtensible());
      assertTrue(nativeGenerator0.isEmpty());
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(classLoader0).loadClass(anyString());
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(".\"8:rvOXZ=", classLoader0);
      ScriptRuntime.toUint32((Object) nativeJavaPackage0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.getNameFunctionAndThis("getParamAndVarCount", context0, nativeJavaPackage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      BaseFunction.init(baseFunction0, false);
      ScriptRuntime.getObjectIndex((Scriptable) baseFunction0, 8, context0);
      int int0 = ScriptRuntime.toInt32((Object) contextFactory0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = new Context();
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context1);
      Class<Long> class0 = Long.class;
      Scriptable scriptable0 = ScriptRuntime.toObject(context1, (Scriptable) scriptableObject0, (Object) context1, (Class<?>) class0);
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(scriptable0).when(scriptable1).getParentScope();
      doReturn(scriptable0).when(scriptable1).getPrototype();
      doReturn(false).when(scriptable1).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable2 = ScriptRuntime.bind(context0, scriptable1, ", ");
      assertNull(scriptable2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator0 = new NativeGenerator(scriptable0, nativeFunction0, scriptable0);
      // Undeclared exception!
      try { 
        ScriptRuntime.toNumber((Object) nativeGenerator0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, (Object[]) null);
      Synchronizer synchronizer0 = new Synchronizer(boundFunction0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.add((Object) boundFunction0, (Object) synchronizer0, context1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      // Undeclared exception!
      try { 
        ScriptRuntime.bind(context0, scriptableObject0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      Global global0 = (Global)ScriptRuntime.setName(scriptableObject0, scriptableObject0, context0, scriptableObject0, "language version");
      assertTrue(global0.isExtensible());
  }
}
