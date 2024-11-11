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
		for(int i = 1; i < nums.lenght; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("минимальное значение: " + min + "\n максимальное значение: "+ max);
		System.out.println();

		//альтернативная форма инциализации массива
		int x = 10;
		int[] nums1 = {32,-42,1132,53,124,94,x,-522,-10};
		min = max = num[0];
                for(int i = 1; i < nums.lenght; i++) {
                        if(nums[i] < min) min = nums1[i];
                        if(nums[i] > max) max = nums1[i];
                }
                System.out.println("минимальное значение: " + min + "\n максимальное значение: "+ max);
                System.out.println();
 		//двумерные массивы
		int t, j;
		int [][] table = new int[3][4];
		for(t=0; t<3; t++) {
			for(j=0; j<4; j++) {
				table[t][j] = (t*4) + j +1;
				System.out.print(table[t][j] + "\t");
			}
			System.out.println();	
		}
		System.out.println();

		//непрямоугольные массивы
		int [][] riders = new int[7][];
	       	riders[0] = new int[10];
	       	riders[1] = new int[10];
	       	riders[2] = new int[10];
	       	riders[3] = new int[10];
	       	riders[4] = new int[10];
	       	riders[5] = new int[2];
	       	riders[6] = new int[2];
		//заполнение массива
		for(int i =0; i < 5; i++)
			for(int k=0; k<10; k++)
				riders[i][k] = i + k + 10;
		for(int i=5; i<7; i++)
			for(int k=0; k=2; k++)
				riders[j][k] = i +k + 10;

		//вывод массива
		System.out.println("перевезено пассажиров в будние дни ");
		for(int i=0; i < 5; i++) {
			for(int k=0; k<10; k++)
				System.out.println(riders[j][k]+ " ");
			System.out.println();
		}
		System.out.println();
		System.out.println("перевезено пассажиров в vyxod дни ");
		for(int i=5; i<7; i++) {
			for(int k=0; k<2; k++)
				System.out.println(riders[j][k] + " ");
			System.out.println();
		}
		System.out.println();

		//инициация двумерного массива
		int[][] sqrs = {
			{1, 1},
			{2, 4},
			{3, 9},
			{4, 16},
			{5, 25},
			{6, 36},
			{7, 49},
			{8, 64},
			{9, 81},
			{10, 100}
		};
		System.out.println("содержимое двумерного массива sqrs ");
                for(int i=0; i < 10; i++) {
                        for(int k=0; k<2; k++)
                                System.out.println(sqrs[i][k] + "\t");
                        System.out.println();	
		}

		//объвление массива int[] nums = new nums[3]
		//альренативное объявление массива int nums[] = new nums[3]
		//ссылочный переиенные, указывающие на массивы
		int[] nums2 = new int[10];
		int[] nums3 = new int[10];

		for(int i=0; i<10; i++) {
			nums2[i] = i;
                        nums3[i] = -i;
		}
		System.out.print("массив nums2: ");
		for(int i=0; i<10; i++)
                        System.out.print(nums2[i] + " ");
		System.out.println();

		System.out.print("массив nums3: ");
                for(int i=0; i<10; i++)
                        System.out.print(nums3[i] + " ");
                System.out.println();

		nums2[3] = 99;

		System.out.println("nums2 i nums3 независимы. изменяется значение только у nums2[: ]");
		System.out.print("массив nums2: ");
                for(int i=0; i<10; i++)
                        System.out.print(nums2[i] + " ");
                System.out.println();

                System.out.print("массив nums3: ");
                for(int i=0; i<10; i++)
                        System.out.print(nums3[i] + " ");
                System.out.println();
		System.out.println("выполняем присваивание намс3 = намс2");
		nums3=nums2;
		nums[3] = -99;
		System.out.println("nums2 i nums3теперь указывают на один и тот же массив. изменяется значение только у nums2[: ]");
                System.out.print("массив nums2: ");
                for(int i=0; i<10; i++)
                        System.out.print(nums2[i] + " ");
                System.out.println();

                System.out.print("массив nums3: ");
                for(int i=0; i<10; i++)
                        System.out.print(nums3[i] + " ");
                System.out.println();

		//Переменная экземпляра lenght
		int[] list = new int[10];
		int[] nums4 = {1,2,3};
		int[][] table1 = {
			{1,2,3},
			{4,5},
			{6,7,8,9},
			{0}
		};
		System.out.println("длина list" + list.lenght);
		System.out.println("длина nums4" + nums4.lenght);
		System.out.println("длина table1" + table1.lenght);
		System.out.println("длина table[0]" + table[0].lenght);
		System.out.println("длина table1[1]" + table1[1].lenght);
		System.out.println("длина table1[2]" + table1[2].lenght);
		System.out.println("длина table1[3]" + table1[3].lenght);
	}

}
