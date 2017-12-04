package pattterns;
import java.util.List;
public class EngineProblem implements IdentifyProb {
    @Override
    public String ProblemName() {
        return "EngineProblem";
    }

    @Override
    public float ProblemCost() {
        return 65;
    }

    private IdentifyProb nextInChain;

    @Override
    public void setNextChain(IdentifyProb nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Bike Bike, List<IdentifyProb> problem) {
        if(new ProblemIdentifier().IdentifyProblem("EngineProblem",problem))
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
