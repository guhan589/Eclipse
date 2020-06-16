package State_Pattern;

public class NightState implements State{
	private static NightState singleton = new NightState();
	public NightState() {
	
	}
	public static NightState getInstance() {
		return singleton;
	}
	@Override
	public void doClock(Context context, int hour) {
		
		if(hour>=23 && hour<24) {//�߽Ľð�
			System.out.println("++++++++++++++++++");
			context.changeState(Late_night_meal_State.getInstance());
		}else if(hour >= 9 && hour <17) { //�ְ�
			context.changeState(DayState.getInstance());
		}
	}
	@Override
	public void doUse(Context context) {
		context.recordLog("���: �߰��ݰ� ���!!");
	}
	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���(�߰�)");
	}
	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("�߰���ȭ ����");
	}
	public String toString() {
		return "[�߰�]";
	}

}
