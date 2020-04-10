/*

 * Tue Mar 03 20:05:26 GMT 2020
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
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionCall;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
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
        ScriptRuntime.setConst((Scriptable) null, "com.google.javascript.rhino.head.Context@2985d1e", context0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ImporterTopLevel importerTopLevel1 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        ScriptRuntime.getPropFunctionAndThis((Object) importerTopLevel1, "error reporter", context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        ScriptRuntime.toPrimitive((Object) nativeIterator_StopIteration0);
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
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[5];
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = contextFactory0.enterContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        ScriptRuntime.newArrayLiteral(context0.emptyArgs, intArray0, context1, nativeContinuation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = ScriptRuntime.testUint32String("(");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      Class<BoundFunction> class0 = BoundFunction.class;
      Scriptable scriptable0 = Context.toObject((Object) "YW?aV,P]@Hp<", (Scriptable) topLevel0, (Class<?>) class0);
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, context0.emptyArgs);
      assertTrue(topLevel0.isEmpty());
      
      boolean boolean0 = ScriptRuntime.isSpecialProperty("error reporter");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = ScriptRuntime.stringToNumber("Function argument was not created by interpreted mode ", 100, 0);
      assertEquals(Double.NaN, double0, 0.01);
      
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(baseFunction0, false);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator1 = (NativeGenerator)ScriptRuntime.setObjectIndex((Object) baseFunction0, 1567.5213664832, (Object) nativeGenerator0, context0);
      assertTrue(nativeGenerator1.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1);
      Scriptable scriptable0 = importerTopLevel0.getPrototype();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        ScriptRuntime.getPropFunctionAndThis((Object) boundFunction0, "tnBhj%c`0xY9(`.+", context1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find function tnBhj%c`0xY9(`.+ in object function () {
         // \t[native code, arity=0]
         // }
         // .
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.lastUint32Result(context0);
      int int0 = ScriptRuntime.toInt32((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.lastUint32Result(context0);
      Byte byte0 = new Byte((byte)0);
      boolean boolean0 = ScriptRuntime.toBoolean(byte0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = Context.enter();
      ScriptRuntime.setObjectElem((Object) topLevel0, (Object) "vXy[aVY1", (Object) "vXy[aVY1", context0);
      assertFalse(topLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(200000);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      NativeWith nativeWith0 = new NativeWith(topLevel0, topLevel0);
      // Undeclared exception!
      try { 
        ScriptRuntime.getNameFunctionAndThis("error reporter", context0, nativeWith0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // ReferenceError: \"error reporter\" is not defined.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.lastUint32Result(context0);
      double double0 = ScriptRuntime.stringToNumber("Function argument was not created by interpreted mode ", 100, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      IdFunctionCall idFunctionCall0 = mock(IdFunctionCall.class, new ViolatedAssumptionAnswer());
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox[]) null, "bad descriptor:");
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeJavaMethod0, false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(idFunctionCall0, nativeGenerator0, 11, 1371);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(idFunctionObject0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(idFunctionObject0).when(scriptable0).getParentScope();
      IdFunctionObject idFunctionObject1 = (IdFunctionObject)ScriptRuntime.getNameFunctionAndThis("bad descriptor:", context0, scriptable0);
      assertTrue(nativeJavaMethod0.isEmpty());
      assertTrue(idFunctionObject1.isExtensible());
      
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = ScriptRuntime.getArrayElements(scriptable1);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null).when(scriptable0).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, context0.emptyArgs);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.name(context1, boundFunction0, "error reporter");
      assertTrue(boundFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      assertFalse(nativeJavaTopPackage0.isSealed());
      
      Object object0 = ScriptRuntime.delete((Object) nativeJavaTopPackage0, (Object) nativeJavaTopPackage0, context0, true);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, topLevel0, callable0, topLevel0, context0.emptyArgs);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.toIterator(context1, boundFunction0, boundFunction0, false);
      assertTrue(topLevel0.isEmpty());
      assertTrue(boundFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      Class<BoundFunction> class0 = BoundFunction.class;
      Scriptable scriptable0 = Context.toObject((Object) "YW?aV,P]@Hp<", (Scriptable) topLevel0, (Class<?>) class0);
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(scriptable0, scriptable0).when(scriptable1).getParentScope();
      doReturn("YW?aV,P]@Hp<").when(scriptable1).toString();
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable1, callable0, scriptable1, context0.emptyArgs);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.name(context1, boundFunction0, "error reporter");
      assertTrue(topLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = ScriptRuntime.stringToNumber("Function argument was not created by interpreted mode ", 100, 0);
      assertEquals(Double.NaN, double0, 0.01);
      
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertTrue(importerTopLevel0.isExtensible());
      
      int int0 = ScriptRuntime.toInt32((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      assertNotNull(baseFunction0);
      
      Byte byte0 = new Byte((byte)0);
      boolean boolean0 = ScriptRuntime.toBoolean(byte0);
      assertFalse(boolean0);
      
      NativeGenerator nativeGenerator0 = NativeGenerator.init(baseFunction0, false);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator1 = (NativeGenerator)ScriptRuntime.setObjectIndex((Object) baseFunction0, 1567.5213664832, (Object) nativeGenerator0, context0);
      assertTrue(nativeGenerator1.isEmpty());
      assertTrue(nativeGenerator1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        ScriptRuntime.toNumber((Object) nativeIterator_StopIteration0);
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
  public void test23()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      Class<BoundFunction> class0 = BoundFunction.class;
      Scriptable scriptable0 = Context.toObject((Object) "YW?aV,P]@Hp<", (Scriptable) topLevel0, (Class<?>) class0);
      Callable callable0 = mock(Callable.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, callable0, scriptable0, context0.emptyArgs);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = ScriptRuntime.in((Object) null, boundFunction0, context1);
      assertTrue(topLevel0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        ScriptRuntime.getNameFunctionAndThis("cISq5?x1JR(Q]", context0, nativeGenerator0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // ReferenceError: \"cISq5?x1JR(Q]\" is not defined.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      TopLevel topLevel0 = new TopLevel();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) topLevel0, true);
      ScriptRuntime.typeofName(scriptableObject0, "error reporter");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      ScriptRuntime.stringToNumber("Function argument was not created by interpreted mode ", 100, 0);
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      Delegator delegator0 = new Delegator(baseFunction0);
      Class<Long> class0 = Long.class;
      // Undeclared exception!
      try { 
        delegator0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class java.lang.Long
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      doReturn((Scriptable) null).when(context0).newArray(any(com.google.javascript.rhino.head.Scriptable.class) , anyInt());
      Global global0 = (Global)ScriptRuntime.getGlobal(context0);
      assertTrue(global0.hasPrototypeMap());
  }
}
