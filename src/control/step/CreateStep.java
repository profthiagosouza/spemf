/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.step
* Class: CreateStep.java
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


public class CreateStep
{
	public void createStep(Resource resource)
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
		retrieveActivities.retrieveActivityStep(resource, indexActivity);
		System.out.println("Inform the name of the new Step: ");
		String stepName = Keyboard.readString();
		Step step = fac.createStep();
		step.setName(stepName);
		
		try
		{
			activity.getSteps().add(step);
			resource.save(null);
			System.out.println("Step created with success!");
		}
		catch (IOException e)
		{
			System.out.println("This control.step shouldn't be created.");
		}
	}
}
