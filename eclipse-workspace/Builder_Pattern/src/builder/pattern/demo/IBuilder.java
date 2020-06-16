package builder.pattern.demo;

public interface IBuilder {
	void BuildeBody(); //몸체생성
	void InsertWheels(); //휠생설
	void AddHeadlights(); //헤드라이트 추가
	Product GetVehicle(); //탈것 객체 가져오기
}
