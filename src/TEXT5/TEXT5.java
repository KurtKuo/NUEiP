package TEXT5;

public class TEXT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {77,5,5,22,13,55,97,4,796,1,0,9}; //a陣列
		int[] b = {0,1,2,3,4,5,6,7,8,9};			//b陣列
		
		/******************************************************************************************/
		System.out.printf("a[%d]= { ",a.length);
		for(int aAns:a) {
			System.out.printf("%d ",aAns);
		}//for-each
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		System.out.printf("b[%d]= { ",b.length);
		for(int bAns:b) {
			System.out.printf("%d ",bAns);
		}//for-each
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		System.out.println("1.陣列c = 陣列a 交集 陣列b");
		
		int clength =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					clength ++;
				}
			}	
		}
		//System.out.println(clength);//c陣列長度為6 交集的陣列長度
		int[] c = new int[clength];   //c陣列
		
		
		clength=0;//將長度歸0從頭開始算並列出陣列
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c[clength++] = a[i];
				}
			}	
		}
		System.out.printf("c[%d]= { ",c.length);
		for(int cAns : c) {
			System.out.printf("%d ",cAns);
		}//for-each
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		System.out.println();
		System.out.println("2.陣列d = 陣列a 差集 陣列b");
		//陣列a 差集 陣列b 就是陣列a扣掉交集的部分
		//陣列d 長度
		int dlength = a.length - c.length;
		int[] d = new int[dlength];//d陣列
		dlength=0;
		for(int i=0;i<a.length;i++) {
			int matchCount=0; //這裏做一個計算器，如果一樣就不動作
			for(int j=0;j<c.length;j++) {
				if(a[i]==c[j]) {
					matchCount++; //如果a[]和c[]出現一樣的 就++
				}
			}//for迴圈全部比對完，才會做判斷
				if(matchCount==0) {
					d[dlength++] = a[i];
				}//如果計算器是0就把a[]值指派給d[]
		}
		
		System.out.printf("d[%d]= { ",d.length);
		for(int dAns:d) {
			System.out.printf("%d ",dAns);
		}//for-each
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		System.out.println();
		System.out.println("3.陣列e = 陣列a 聯集 陣列b");
		//陣列a 聯集 陣列b = (陣列a + 陣列b) - (陣列c)*2
		//or  陣列a 聯集 陣列b = 陣列d + 陣列b
		//陣列d = 陣列a 差集 陣列b
		
		int elength = d.length + b.length; //取得陣列e長度
		int[] e = new int[elength];//e陣列
		
		elength = 0;
		for(int i =0;i<d.length;i++) {
			e[elength++] = d[i];
		}
		for(int j =0;j<b.length;j++) {
			e[elength++] = b[j];
		}
		
		System.out.printf("e[%d]= { ",e.length);
		for(int eAns: e) {
			System.out.printf("%d ",eAns);
		}//for-each		
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		
	}
}
