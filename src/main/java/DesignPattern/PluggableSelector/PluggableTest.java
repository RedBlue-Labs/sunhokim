package DesignPattern.PluggableSelector;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class PluggableTest {
    Map<String, Class> map = new HashMap<String, Class>();

    public void addTest(Class clazz){
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            method.setAccessible(true);

            if(method.getName().startsWith("test")){
                map.put(method.getName(), clazz);
            }
        }
    }

    public void runTest(){

        for(String testName : map.keySet()){
            Class clazz = map.get(testName);

            try {
                Object testObject = clazz.newInstance();
                Class[] parameterTypes = new Class[0];
                Method setUp = clazz.getDeclaredMethod("setUp", parameterTypes);
                Method tearDown = clazz.getDeclaredMethod("tearDown", parameterTypes);
                Method testMethod = clazz.getDeclaredMethod(testName, parameterTypes);

                Object[] parameters = new Object[0];
                setUp.invoke(testObject, parameters);
                testMethod.invoke(testObject, parameters);
                tearDown.invoke(testObject, parameters);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (SecurityException e) {
            } catch (IllegalArgumentException e) {
            } catch (InvocationTargetException e) {
            } catch (NoSuchMethodException e) {
            }
         }
    }
}
