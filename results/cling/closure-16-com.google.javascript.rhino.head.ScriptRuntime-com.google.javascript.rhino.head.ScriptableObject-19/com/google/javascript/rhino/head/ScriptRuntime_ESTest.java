/*

 * Tue Mar 03 20:02:36 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Ref;
import com.google.javascript.rhino.head.RegExpProxy;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.WrappedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Object[]) null).when(scriptable0).getIds();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false, false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeWith nativeWith0 = new NativeWith(scriptable0, scriptable0);
      ScriptRuntime.nameIncrDecr((Scriptable) nativeWith0, (String) null, 53);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        ScriptRuntime.enumInit((Object) nativeWith0, context0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.bind(context0, scriptable0, "error reporter");
      assertNull(scriptable1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeJavaTopPackage nativeJavaTopPackage1 = (NativeJavaTopPackage)ScriptRuntime.strictSetName(nativeJavaTopPackage0, nativeJavaTopPackage0, context0, nativeJavaTopPackage0, "");
      assertTrue(nativeJavaTopPackage1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(scriptable0).getIds();
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Synchronizer synchronizer0 = new Synchronizer(scriptable0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.enumInit((Object) synchronizer0, context0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "", classLoader0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeJavaPackage0).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeJavaPackage nativeJavaPackage1 = (NativeJavaPackage)ScriptRuntime.getObjectIndex(scriptable0, 170, context0);
      assertTrue(nativeJavaPackage1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ScriptRuntime.makeUrlForGeneratedScript(false, "#w0<OJ(\"`_=", 150);
      assertEquals("#w0<OJ(\"`_=#150(Function)", string0);
      
      double double0 = ScriptRuntime.stringToNumber("error reporter", 62, 5);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Object) null).when(scriptable1).getDefaultValue(nullable(java.lang.Class.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable1).getParentScope();
      doReturn((String) null, (String) null, (String) null).when(scriptable1).toString();
      Scriptable scriptable2 = ScriptRuntime.checkDynamicScope(scriptable0, scriptable1);
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context0, 138);
      Scriptable scriptable3 = ScriptRuntime.toObject(scriptable2, object0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Synchronizer synchronizer0 = new Synchronizer(scriptable2, nativeJavaClass0);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.delete((Object) importerTopLevel0, (Object) synchronizer0, context1, true);
      // Undeclared exception!
      try { 
        ScriptRuntime.toCharSequence(scriptable3);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Throwable throwable0 = new Throwable();
      WrappedException wrappedException0 = new WrappedException(throwable0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      WrappedException wrappedException1 = (WrappedException)ScriptRuntime.setObjectElem(scriptable0, (Object) scriptable0, (Object) wrappedException0, context0);
      assertNull(wrappedException1.getLineSource());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Float float0 = new Float((float) 5);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(float0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object object0 = ScriptRuntime.name(context0, scriptable0, "error reporter");
      assertEquals(5.0F, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("1a=^LF4nGe&])?", classLoader0);
      Context context0 = Context.getContext();
      ScriptRuntime.setConst(nativeJavaPackage0, nativeJavaPackage0, context0, "language version");
      assertFalse(nativeJavaPackage0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      double double0 = ScriptRuntime.stringToNumber("error reporter", 62, 5);
      assertEquals(Double.NaN, double0, 0.01);
      
      NativeWith nativeWith0 = new NativeWith(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeWith0, 110, 160);
      boolean boolean0 = idFunctionObject0.isGenericDescriptor(nativeIterator_StopIteration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator((-898));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ScriptRuntime.makeUrlForGeneratedScript(false, "language version", (-67));
      assertEquals("language version#-67(Function)", string0);
      
      double double0 = ScriptRuntime.stringToNumber("language version", 4, 100);
      assertEquals(3.0101614E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(context0).getOptimizationLevel();
      doReturn(false).when(context0).hasFeature(anyInt());
      ScriptableObject scriptableObject0 = ScriptRuntime.initStandardObjects(context0, (ScriptableObject) null, false);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = new ContextFactory();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      Context context1 = contextFactory0.enterContext(context0);
      ScriptRuntime.delete((Object) nativeJavaTopPackage0, (Object) null, context1, false);
      long long0 = ScriptRuntime.toUint32((Object) nativeJavaTopPackage0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isStrWhiteSpaceChar(13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptRuntime.stringToNumber("error reporter", 62, 5);
      Context context0 = Context.enter();
      NativeWith nativeWith0 = new NativeWith(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeWith0, 110, 160);
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      // Undeclared exception!
      try { 
        ScriptRuntime.delete((Object) idFunctionObject0, (Object) baseFunction0, context0, false);
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
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      ScriptRuntime.refIncrDecr(ref0, context0, 138);
      BaseFunction baseFunction0 = ScriptRuntime.typeErrorThrower();
      // Undeclared exception!
      try { 
        ScriptRuntime.toUint32((Object) baseFunction0);
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
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeString nativeString0 = (NativeString)ScriptRuntime.toObject((Context) null, scriptable0, (Object) "[KQlcp.nvT$NR");
      String string0 = ScriptRuntime.typeofName(nativeString0, "error reporter");
      assertTrue(nativeString0.isEmpty());
      assertEquals("undefined", string0);
      assertTrue(nativeString0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = Context.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeJavaTopPackage0.getOwnPropertyDescriptor(context0, "msg.both.data.and.accessor.desc");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "msg.both.data.and.accessor.desc";
      int int0 = ScriptRuntime.toInt32(objectArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      NativeWith nativeWith0 = new NativeWith(scriptable0, scriptable0);
      Integer integer0 = new Integer(6);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.add((Object) nativeWith0, (Object) integer0, context0);
      assertEquals(6.0, object0);
      
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(nativeFunction0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(0).when(nativeFunction0).getLanguageVersion();
      doReturn(0).when(nativeFunction0).getParamAndVarCount();
      doReturn(0).when(nativeFunction0).getParamCount();
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null).when(nativeFunction0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null).when(nativeFunction0).toString();
      NativeCall nativeCall0 = (NativeCall)ScriptRuntime.createFunctionActivation(nativeFunction0, nativeFunction0, (Object[]) null);
      assertFalse(nativeCall0.isEmpty());
      assertTrue(nativeCall0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      RegExpProxy regExpProxy0 = ScriptRuntime.getRegExpProxy(context0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(regExpProxy0).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false, false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      NativeWith nativeWith0 = new NativeWith(scriptable0, scriptable0);
      Integer integer0 = new Integer(6);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.add((Object) nativeWith0, (Object) integer0, context1);
      Synchronizer synchronizer0 = new Synchronizer(nativeWith0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context2 = new Context(contextFactory0);
      ScriptRuntime.setConst(nativeWith0, synchronizer0, context2, "language version");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      RegExpProxy regExpProxy0 = ScriptRuntime.getRegExpProxy(context0);
      ScriptRuntime.toUint16(regExpProxy0);
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(nativeFunction0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(0).when(nativeFunction0).getLanguageVersion();
      doReturn(0).when(nativeFunction0).getParamAndVarCount();
      doReturn(0).when(nativeFunction0).getParamCount();
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null).when(nativeFunction0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null).when(nativeFunction0).toString();
      ScriptRuntime.createFunctionActivation(nativeFunction0, nativeFunction0, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Short short0 = new Short((short) (-300));
      Object object0 = ScriptRuntime.toPrimitive((Object) short0);
      assertEquals((short) (-300), object0);
  }
}
