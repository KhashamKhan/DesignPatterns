package pattterns;
import java.util.List;
public class ProblemIdentifier {
    public boolean IdentifyProblem(String request, List<IdentifyProb> probs)
    {
        for(IdentifyProb item: probs)
        {
           if(request.equals(item.ProblemName()))
           {
               return true;
           }
             
        }
        return false;
    }
}
