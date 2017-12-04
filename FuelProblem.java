package pattterns;
import java.util.List;
public class FuelProblem implements IdentifyProb {
    @Override
    public String ProblemName() {
        return "FuelProblem";
    }

    @Override
    public float ProblemCost() {
        return 500;
    }


    private IdentifyProb nextInChain;

    @Override
    public void setNextChain(IdentifyProb nextChain)
    {
        nextInChain = nextChain;
    }

    @Override

    public void SolveProblem(Bike Bike, List<IdentifyProb> problem) {
        if(new ProblemIdentifier().IdentifyProblem("FuelProblem",problem))
        {
            nextInChain.SolveProblem(Bike,problem);
        }
        else
        {

        	TakingInput ti = new TakingInput();
        	System.out.println(ti.ShowItem());
        	System.out.println("TotalCost :");
        	System.out.println(ti.TotalCost());
        }
    }
}
