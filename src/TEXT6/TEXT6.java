package TEXT6;


public class TEXT6 {

	public static void main(String[] args) {
		/**第一個限制條件：*******************************/
		int numlength = (int)(Math.random()*102)+2; //2~103 記得扣掉0
		/**第二個限制條件：*******************************/
		int[] nums = new int[numlength];//創建一個陣列nums	
		
		for(int i=0;i<numlength;i++) {
			nums[i] = (int)(Math.random()*219)-109;
		}//陣列給值
		
		//nums[numlength] = (int)(Math.random()*219)-109; //-109~109 記得扣掉0
		/**第三個限制條件：*******************************/
		int target = (int)(Math.random()*219)-109; //-109~109 記得扣掉0
		
		System.out.print("輸入： nums =[ ");
		for(int numAns:nums) {
			System.out.printf("%d ",numAns);
		}
		
		System.out.print("] , target = ");
		System.out.printf("%d",target);
		System.out.println();
		
		for(int i=0;i<numlength;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					if(j==i+1) {
					System.out.print("輸出： [");
					System.out.print(i+","+j+"]");
					System.out.println();
					System.out.print("輸出： 因為nums ["+i+"]"+" + "+"nums ["+j+"]"+" == "+target+" 所以我們返回 ["+i+","+j+"]");
					}//小if
				}//if
			}//for小
		}//for大
	}
}
