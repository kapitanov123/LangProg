class Strings {
	public static void main(String[] args) {
		String str = new String("строка номер один");
		String str2 = new String(str);
		String str3 = "строка номер три";
		System.out.println(str + " " + str2 + " " + str3);

		// методы работающие со строками

		// 1. проверка на эквивалентность boolean equals(str)
		boolean eq;
		eq = str.equals(str2);
		System.out.println("строки str i str2 ekv:" + eq);
		eq = str.equals(str3);
		System.out.println("строки str i str3 ekv:" + eq);

		//2. метод определения длины строки int length()
		int length = str.length();
		System.out.println("длина строки str: " + length);

		//3. извлечение символа по индексу char charAt(index)
		char ch;
		ch = str.charAt(3);
		System.out.println("в строке str символ под индексом 3: " + ch);
		for(int i = 0; i<str.length(); i++)
			System.out.print(str.charAt(i));
		System.out.println();

		System.out.println();
		//4. сравнение строк
		int result;
		result = str.compareTo(str2);
		System.out.println("результат сравнения строк стр и стр2: " + result);
		result = str.compareTo(str3);
                System.out.println("результат сравнения строк стр и стр3: " + result);

		System.out.println();
		//5. поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "од";
		result =str.indexOf(str3);
		System.out.println("первое вхождение подстроки \"од\" в стр " + result);

		//6. поиск подстроки и вывод индекса по первому вхождению подстроки
		str3 = "н";
		result = str.lastIndexOf(str3);
		System.out.println("последнее вхождение подстроки \"н\" в стр " + result);
		str3 = "три";
                result = str.lastIndexOf(str3);
                System.out.println("последнее вхождение подстроки \"три\" в стр " + result);
		
		System.out.println();
		String[] strs = {"разные", "элементы", "массива", "строк", str};
		System.out.println("исходный массив");
		for(String s : strs)
			System.out.println(s + " ");
		System.out.println("\n");
		strs[1] = "измененный элеммент";
		strs[4] = "Новая строка один";
		System.out.println("измененный массив");
                for(String s : strs)
                        System.out.println(s + " ");
                System.out.println("\n");
		
		//создание подстроки
		String substr;
		System.out.println("выделяем строку из строки стр: ");
		substr = str.substring(13, 17);
		System.out.println("оригинальная строка: " + str);
		System.out.println("подстрока: " + substr);

		//управление оператором свитч при помощи строк
		String command = "cancel";
		switch(command) {
			case "connect":
				System.out.println("подключение");
				break;
			case "cancel":
				System.out.println("otmena");
				break;
			case "disconnect":
				System.out.println("otklychenie");
				break;
			default:
				System.out.println("неизвстная команда");
				break;
		}

		System.out.println();
		//текстовые блоки
		String strblk = """
			пример блока с
			нестандартным форматированием
			строк.
				можно пользоваться переносом строки, табуляцией и прочими управляющими символами
			""";
		System.out.println(strblk);
		
		//аргументы командной строки
		System.out.println("количество параметров переданных программе: " + args.length);
		System.out.println("список параметров: ");
		for (int i=0; i<args.length; i++)
			System.out.println("аргумент[" + t +"]: " + args[i]);
		System.out.println();
		
		String[][] phoneNumbers = {
			{"авторемонт", "383-243-12-12"},
			{"деканат", "383-324-23-23"},
			{"поликлиника", "382-432-34-64"},
			{"сантехник", "383-123-12-12"}
		};
		int t2
		if(args.length != 1)
			System.out.println("usage: java Strings <наименование>");
		else {
			for(int t2=0; t2<phoneNumbers.length; t2++) {
				if(phoneNumbers[t2][0].equals(args[0])) {
					System.out.println(phoneNumers[t2][0] + ": " + phoneNumbers[0][1]);
					break;
				}
			}
			if(t2==phoneNumbers.length)
				System.out.println("ничего не найдено");
		}	
	}
}
