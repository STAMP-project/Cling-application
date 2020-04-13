/*

 * Tue Mar 03 20:47:21 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.commonjs.module.Require;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.RegExp;
      Function function0 = TopLevel.getBuiltinCtor(context0, (Scriptable) global0, topLevel_Builtins0);
      // Undeclared exception!
      try { 
        Global.sync(context0, nativeObject0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Synchronizer synchronizer0 = new Synchronizer(nativeObject0, nativeObject0);
      Context context0 = Context.getCurrentContext();
      context0.initStandardObjects();
      Object[] objectArray0 = context0.getElements(synchronizer0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      Global global1 = new Global();
      IdFunctionObject idFunctionObject0 = global1.exportAsJSClass(256, global0, true);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) idFunctionObject0;
      Object object0 = Global.toint32(context0, nativeArray0, objectArray0, idFunctionObject0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      TopLevel topLevel0 = new TopLevel();
      Synchronizer synchronizer0 = new Synchronizer(topLevel0, topLevel0);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand(context0, synchronizer0, objectArray0, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.spawn(context0, nativeJavaClass0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      Global global1 = new Global();
      IdFunctionObject idFunctionObject0 = global1.exportAsJSClass(256, global0, true);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) idFunctionObject0;
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, idFunctionObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        Global.pipe(false, (InputStream) null, byteArrayOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      try { 
        Global.readFile(context0, nativeObject0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.spawn(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      global0.setIn(fileInputStream0);
      InputStream inputStream0 = global0.getIn();
      assertSame(inputStream0, fileInputStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Synchronizer synchronizer0 = new Synchronizer(nativeObject0, nativeObject0);
      Context context0 = Context.getCurrentContext();
      context0.stringIsCompilableUnit("UB?*b~ VO");
      Object[] objectArray0 = context0.getElements(synchronizer0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)TopLevel.getBuiltinCtor(context0, (Scriptable) global0, topLevel_Builtins0);
      context0.initStandardObjects();
      Object[] objectArray0 = context0.getElements(idFunctionObject0);
      assertEquals(1, objectArray0.length);
      assertFalse(idFunctionObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      NativeObject nativeObject0 = new NativeObject();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, nativeObject0, "js>L8#M!-`.T]\"wq", "js>error reporter", (-2770));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2770
         //
         verifyException("com.google.javascript.rhino.head.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      NativeArray nativeArray0 = global0.history;
      assertEquals(0L, nativeArray0.getLength());
      
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)TopLevel.getBuiltinCtor(context0, (Scriptable) global0, topLevel_Builtins0);
      Require require0 = global0.installRequire(context0, nativeArray0, true);
      Global.seal(context0, require0, context0.emptyArgs, idFunctionObject0);
      assertFalse(idFunctionObject0.isSealed());
      assertTrue(require0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[4];
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.sync((Context) null, scriptable0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Global global0 = new Global();
      PrintStream printStream0 = global0.getErr();
      InputStream inputStream0 = global0.getIn();
      Global.pipe(true, inputStream0, printStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)TopLevel.getBuiltinCtor(context0, (Scriptable) global0, topLevel_Builtins0);
      Object[] objectArray0 = context0.getElements(idFunctionObject0);
      assertEquals(1, objectArray0.length);
      assertFalse(idFunctionObject0.isSealed());
      
      double double0 = Context.toNumber(global0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.sync(context0, (Scriptable) null, context0.emptyArgs, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(1882, (-2629)).when(inputStream0).read(any(byte[].class) , anyInt() , anyInt());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      Global.pipe(false, inputStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Object object0 = Global.toint32((Context) null, (Scriptable) null, context0.emptyArgs, (Function) null);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Synchronizer synchronizer0 = new Synchronizer(nativeObject0, nativeObject0);
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      Object[] objectArray0 = context0.getElements(synchronizer0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = new Context();
      Delegator delegator0 = new Delegator();
      Global global0 = new Global();
      int int0 = global0.runDoctest(context0, delegator0, "language version", "3~.", (-1392));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      Synchronizer synchronizer0 = new Synchronizer(global0, inputStream0);
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) global0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, synchronizer0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      Global global0 = new Global(context0);
      Global global1 = new Global();
      IdFunctionObject idFunctionObject0 = global1.exportAsJSClass(4044, global0, false);
      try { 
        Global.readUrl(context0, global1, objectArray0, idFunctionObject0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ContextFactory contextFactory0 = new ContextFactory();
          Context context0 = contextFactory0.enter();
          Global global0 = new Global(context0);
          Object[] objectArray0 = new Object[6];
          TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
          BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
          // Undeclared exception!
          try { 
            Global.runCommand(context0, baseFunction0, objectArray0, baseFunction0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor154.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
