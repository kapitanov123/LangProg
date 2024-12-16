//пример обобщенного класса с двумя обобщенными типами
class TwoGen <T, V> {
	//оюъявление ссылки на объект обобщенного типа
	T ob1;
	V ob2;
	//конструктор
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	//методы для проверки информации об объектах
	void showType() {
		System.out.println("тип Т: " + ob1.getClass().getName());
		System.out.println("тип V: " + ob2.getClass().getName());
	}
	
	T getOb1() {
		return ob1;
	}
       	
	V getOb2() {
                return ob2;
        }

}
class TwoGenDemo {
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
		
		TwoGen  <Double, String> tg2Ob;
		tg2Ob = new TwoGen<>(8.0, "строка");
		//типы объектов
		tg2Ob.showType();
		double vd1 = tg2Ob.getOb1();
		String vs2 = tg2Ob.getOb2();

		System.out.println("переменные vd1 и vs2: " + vd1 + " " + vs2);
	}
}
