class NumericFns<T extends Number> {
	T num;

	NumericFns(T n) {
		num = n;
	}
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEqual (NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
/*
 *можно ограничивать классы родственными связями
 class pair <T, Vextends T> {
 .....
 }
 */
class NumFuncDemo {
	public static void main(String[] args) {
		NumericFns Ob;
		NumericFns<Integer> iOb;
		iOb = new NumericFns<>(5);
		Ob = iOb;
		System.out.println("обратная величина iOb: " + Ob.reciprocal());

		System.out.println("дробная часть iOb: " + Ob.fraction());

		NumericFns<Double> dOb = new NumericFns<>(5.2);
		
		Ob = dOb;
		
		System.out.println("обратная величина iOb: " + dOb.reciprocal());

                System.out.println("дробная часть iOb: " + dOb.fraction());

		//нарушение ограничений на обобщенный тип
		//NumericFns<String> sOb = new NumericFns<>("строка");

		NumericFns<Integer> intOb = new NumericFns<>(7);
		NumericFns<Double> dblOb = new NumericFns<>(-7.0);

		if (intOb.absEqual(dblOb))
			System.out.println("модули чисел intOb i dblOb равны");
		else
			System.out.println("модули чисел intOb i dblOb не равны");
		if (intOb.absEqual(dOb))
                        System.out.println("модули чисел intOb i dOb равны");
                else
                        System.out.println("модули чисел intOb i dOb не равны");
	}
}
