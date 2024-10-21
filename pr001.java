class pr001 {
	public static void main(String args[]) {
		System.out.println("pervaua java-programma");
		//преобразование типов

		// цулые типы данных
		byte b;// 8 бит
		b = -128;
		b = 127;
		b = (byre)130;
		short sh; // 16бит
	        sh = (short)65536;
		int intg; // 32
		long l // 64
		intg = 2000000000
		intg = intg*intg;
		system.out.printl(intg);
		l = l*l*l;
		system.out.println(l);

		//вещественные типы
		float f; //32
		double dd; //64
	        sh = b;
	       	b = (byte)sh;
		dd = 1.0;
		intg = (int)dd;
		intg = (double)intg/3;
		f = intg;
		System.out.println(intg + " " + dd);
		// символьный тип
		char ch; // 16 бит
	        ch = 'A';
		ch++; ++ch;
		ch = (char)45;
		for(int i=0; i<68; i++)
			System.out.println(ch++ + " ");
		System.out.println();
		ch = '0';
		System.out.println(((int)ch));
		// логический тип;
		boolean bool, bool2 = false;
	        bool = true;
		System.out.println(!bool);
		System.out.println(bool && bool2);
		System.out.println(bool || bool2);
		System.out.println(bool ^ bool2);
		System.out.println("перевод строки\n" + "табуляция\t" + "\"кавычки\" в строке" + (!bool & (bool2 | bool)));
		ch = '\'';		
	}
}
