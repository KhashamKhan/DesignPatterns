package pattterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//builder pattern
public class TakingInput {
    String[] input=new String[8];
    String[] inputCaptured=new String[5];
int count=0;
    public List<IdentifyProb> TakeInput(String name,String RegNum)
    {
        for(int i=0;i<inputCaptured.length;i++)
        {
            inputCaptured[i]="";
        }
      input[0]="0:Brake Problem";
      input[1]="1:Engine Problem";
      input[2]="2:Fuel Problem";
      input[3]="3:Oil Change";
      input[4]="4:Tunning Problem";
      input[5]="5:Suspension Problem";
      input[6]="6:Wheel Problem";
      input[7]="7:Start working on it";
        while(true) {
            String items=ShowItem();
            if(!(items.equals("")))
                System.out.println("Current Item(s) in cart : "+ items.substring(2));
            System.out.println("Identify Basic Problem with your " + name);
          for(int i=0;i<input.length;i++)
          {
              boolean flag=false;
              for (int j=0;j<inputCaptured.length;j++)
              {
                  if(!(inputCaptured[j].equals("")))
                  {
                      if(inputCaptured[j].equals(String.valueOf(i)))
                      {
                          flag=true;
                      }
                  }
              }
              if(!flag)
                    System.out.println(input[i]);
          }

            System.out.println("Select Option :  ");
            sc = new Scanner(System.in);
            String option = sc.nextLine();
            if(Integer.parseInt(option) < 7) {
                MyProbs.add(option.equals("0") ? new BrakeProblem() : option.equals("2") ? new FuelProblem() : option.equals("1") ? new EngineProblem() : option.equals("3") ? new OilChange() : option.equals("4") ? new tunning() :option.equals("5") ? new SuspensionProblem() :option.equals("6") ? new WheelProblem() : null);
            inputCaptured[count]=option;
            count=count+1;
            }
            else
            {
              //  String[] ProbToSolve=RectifyMeName(inputCaptured);
                return MyProbs;
            }        }


    }


    
    static List<IdentifyProb> MyProbs=new ArrayList<IdentifyProb>();
	private Scanner sc;

    public void addItem(IdentifyProb item)
    {
        MyProbs.add(item);
    }
    public float TotalCost()
    {
        float cost=0;
        for(IdentifyProb item :MyProbs)
        {
            cost+=item.ProblemCost();
        }
        return cost;
    }
    public String ShowItem()
    {
        String msg="";
        for(IdentifyProb item: MyProbs)
        {
            msg+=" , "+item.ProblemName();
        }
        return  msg;
    }
}
