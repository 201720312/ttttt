package ttttt;

public class njjj {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,n=0,ov=0,q=0;
		char o='+';
		for(int i=0;i<200;i++){
			ov=(int)(Math.random()*2);
			m=(int)(Math.random()*100);
			n=(int)(Math.random()*100);
			if(ov==1){
				o='+';{
					if(m+n>100) 
						continue;
				}
			}else {
				o='-';{
					if(m-n<0)
						continue;
				}
			}
			q++;
			if(q>50)
				continue;
			if((q-1)%5==0)
				System.out.println();
			System.out.print(""+q+":\t"+m+o+n+"="); 
				sum(m,n,ov);
		}
	}
	public static void sum(int m,int n,int ov){
		int x;
		if(ov==1){
			x=m+n;
		}
		else{
			x=m-n;
		}
		System.out.print(x);
		System.out.print("  ");
	}
}

