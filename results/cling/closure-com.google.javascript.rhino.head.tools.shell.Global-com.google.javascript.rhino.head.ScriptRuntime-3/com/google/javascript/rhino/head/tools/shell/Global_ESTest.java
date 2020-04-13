/*

 * Tue Mar 03 20:46:12 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

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
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.commonjs.module.Require;
import com.google.javascript.rhino.head.tools.shell.Global;
import com.google.javascript.rhino.head.tools.shell.ShellContextFactory;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.List;
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
      Object[] objectArray0 = new Object[2];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.sync((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Global global0 = new Global();
      PrintStream printStream0 = global0.getOut();
      global0.setOut(printStream0);
      PrintStream printStream1 = global0.getOut();
      assertSame(printStream1, printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      Global global0 = new Global(context0);
      Short short0 = new Short((short) (-911));
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, short0, (-1), "language version", 13, global0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) idFunctionObject0;
      Object object0 = Global.toint32(context0, idFunctionObject0, objectArray0, idFunctionObject0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = new Context();
      Object[] objectArray0 = new Object[3];
      Short short0 = new Short((short)992);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, short0, 160, 120);
      // Undeclared exception!
      try { 
        Global.doctest(context0, global0, objectArray0, idFunctionObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = new Context();
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(function0).getParentScope();
      Object[] objectArray0 = new Object[1];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeContinuation0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Require require0 = global0.installRequire(context0, (List<String>) null, true);
      // Undeclared exception!
      try { 
        Global.spawn(context0, global0, context0.emptyArgs, require0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Global global0 = new Global();
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) global0;
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Global.runCommand((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      context0.initStandardObjects((ScriptableObject) nativeContinuation0, false);
      assertFalse(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        Global.spawn(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Context context1 = Context.enter();
      Global global0 = new Global(context1);
      Delegator delegator0 = new Delegator(global0);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) delegator0;
      // Undeclared exception!
      try { 
        Global.seal(context0, delegator0, objectArray0, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      Global global0 = new Global();
      Short short0 = new Short((short) (-911));
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, short0, (-1), "language version", 13, global0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) idFunctionObject0;
      Thread thread0 = (Thread)Global.spawn(context0, idFunctionObject0, objectArray0, idFunctionObject0);
      assertFalse(thread0.isInterrupted());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global(context0);
      Global.seal(context0, global0, context0.emptyArgs, (Function) null);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[4];
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Global.sync(context0, scriptable0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Global.sync(context0, nativeContinuation0, context0.emptyArgs, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 5, 13);
      // Undeclared exception!
      try { 
        Global.pipe(true, byteArrayInputStream0, (OutputStream) null);
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
  public void test17()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      PrintStream printStream0 = global0.getErr();
      assertNotNull(printStream0);
      
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, printStream0, 3, "L+g", 882, global0);
      Object object0 = Global.toint32((Context) null, global0, context0.emptyArgs, idFunctionObject0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readFile(context0, function0, objectArray0, function0);
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
  public void test19()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = new Context();
      Global global1 = new Global(context0);
      BoundFunction boundFunction0 = new BoundFunction(context0, global1, (Callable) null, global0, context0.emptyArgs);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) boundFunction0;
      objectArray0[1] = (Object) boundFunction0;
      Thread thread0 = (Thread)Global.spawn(context0, global0, objectArray0, nativeJavaClass0);
      assertFalse(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global();
      int int0 = global0.runDoctest(context0, (Scriptable) null, "error reporter", "error reporter", 1274);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) baseFunction0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, objectArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, (Scriptable) null, "js>%'_}o{vQ/!3*U,?", ">eH*=-DhM", 140);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // doctest failure running:
         // %'_}o{vQ/!3*U,?
         // expected: actual: js: \"doctest input\", line 1: syntax error
         // js: %'_}o{vQ/!3*U,?
         // js: .^
         // js: \"doctest input\", line 1: illegal character
         // js: %'_}o{vQ/!3*U,?
         // js: .^
         // js: \"doctest input\", line 1: unterminated string literal
         // js: %'_}o{vQ/!3*U,?
         // js: ...............^
         // js: \"doctest input\", line 1: Compilation produced 3 syntax errors.
         // 
         // 
         //  (>eH*=-DhM#140)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Global global0 = new Global();
          Context context0 = Context.enter();
          PrintStream printStream0 = global0.getErr();
          Object[] objectArray0 = new Object[3];
          IdFunctionObject idFunctionObject0 = new IdFunctionObject(global0, printStream0, 3, "L+g", 882, global0);
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, idFunctionObject0);
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
             // sun.reflect.GeneratedMethodAccessor135.invoke(Unknown Source)
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
