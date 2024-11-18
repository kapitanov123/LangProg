class AccessDemo {
	private int alpha; // peremenaya s zakrytym dostypom
	public int beta; //otkrytyi dostup
	int gamma; //dostyp po ymolchaniy
	
	// metod dostupa k zakrytoi peremennoi
	void setAlpha(int a) {
		if(a <= 100)
			alpha = a;
		else
			System.out.println("значение превышает допустимую границу");
	}
	public int getAlpha() {
		return alpha;
	}
}
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;
	
	public FailSoftArray(int size, int errval) {
	a = new int[size];
	errval = errv;
	length = size;
	}
	public int get(int index) {
		if(indexOK(index))
		       	return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	private boolean indexOK(int index) {
		if(index>=0 & index < length) return true;
		return false;
	}
}
class Modif {
	public static void main(String[] args) {
		AccessDemo ad = new AccessDemo();
		//ad.alpha = 99;
		ad.beta = 1851;
		ad.gamma = 222;

		ad.setAlpha(199);
		System.out.println("значение alpha: " + ad.getAlpha());
		ad.setAlpha(99);
		System.out.println("значение alpha: " + ad.getAlpha());

		//
		System.out.println();
		FallSoftArray fs = new FallSoftArray(5, -1);
		int x;

		System.out.println("вывод значений без сообщений об ошибках");
		for(int i = 0; i < (fs.length * 2); i++)
			fs.put(i, i*10);
		for(int i=0; i < (fs.length * 2); i++) {
			x= fs.get(i);
			if(x != -1) 
				System.out.print(x + " ");
		} 
		System.out.println();
		
		System.out.println("сообщаем об ошибках");
                for(int i = 0; i < (fs.length * 2); i++)
                        if(fs.put(i, i*10));
				System.out.println("индекс" + i + "выходит за границы массива");
                for(int i=0; i < (fs.length * 2); i++) {
                        x= fs.get(i);
                        if(x != -1) 
				System.out.print(x + " ");
			else
				System.out.println("индекс" + i + "выходит за границы массива");
                }
                System.out.println();	
	}
}
