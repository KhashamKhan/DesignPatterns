package pattterns;
import java.util.List;
//singleton


public class OilChange  implements IdentifyProb {
    @Override
    public String ProblemName() {
        return "OilChange";
    }

    @Override
    public float ProblemCost() {
        return 3000;
    }

    private IdentifyProb nextInChain;

    @Override
    public void setNextChain(IdentifyProb nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Bike Bike, List<IdentifyProb> problem) {
        if(new ProblemIdentifier().IdentifyProblem("OilChange",problem))
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
