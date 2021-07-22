package TEXT4;

public class TEXT4 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {77,5,5,22,13,55,97,4,796,1,0,9};
		
		//氣泡排序法
		for(int i=0;i<array.length;i++) {		
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					int bubble = array[i];
					array[i] = array[j];
					array[j] = bubble;
				}		
			}//for[j]
		}//for[i]	
		
		System.out.print("array[]: {");
		for(int show : array) {
			System.out.print(show+" ");
		}
		System.out.print("}");
	}	
}
