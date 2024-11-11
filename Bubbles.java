//пузырьковая сортировка
class Bubbles{
	public static void main(String[] args) {
		int[] nums = {34, 353, 521, 24, -242, -12, 583, 32, 122, -44};
		int a, b, t, vnesh=0, vnutr=0;
		int sixe;

		size = 10;

		//отображение исходного массива
		Sysyem.out.println("исходный массив ");
		for(int i = 0; i<size; i++)
			System.out.println(" " + nums[i]);
		System.out.println();
		//Сортировка
		for(a = 1; a < size; a++) {
			System.out.println("итерация" + a + "внешний цикл");
			vnesh++;
			for(b = size-1; b>=a; b--) {
				System.out.println("итерация" + b + "внешний цикл");
				vnutr++;
				if(nums[b-1] > nums[b]) {
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}	
			}
		}		
		//отображение отсортированного массива
		System.out.print("отсортированный массив");
		for(int i = 0; i<size; i++)
                        System.out.println(" " + nums[i]);
           	System.out.println();    
	       	System.out.println("кол внешних проходов" + vnesh + "\nколичество внутренних проходов:" + vnutr);
		System.out.println();
	}	
}
