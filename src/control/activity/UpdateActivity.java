/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.activity
* Class: UpdateActivity.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.activity;

import java.io.IOException;

import model.spem.Activity;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import control.processRole.RetrieveProcessRole;
import control.step.UpdateStep;
import control.util.Keyboard;


public class UpdateActivity
{
	public void updateActivity(Resource resource, int index)
	{
		try
		{
			Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
			Activity activity = fac.createActivity();
			activity = (Activity) resource.getEObject("//@Activity." + index);	
			
			System.out.println("Which the operation do you want execute?");
			System.out.println("[1] Update the name [2] Include ProcessRole [3] Delete ProcessRole [4] Update the Steps [5] Return");
			int op = Keyboard.readInt();
			
			if (op == 1)
			{
				System.out.println("Inform the name of the control.activity: ");
				String nameActivity = Keyboard.readString();
				activity.setName(nameActivity);
			}
			else if (op == 2)
			{
				RetrieveProcessRole processRoles = new RetrieveProcessRole();
				processRoles.retrieveProcessRole(resource);
				System.out.println("Inform the index of the ProcessRole: ");
				int indexRole = Keyboard.readInt();
				ProcessRole processRole = fac.createProcessRole();
				processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + indexRole);	
				activity.getAssistants().add(processRole);
				processRole.getActivities().add(activity);
				resource.save(null);
				System.out.println("ProcessRoles of this control.activity: ");
				for (int i=0; i < activity.getAssistants().size(); i++)
				{
					processRole = (ProcessRole) activity.getAssistants().get(i);
					System.out.println("Index " + i + " | " + processRole.getName());
				}
			}
			else if (op == 3)
			{
				RetrieveProcessRole processRoles = new RetrieveProcessRole();
				processRoles.retrieveProcessRole(resource);
				System.out.println("Inform the index of the ProcessRole: ");
				int indexRole = Keyboard.readInt();
				ProcessRole processRole = fac.createProcessRole();
				processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + indexRole);	
				activity.getAssistants().remove(processRole);
				processRole.getActivities().remove(activity);
			}
			else if (op == 4)
			{
				UpdateStep updateStep = new UpdateStep();
				updateStep.updateStep(resource);
			}
			else if (op == 5)
			{
				return;
			}
			else 
			{
				System.out.println("Inform a valid option!");
			}
						
			resource.save(null);
			System.out.println("\nActivity updated!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
