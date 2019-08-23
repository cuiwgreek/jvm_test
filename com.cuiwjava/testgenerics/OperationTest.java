package testgenerics;

/**
 * @Classname OperationTest
 * @Description TODO
 * @Date 2019/8/23 17:34
 * @Created by cuiwei34
 */
public class OperationTest {
	public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
		return clazz.newInstance();
	}

	/**
	 * Class<T> 在实例化的时候，T 要替换成具体类。Class<?> 它是个通配泛型，? 可以代表任何类型，所以主要用于声明时的限制情况。比如，我们可以这样做申明
	 * @param args
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		A a = createInstance(A.class);
		B b = createInstance(B.class);

	}
}

class A {}

class B{}
