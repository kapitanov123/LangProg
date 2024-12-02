class TwoDShape {
	private double width;
	private double height;
	String name;
	int i = 100;
	TwoDShape(double w, double h) {
		if(w > 21.0)
                        width = 21.0;
                else
                        width = w;

		if(h > 29.7)
                        height = 29.7;
                else
                        height = h;
		name = "двумерная фигура";
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if(w > 21.0)
			width = 21.0;
		else
			width = w;
	}
	void setHeight(double h) {
		if(h > 29.7)
			height = 29.7;
		else
			height = h;
	}
	void showDim() {
		System.out.println("размеры фигуры: " + width + " x " + height);
	}
	/*
	String showName() {
		return super.name;
	}
	*/
}
class Triangle extends TwoDShape {
	String style;
	int i = 10;
	Triangle(String s, double w, double h) {
		super(w, h); //вызов конструктора супер класса
		style = s;
		name = "треугольник";
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("стиль: " + style);
	}
	/*
	String showSuperName() {
		return super.name;
	}
	*/
}
class Rectangle extends TwoDShape {
	Rectangle(String o, double w, double h){
		super(w, h); //вызов конструктора супер класса
		outLine = o;
		name = "прямоугольник";
	}
	String outLine;
	double area() {
		return getWidth() * getHeight();
	}
	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}
}
class Interihance {
	public static void main(String[] args) {
		TwoDShape fig1 = new TwoDShape(20.0, 30.0);
		Triangle t1 = new Triangle("закрашенный", 4.5, 7.5);
		Triangle t2 = new Triangle("контурный", 3.5, 8.0);
		Rectangle r1 = new Rectangle("сплошная линия", 5.0, 5.0);
		Rectangle r2 = new Rectangle("пунктирная линия", 5.0, 7.0);
		System.out.println("информация об объeктах");
		System.out.println("fig1: " + fig1.name);
		fig1.showDim();
		System.out.println("t1: " + t1.name);
		t1.showStyle();
		System.out.println("площадь: " + t1.area());
	//	t1.showName();
		System.out.println();

		System.out.println("r1 " + r1.name);
		System.out.println("квадрат " + r1.isSquare());
		System.out.println("площадь: " + r1.area());

		//проверка доступности переменных
		/*
		System.out.println(fig1.width);
		System.out.println(t1.width); // подкласс имеет доступ к переменным и методам суперкласса
		System.out.println(fig1.style); // супер класс не имеет доступа к переменнымб описаным в подклассе
		*/
	}
}
