package testgenerics;

import java.util.List;

/**
 * @Classname MethodInterface
 * @Description TODO
 * @Date 2019/8/23 17:17
 * @Created by cuiwei34
 * 区别1：通过 T 来 确保 泛型参数的一致性
 */
public interface MethodInterface {
	// 通过 T 来 确保 泛型参数的一致性
	public <T extends Number> void test1(List<T> dest, List<T> src);

	//通配符是 不确定的，所以这个方法不能保证两个 List 具有相同的元素类型
	public void test(List<? extends Number> dest, List<? extends Number> src);

}
