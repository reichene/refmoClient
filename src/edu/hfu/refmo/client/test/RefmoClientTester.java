package edu.hfu.refmo.client.test;

import edu.hfu.refmo.client.Action;
import edu.hfu.refmo.client.Category;
import edu.hfu.refmo.client.Condition;
import edu.hfu.refmo.client.Conjunction;
import edu.hfu.refmo.client.ReferenceMonitor;
import edu.hfu.refmo.client.Resource;
import edu.hfu.refmo.client.RulePriority;
import edu.hfu.refmo.client.Subject;
import edu.hfu.refmo.client.Condition.Comparision;
import edu.hfu.refmo.client.Conjunction.Function;

public class RefmoClientTester {

	public static void main(String[] args) {


		new RefmoClientTester().test();

	}
	
	public void test(){
		
		  /***
		   * 
		   * TEST ReferencMonitor Client
		   */
		  try{
			
			  /***
			   * 
			   * TEST ReferencMonitor Client
			   */
			  
				
				Category[] cats_up = new Category[4];
				Category[] cats = new Category[4];
				cats[0] = new RulePriority(new Condition(Comparision.EQUAL, "rulep", "asd"));
				cats[1] = new Action(new Condition(Comparision.EQUAL, "action", "asd"));
				cats[2] = new Subject(new Condition(Comparision.EQUAL, "subject", "asd"));
				cats[3] = new Resource(new Condition(Comparision.EQUAL, "resource", "asd"));
				
				cats_up[0] = new RulePriority(new Condition(Comparision.EQUAL, "asd", "asd"));
				cats_up[1] = new Action(new Condition(Comparision.EQUAL, "asd", "asd"));
				cats_up[2] = new Subject(new Condition(Comparision.EQUAL, "asd", "asd"));
				cats_up[3] = new Resource(new Condition(Comparision.EQUAL, "asd", "asd"));	
				
						
			
				ReferenceMonitor rm = new ReferenceMonitor("http://serious-bearing-580.appspot.com/");
				rm.createRule("martin reichendecker", cats);
				rm.updateRule(cats, cats_up);
				rm.deleteRule(cats);
				rm.authorize(true,cats);
			
			
		  }
		  catch(Exception e){ e.printStackTrace();}
	}
}
