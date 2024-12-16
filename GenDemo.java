//пример обобщенного класса
class Gen <T> {
	//оюъявление ссылки на объект обобщенного типа
	T ob;
	//конструктор
	Gen(T o) {
		ob = o;
	}
	//методы для проверки информации об объектах
	T getOb() {
		return ob;
	}
	void showType() {
		System.out.println("тип Т: " +ob.getClass().getName());
	}
}
class GenDemo {
	public static void main(String[] args) {
		//объявили переменную класса Gen
		Gen <Double> dOb;
		//создаем объект
		dOb = new Gen <Double> (100.00);
		//ошибочное использование:
		//iOb = new Gen <Integer> (100.0);
		dOb.showType();
		double x = dOb.getOb();
		System.out.println("значение x: " + x);
		System.out.println();

		Gen <String> sOb;
		sOb = new Gen<>("строка");
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("значение s: " + s);
		System.out.println();

		//неверное присваивание несовместимых объектов
		//dOb = iOb;
	}
}
