package pattterns;
import java.util.List;
//observer pattern
public class tunning  implements IdentifyProb {
    @Override
    public String ProblemName() {
        return "tunning";
    }

    @Override
    public float ProblemCost() {
        return 10000;
    }

    private IdentifyProb nextInChain;

    @Override
    public void setNextChain(IdentifyProb nextChain)
    {
        setNextInChain(nextChain);
    }
    public void SolveProblem(Bike Bike, List<IdentifyProb> problem) {
        if(new ProblemIdentifier().IdentifyProblem("tunning",problem))
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

	public IdentifyProb getNextInChain() {
		return nextInChain;
	}

	public void setNextInChain(IdentifyProb nextInChain) {
		this.nextInChain = nextInChain;
	}
}
