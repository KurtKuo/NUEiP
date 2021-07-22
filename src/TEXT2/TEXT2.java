package TEXT2;

public class TEXT2 {

	public static void main(String[] args) {

			String str = "「人易科技:上 績 測 驗 - 演算法」";
			System.out.println(str);
			
			System.out.println("======");
			System.out.println("題目1.");
			str = str.replace(":","：");
			System.out.println(str);
			//將:改為：
			
			
			System.out.println("======");
			System.out.println("題目2.");
			str = str.replace(" ","");
			str = str.replace("-"," - ");
			System.out.println(str);
			//先將所有空白截為空字串，並將-轉為 - 
			
			
			
			System.out.println("======");
			System.out.println("題目3.");
			int first = str.indexOf("：");
			int end = str.indexOf("-");
			
			System.out.println(str.subSequence(first+1, end));
			//之間不包含：
	}

}
