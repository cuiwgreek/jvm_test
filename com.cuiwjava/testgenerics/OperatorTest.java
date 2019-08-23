package testgenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname OperatorTest
 * @Description TODO
 * @Date 2019/8/23 16:28
 * @Created by cuiwei34
 */
public class OperatorTest {
	/**
	 * 如果传入的类型不是 E 或者 E 的子类，编译不成功
	 * 泛型中可以使用 E 的方法，要不然还得强转成 E 才能使用
	 * @param animals
	 * @return
	 */
	static int countLegs(List<? extends Animal>animals){
		int retVal = 0;
		for(Animal animal : animals){
			retVal += animal.countLegs();
		}
		return retVal;
	}

	static int countLegs1(List<Animal>animals){
		int retVal = 0;
		for(Animal animal : animals){
			retVal += animal.countLegs();
		}
		return retVal;
	}

	public static void main(String[] args){
		List<Dog>dogs  = new ArrayList<>();
// 不会报错
		countLegs(dogs);
// 报错
// 		countLegs1(dogs);

		List<Animal> animals = new ArrayList<>();
		new OperatorTest().test(animals,dogs);

	}

	/**
	 * 下界通配符 < ? super E>
	 * @param dst
	 * @param src
	 * @param <T>
	 */
	private <T> void test(List<? super T> dst, List<T> src){
		for (T t : src) {
			dst.add(t);
		}
	}



}
