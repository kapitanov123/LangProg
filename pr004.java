//передача объектов в качестве аргументов и возвращение объектов методами
class Block {
	int a, b, c;
	int v;

	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		v = a*b*c;
	}
	public boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else
			return false;
	}
	public boolean sameV(Block ob) {
		if(ob.v == v)
			return true;
		else
			return false;
	}
}
class ByValue {
	void noChange(int i, int j) {
		i = i + j;
		j = -j;
	}
}
class ByRef {
	int a, b;
	ByRef(int i, int j) {
		a = i;
		b = j;
	}
	void change(ByRef ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}	
}
class ErrorMsg {
	String[] msgs = {
		"ошибка вывода",
		"ошибка ввода",
		"переполнение диска",
		"выход индекса за гранийцы мвсива"
	};
	//пример возврата объекта в виде строки
	String getErrorMsg(int i) {
		if(i<=0 & i < msgs.length)
			return msgs[i];
		else
			return "неизвестная ошибка";
	}
}
class Err {
	String msg;
	int severity;
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}
class ErrorInfo {
	String[] msgs = {
		"ошибка вывода",
		"ошибка ввода",
		"переполнение диска",
		"выход индекса за границы массива"
	};
	int[] howBad = {3,3,2,4};
	Err getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length)
			return new Err(msgs[i], howBad[i]);
		else
			return new Err("неизвестная ошибка", 0);
	}
}
class pr004 {
	public static void main(String[] args) {
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(5, 4, 5);
		System.out.println("ob1 ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob1 ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob1 ob2: " + ob1.sameV(ob3));
		
		System.out.println();
		//пример передачи 
		ByValue ob4 = new ByValue();
		int a = 15, b =20;
		System.out.println("a u b перед вызовом метода noChange(): " + a +" " + b);
		ob4.noChange(a, b);
		System.out.println("a u b перед вызовом метода noChange(): " + a +" " + b);
		//значение а и б после вызова метода ночендж не изменяется
		System.out.println();
		
		ByRef ob5 = new ByRef(15, 20);
		System.out.println("ob5.a u ob5.b перед вызовом метода noChange(): " + ob5.a +" " + ob5.b);
		ob5.change(ob5);
		System.out.println("ob5.a u ob5.b перед вызовом метода noChange(): " + ob5.a +" " + ob5.b);
		//значения а и б внутри обс 5 меняютс методом чендж()
		System.out.println();
		//демонстрация возврата строки методом
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(10));

		System.out.println();
		//демонстрация возврата методом объекта скоструированного из строки и целого числа
		
		ErrorInfo err2 = new ErrorInfo();
		Err e;
		e = err2.getErrorInfo(2);
		System.out.println(e.msg + ", уровень серьезности: " + e.severity);
		e = err2.getErrorInfo(10);
		System.out.println(e.msg + ", уровень серьезности: " + e.severity);
	}
}
