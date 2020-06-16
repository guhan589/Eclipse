package Chain_of_Resposibility;

public class HwSupport extends Support{
	
	private int number;
	int count =0;
	public HwSupport(String name) {
		super(name);
		//this.number = num;
	}
	
	public boolean calcPrimeNumber(int num) {
		boolean sosu = true;
		if(num==0||num==1) {
			sosu = false;
		}else {
			for(int i = 2; i< num;i++) {
				if(num % i ==0 ) { //소수는 1과 자기자신 외에 값에 나누어 떨어질경우 소수가 아니다
					sosu = false;
					break;
				}
			}
			
		}
		
		return sosu;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(calcPrimeNumber(trouble.getNumber()))//true일경우 소수 false 일경우 소수가 아니다
			return true;
		else
			return false;
	}
	
}
