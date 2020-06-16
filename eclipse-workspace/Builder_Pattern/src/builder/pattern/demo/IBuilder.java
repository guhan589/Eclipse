package builder.pattern.demo;

public interface IBuilder {
	void BuildeBody(); //��ü����
	void InsertWheels(); //�ٻ���
	void AddHeadlights(); //������Ʈ �߰�
	Product GetVehicle(); //Ż�� ��ü ��������
}
