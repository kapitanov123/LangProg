package bookpack;
/*
class Book {
	private String title;
	private String author;
	private int pubDate;

	Book (String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
		
	}
}
*/
class BookDemo {
	public static void main(String[] args) {
		Book[] books = new Book[4];

		books[0] = new Book("первому игроку приготовиться", "Эрнест Клайн", 2011);

		books[1] = new Book("солярис", "лем С.", 1970);

		books[2] = new Book("безмолвный пациент", "михаэлидес", 2019);

		books[3] = new Book("главный инженер", "Пантелеев Л.", 1950);
		
		for(int i = 0; i < books.length; i++)
			books[i].show();

	}
}
