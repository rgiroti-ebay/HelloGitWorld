/*
 * Created by IntelliJ IDEA.
 * User: rgiroti
 * Date: 8/3/11
 * Time: 3:00 PM
 */

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GuiceMethodInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return methodInvocation.proceed();
    }
}
