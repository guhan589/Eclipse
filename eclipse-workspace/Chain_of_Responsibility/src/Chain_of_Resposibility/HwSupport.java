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
				if(num % i ==0 ) { //�Ҽ��� 1�� �ڱ��ڽ� �ܿ� ���� ������ ��������� �Ҽ��� �ƴϴ�
					sosu = false;
					break;
				}
			}
			
		}
		
		return sosu;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(calcPrimeNumber(trouble.getNumber()))//true�ϰ�� �Ҽ� false �ϰ�� �Ҽ��� �ƴϴ�
			return true;
		else
			return false;
	}
	
}
