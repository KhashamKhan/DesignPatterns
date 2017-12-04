
//chain of responsibilty
//ik obj dosry obj mai chain create karta hai

package pattterns;
import java.util.List;

public interface IdentifyProb {
    public String ProblemName();
    public float ProblemCost();
    public void setNextChain(IdentifyProb nextChain);
    public void SolveProblem(Bike Bike,List<IdentifyProb> problem);


}
