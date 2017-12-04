package pattterns;

import java.util.List;

public class WheelProblem implements IdentifyProb {
    public String ProblemName() {
        return "Wheel Problem";
    }

    @Override
    public float ProblemCost() {
        return 800;
    }

    private IdentifyProb nextInChain;

    @Override
    public void setNextChain(IdentifyProb nextChain)
    {
        nextInChain = nextChain;
    }
    public void SolveProblem(Bike Bike, List<IdentifyProb> problem) {
        if(new ProblemIdentifier().IdentifyProblem("WheelProblem",problem))
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
