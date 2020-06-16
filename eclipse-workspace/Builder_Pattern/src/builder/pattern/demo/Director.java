package builder.pattern.demo;

public class Director {
	IBuilder myBuilder;
	public void Construct(IBuilder builder) {
		myBuilder = builder;
		myBuilder.BuildeBody();
		myBuilder.InsertWheels();
		myBuilder.AddHeadlights();
	
	}
}
