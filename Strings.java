class Strings {
	public static void main(String[] args) {
		String str = new String("строка номер 1");
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
	}
}
