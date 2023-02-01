package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar (double a, double b);
	
//	default String legal() {
//		return "legal";
	default double cool() {
	return executar(2, 3);
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
