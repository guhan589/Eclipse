package factory.pattern.demo;

public abstract class IAnimalFactory {
	public abstract IAnimal GetAnimalType(String type) throws Exception;
}
