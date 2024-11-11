//работа с массивами
class Arrays {
	public static void main(String[] args) {
        	int [] nums = new int[10];
		//заполнение массива значениями
        	for(int i = 0; i<10; i++) 
			nums[i] = i;
		//вывод содержимого массива
		for(int i = 0; i < 10; i++)
			System.out.println("элемент nums [" + i + "]:"+ nums[i]);
		System.out.println();
		//ввод каждого элемента массива "вручную"
		nums[0] = 32;
		nums[1] =-42;
		nums[2] = 1132;
		nums[3] = 320;
		nums[4] = 3212;
		nums[5] = 3421;
		nums[6] = 512;
		nums[7] = 5235;
		nums[8] = 24;
		nums[9] = 97;

		//находим максимальное и минимальное значение в МАссиве
		int min, max;
		min = max = num[0];
		for(int i = 1; i < 10; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("минимальное значение: " + min + "\n максимальное значение: "+ max);
		System.out.println();

		//альтернативная форма инциализации массива
		int x = 10;
		int[] nums1 = {32,-42,1132,53,124,94,x,-522,-10};
		min = max = num[0];
                for(int i = 1; i < 10; i++) {
                        if(nums[i] < min) min = nums1[i];
                        if(nums[i] > max) max = nums1[i];
                }
                System.out.println("минимальное значение: " + min + "\n максимальное значение: "+ max);
                System.out.println();
 
	}	
}
