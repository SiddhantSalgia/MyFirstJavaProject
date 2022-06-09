import com.globalpayex.bank.entities.Account;
import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class CreateAccount 
{
	public static void main(String[] args) 
	{
		Account ac = new Account(260800,15000,"Current");
		//System.out.println(ac.diposit(200));
		
		
		/*{
			System.out.println(ac.withdraw(50));
		}catch(IllegalStateException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		try {
			System.out.println(ac.withdraw(90000));
		} catch (MinBalNotMaintainedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
