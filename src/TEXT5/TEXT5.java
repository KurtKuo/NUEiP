package TEXT5;

public class TEXT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] a = {77,5,5,22,13,55,97,4,796,1,0,9};
			int[] b = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("1.陣列c = 陣列a 交集 陣列b");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					int show = a[i];
					System.out.print(show+".");
				}
			}//for j
		}//for i	
		System.out.println();
		System.out.println("2.陣列d = 陣列a 差集 陣列b");

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				if(a[i]!=b[j]) {
					//TODO
				}
				
			}//for j
		}//for i	
		
	}
}
