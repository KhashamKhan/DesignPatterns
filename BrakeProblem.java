package pattterns;
import java.util.List;
//singleton
public class BrakeProblem implements IdentifyProb {
    @Override
    public String ProblemName() {
        return "BrakeProblem";
    }

    @Override
    public float ProblemCost() {
        return 30;
    }

    private IdentifyProb nextInChain;

    @Override
    public void setNextChain(IdentifyProb nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Bike Bike, List<IdentifyProb> problem) {
        if(new ProblemIdentifier().IdentifyProblem("BrakeProblem",problem))
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
