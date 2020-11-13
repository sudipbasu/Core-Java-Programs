package bbit_assignments;

public class SpyNumber1 {
	int rem,sum=0,prod=1,num;
	
	  boolean spy_check(int n)
	  {
		  
		  	
		  	  
		  while(n!=0)
		  {
			  rem=n%10;
			  
			  sum=sum+rem;
			  prod=prod*rem;
			  
			  n=n/10;  
			  
			  
		  }
		  
		  
		  if(sum==prod)
		  {
			  return true;
			  
		  }
		  
		  
		  else
		  {
			  return false;
		  }
		  
		  
		  
		  
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1124;
		boolean result;
		SpyNumber1 obj=new SpyNumber1();
		
		result=obj.spy_check(num);
		
		if (result==true)
		{
			System.out.println("It is a spy no");
			
		}
		
		else
		{
			
			System.out.println("not spy no");
		}
	}

}
