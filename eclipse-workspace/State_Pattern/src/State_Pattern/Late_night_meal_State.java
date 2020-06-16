package State_Pattern;

public class Late_night_meal_State implements State {
	
	private static Late_night_meal_State singletone = new Late_night_meal_State();
	public Late_night_meal_State() {
	}
	public static Late_night_meal_State getInstance() {
		return singletone;
	}
	@Override
	public void doClock(Context context, int hour) {
		if(hour < 9 || hour>=17) {
			context.changeState(NightState.getInstance());
		}else if(hour >= 9 && hour <12 || 13<=hour && hour<17) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("비상: 야식시간 금고 사용!!");
	}
	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("비상벨(야식시간)");
	}
	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("야식시간통화 녹음");
	}
	public String toString() {
		return "[야식시간]";
	}


}
