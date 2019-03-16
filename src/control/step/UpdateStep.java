/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.step
* Class: UpdateStep.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.step;

import java.io.IOException;

import model.spem.Activity;
import model.spem.Process;
import model.spem.Spem2Factory;
import model.spem.Step;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import control.activity.RetrieveActivity;
import control.util.Keyboard;


public class UpdateStep
{
	public void updateStep(Resource resource)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		Process process = fac.createProcess();
		process = (Process) resource.getContents().get(0);
		RetrieveActivity retrieveActivities = new RetrieveActivity();
		retrieveActivities.retrieveActivity(resource);
		Activity activity = fac.createActivity();
		System.out.println("Inform the index of the Activity: ");
		int indexActivity = Keyboard.readInt();
		activity = (Activity) resource.getEObject("//@Activity." + indexActivity);
		
		RetrieveActivity retrieveSteps = new RetrieveActivity();
		retrieveSteps.retrieveActivityStep(resource, indexActivity);
		
		System.out.println("Inform the index of the control.step: ");
		int indexStep = Keyboard.readInt();
		Step step = (Step) activity.getSteps().get(indexStep);
		
		System.out.println("Which the operation do you want execute?");
		System.out.println("[1] Update the name [2] Update the Activity [3] Return");
		int op = Keyboard.readInt();
		
		if (op == 1)
		{
			System.out.println("Inform the name of the control.step: ");
			String nameStep = Keyboard.readString();
			step.setName(nameStep);
		}
		else if (op == 2)
		{
			retrieveActivities.retrieveActivity(resource);
			System.out.println("Inform the index of the control.activity to associate: ");
			int indexNewActivity = Keyboard.readInt();
			activity = (Activity) resource.getEObject("//@Activity." + indexNewActivity);
			activity.getSteps().add(step);
		}
		else if (op == 3)
		{
			return;
		}
		else 
		{
			System.out.println("Inform a valid option!");
		}
		
		try
		{
			resource.save(null);
			System.out.println("Step updated with success!");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
