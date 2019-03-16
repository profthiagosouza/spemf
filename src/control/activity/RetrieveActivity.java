/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.activity
* Class: RetrieveActivity.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.activity;

import model.spem.Activity;
import model.spem.Spem2Factory;
import model.spem.Step;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;



public class RetrieveActivity
{
	/**
	 * Method used to retrieve activities
	 * @param resource
	 */
	public void retrieveActivity(Resource resource)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		Activity activity = fac.createActivity();
		System.out.println("List of Activities:\n");
		try
		{
			for (int i=0; ; i++)
			{
				activity = (Activity) resource.getEObject("//@Activity." + i);	
				System.out.println("Index: " + i + " | Name: " + activity.getName());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("\n##### End of the list #####");
		}	
	}
	
	public void retrieveActivityStep(Resource resource, int index)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		Activity activity = fac.createActivity();
		try
		{
			activity = (Activity) resource.getEObject("//@Activity." + index);
			System.out.println("Activity: " + activity.getName() + " - List of Steps:\n");
			try
			{
				for (int m=0; m < activity.getSteps().size(); m++)
				{
					Step step = fac.createStep();
					step = (Step) activity.getSteps().get(m);
					System.out.println("Step " + m + ": " + step.getName());
				}
				System.out.println("\n##### End of the list #####");
			}
			
			catch(NullPointerException e)
			{
				System.out.println("\n##### End of the list #####");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("\nInform a valid option!");
			return;
		}
	}
}
