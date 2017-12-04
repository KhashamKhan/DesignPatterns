package pattterns;

import java.util.List;
import java.util.Scanner;

public class RepairBike {
	Scanner sc;
    public void RepairMyBike()
    {
    	//chain of responsibilty;
    	IdentifyProb problem1=new BrakeProblem();
    	IdentifyProb problem2=new FuelProblem();
    	IdentifyProb problem3=new EngineProblem();
    	IdentifyProb problem4=new OilChange();
    	IdentifyProb problem5=new tunning();
    	IdentifyProb problem6=new SuspensionProblem();
    	IdentifyProb problem7=new WheelProblem();

        problem1.setNextChain(problem2);
        problem2.setNextChain(problem3);
        problem3.setNextChain(problem4);
        problem4.setNextChain(problem5);
        problem5.setNextChain(problem6);
        problem6.setNextChain(problem7);
        System.out.println("Enter Your Bike Model ?");
        sc = new Scanner(System.in);
        String ModelName= sc.nextLine();
        System.out.println("Enter Your Bike registration num ?");
        String RegNum= sc.nextLine();
        List<IdentifyProb> MyProbs= new TakingInput().TakeInput(ModelName,RegNum);

        System.out.println("Working Started");


        Bike Bike= new Bike(ModelName,RegNum);
        problem1.SolveProblem(Bike,MyProbs);
    }


}
