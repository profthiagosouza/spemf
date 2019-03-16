/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.processRole
* Class: CreateProcessRole.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.processRole;

import java.io.IOException;

import model.spem.Activity;
import model.spem.Process;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import control.activity.RetrieveActivity;
import control.util.Keyboard;



public class CreateProcessRole
{
	public void createProcessRole(Resource resource)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		Process process = fac.createProcess();
		process = (Process) resource.getContents().get(0);
		ProcessRole processRole = fac.createProcessRole();
		System.out.println("Inform the name of the ProcessRole: ");
		processRole.setName(Keyboard.readString());
		boolean need = true;
		while (need == true)
		{
			System.out.println("Do you need to associate to a Activity? [Y] Yes [N] No" );
			char opPr = Keyboard.readChar();
			if ((opPr == 'Y') || (opPr == 'y'))
			{
				RetrieveActivity retrieveActivities = new RetrieveActivity();
				retrieveActivities.retrieveActivity(resource);
				System.out.println("Inform the index of the Activity: ");
				int indexActivity = Keyboard.readInt();
				Activity activity = fac.createActivity();
				activity = (Activity) resource.getEObject("//@Activity." + indexActivity);	
				processRole.getActivities().add(activity);
				activity.getAssistants().add(processRole);//testar
			}
			else
			{
				need = false;
			}					
		}

		process.getProcessRole().add(processRole);
		resource.getContents().add(process);

		try
		{
			resource.save(null);
			System.out.println("ProcessRole created with success!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
