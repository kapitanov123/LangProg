class Queue {
	char[] q;
	int putloc, getloc; //
	Queue(int size) {
		q = new char[size]; //
		putloc=getloc=0;
	}
	//метод для помещения символа в очерредь 
	void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}
	//метод для извлечения символа из очереди
	char get() {
		if(getloc==putloc) {
			System.out.println(" - очерредь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}	
}
class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("сохраняем алфавит в очередь bigQ");
		for(i = 0; i < 25; i++)
			bigQ.put((char) ('A' + i));

		System.out.print("содержимое очереди bigQ: ");
		for(i = 0; i < 25; i++) {
                	 ch =  bigQ.get();
			 if(ch != (char) 0)
				 System.out.print(ch);
			
		}
	 	System.out.println("\n");
		System.out.println("сохраняем символы в очередь svallQ");
		for(i = 0; i < 26; i++) {
			System.out.print("попытка сохранения " + (char) ('Z' - i));
                        bigQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		System.out.println("извлекаем символы в очередь svallQ");
		for(i = 0; i < 5; i++) {
                         ch =  smallQ.get();
                         if(ch != (char) 0)
                                 System.out.print(ch);
		}
       		System.out.println();		
	}
}
