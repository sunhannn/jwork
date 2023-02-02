package generic_003_method2;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()) ; //1 =1 ture
		boolean valueCompare = p1.getValue().equals(p2.getValue());//사과=사과
	    return keyCompare && valueCompare;//ture
	}
}
