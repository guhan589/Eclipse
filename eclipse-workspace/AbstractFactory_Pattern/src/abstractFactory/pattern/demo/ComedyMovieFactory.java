package abstractFactory.pattern.demo;

public class ComedyMovieFactory implements IMovieFactory{

	@Override
	public ITollywoodMovie GetTollywoodMovie() {
		return new TollywoodComedyMovie();
	}

	@Override
	public IBollywoodMovie GetBollywoodMovie() {
		// TODO Auto-generated method stub
		return new BollywoodComedyMovie();
	}
	
}
