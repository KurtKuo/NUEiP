package TEXT3;

public class TEXT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,1,2,3,4,5,6,7,8,9};
		
		
		int Odd = 0;
		int Even = 0;
		
		int[] arrayOdd = new int[array.length]; //奇數陣列
		int[] arrayEven = new int[array.length];//偶數陣列
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==1) {
				arrayOdd[Odd] = array[i];
				Odd++;
			}else {
				arrayEven[Even] = array[i];
				Even++;
			}
		}
		System.out.print("ALL陣列：");
		int SumALL = 0;
		int SumOdd = 0;
		int SumEven = 0;
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			SumALL = SumALL + array[i];
		}
		//ALL陣列以及ALL陣列加總
		
		
		System.out.println();
		System.out.print("奇數陣列：");
		for(int o=0;o<Odd;o++) {
			System.out.print(arrayOdd[o]);
			SumOdd = SumOdd + arrayOdd[o];
		}
		//奇數陣列以及奇數陣列加總
		
		
		System.out.println();
		System.out.print("偶數陣列：");
		for(int e=0;e<Even;e++) {
			System.out.print(arrayEven[e]);
			SumEven = SumEven + arrayEven[e];
		}
		//偶數陣列以及偶數陣列加總
		System.out.println();
		
		
		System.out.println("1.奇數值總和 - 偶數值總和:"+ (SumOdd-SumEven));
		System.out.println("2.偶數值陣列及奇數值陣列:");
		System.out.print("arrayEven[]：");
		for(int e=0;e<Even;e++) {
			System.out.print(arrayEven[e]);
			SumEven = SumEven + arrayEven[e];
		}
		//偶數陣列以及偶數陣列加總
		System.out.println();
		System.out.print("arrayOdd[]：");
		for(int o=0;o<Odd;o++) {
			System.out.print(arrayOdd[o]);
			SumOdd = SumOdd + arrayOdd[o];
		}
		//奇數陣列以及奇數陣列加總
		
	}

}
