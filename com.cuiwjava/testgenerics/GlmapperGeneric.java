package testgenerics;

/**
 * https://mp.weixin.qq.com/s/-rpggP9Vt7Nz5IEFAA_Yvw
 * @param <T>
 */

/**
 * ？表示不确定的 java 类型
 * T (type) 表示具体的一个java类型
 * K V (key value) 分别代表java键值中的Key Value
 * E (element) 代表Element
 * @param <T>
 */
public class GlmapperGeneric<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	public static void main(String[] args) {
// do nothing
	}
	/**
	 * 不指定类型
	 */
	public void noSpecifyType() {
		GlmapperGeneric glmapperGeneric = new GlmapperGeneric();
		glmapperGeneric.set("test");
		// 需要强制类型转换
		String test = (String) glmapperGeneric.get();
		System.out.println(test);
	}

	/**
	 * 指定类型
	 */

	public void specifyType() {
		GlmapperGeneric<String> glmapperGeneric = new GlmapperGeneric();
		glmapperGeneric.set("test");
// 不需要强制类型转换
		String test = glmapperGeneric.get();
		System.out.println(test);
	}

}