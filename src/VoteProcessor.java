import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> a) {
		int francis=0;
		int snowden=0;
		for(int i=0; i< a.size();i++) {
			if(a.get(i).equalsIgnoreCase("pope francis"))
				francis++;
			else
				snowden++;
		}
		if(francis>snowden) 
			return "pope francis";
		else if(snowden>francis)
			return "edward snowden";
		else 
			return "TIE";
	}
}
