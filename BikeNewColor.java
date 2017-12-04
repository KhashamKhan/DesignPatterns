package pattterns;

public class BikeNewColor extends NewBike{

	@Override
	public Color GetColor (String MyColor)
	{
		if(MyColor == null)
		{
			return null;
		}
		if(MyColor.equalsIgnoreCase("Red")){
			return new RedColor();
		}
		else if(MyColor.equalsIgnoreCase("Black")){
			return new BlackColor();
		}
		return null;
	}
	@Override
public Engine GetEngine(String EngineHp)
	{
		return null;
	}
}
