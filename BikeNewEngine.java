package pattterns;

public class BikeNewEngine extends NewBike{

	@Override
public	Engine GetEngine(String EngineHp)
	{
		if(EngineHp == null){
			return null;
		}
		if(EngineHp.equalsIgnoreCase("hundredHp")){
			return new HundredHp();
		}
		else if(EngineHp.equalsIgnoreCase("OnefiftyHp")){
			return new OnefiftyHp();
		}
		return null;
	}
	@Override
 Color GetColor (String MyColor)
	{
		return null;
	}

}
