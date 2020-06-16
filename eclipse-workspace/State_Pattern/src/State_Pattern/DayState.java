package State_Pattern;

public class DayState implements State{
	private static DayState singleton = new DayState();
	public DayState() {
	}
	public static State getInstance() {
		return singleton;
	}
	@Override
	public void doClock(Context context, int hour) {
		
		if(hour>=23 && hour <24) { //야식시간
			System.out.println("++++++++++++++++++");
			context.changeState(Late_night_meal_State.getInstance());
		}else if(hour < 9 || hour>=17) {//야간
			context.changeState(NightState.getInstance());
		}
		
	}
	@Override
	public void doUse(Context context) {
		context.recordLog("금고사용(주간)");
	}
	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(주간)");
	}
	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("일반통화(주간)");
	}
	public String toString() {
		return "[주간]";
	}

}
