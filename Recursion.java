//демонстрация рекрсии
class Factorial {
	//рекурсивный метод
	int factR(int n) {
		int result;

		if(n==1)
			return 1;
		result = factR(n-1) * n;
		return result;
	}
	//итеративный метод
	int factI(int n) {
		int t, result;
		result = 1;
		for(t=1; t<=n; t++)
			result *= t;
		return result;
	}
}
//примеры использования статистических переменных и методов
class StaticDemo {
	int x;
	static int y;

	int sum() {
		return x + y;
	}
}
class StaticMeth {
	static int val = 1024;

	static int valDiv2() {
		return val/2;
	}
}
class StatiBlock {
	static double rootOf2;
	static double rootOf3;

	static {
		System.out.println("внутри статического блока");
		rootOf2 = math.sqrt(2.0);
		rootOf3 = math.sqrt(3.0);
	}
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}
class Recursion {
	public static void main(String[] args) {
		Factorial f = new Factorial();

		System.out.println("вычесленте фактрориала рекурсивным методом");
		System.out.println("факториал 3 равен: " + f.factR(3));
		System.out.println("факториал 4 равен: " + f.factR(4));
		System.out.println("факториал 5 равен: " + f.factR(5));
		System.out.println();
		System.out.println("вычесленте фактрориала итеративным методом");
		System.out.println("факториал 3 равен: " + f.factR(3));
		System.out.println("факториал 4 равен: " + f.factR(4));
		System.out.println("факториал 5 равен: " + f.factR(5));
		System.out.println();
//создание объектов
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("переменные ob1.x u ob2.x независимы");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
		System.out.println();

		System.out.println("статистическая StaticDemo.y равно 19");
		StaticDemo.y = 19;
		System.out.println("значение StaiticDemo.y равно 190");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();

		System.out.println("val: " + StaticMeth.val);
		System.out.println("StaticMeth.valDiv2()" + StaticMeth.valDiv2());
		
		Staticmeth.val = 2;
		System.out.println("val: " + Staticmeth.val);
		System.out.println("STaticmeth.valDiv2(): " + StaticvalDiv2());

		System.out.println();

		Staticblock ob = new StaticBlock("vnutri konst");
		System.out.println("квадратный корень из 2: " + StaticBlock.rootOf2);
		System.out.println("квадратный корень из 3: " + StaticBlock.rootOf3);
	}
}
