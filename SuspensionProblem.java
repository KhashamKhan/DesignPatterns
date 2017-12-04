package pattterns;

import java.util.List;

public class SuspensionProblem implements IdentifyProb {
    public String ProblemName() {
        return "Suspension Problem";
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
        if(new ProblemIdentifier().IdentifyProblem("SuspensionProblem",problem))
        {
            nextInChain.SolveProblem(Bike,problem);
        }
        else
        {

        	TakingInput ti = new TakingInput();
        	System.out.println(ti.ShowItem());
        	System.out.println(ti.TotalCost());        }
    }
}
