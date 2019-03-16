/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.activity
* Class: DeleteActivity.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.activity;

import java.io.IOException;

import model.spem.Activity;
import model.spem.Process;

import org.eclipse.emf.ecore.resource.Resource;


public class DeleteActivity
{
	/**
	 * Method used to delete a control.activity
	 * @param resource
	 * @param index
	 */
	public void deleteActivity(Resource resource, int index)
	{
		try
		{
			Process process = (Process) resource.getContents().get(0);
			Activity activity = (Activity) resource.getEObject("//@Activity." + index);	
			
			if (activity.getAssistants().isEmpty())
			{
				process.getActivity().remove(activity);
				resource.save(null);
				System.out.println("Activity deleted!");
			}
			else
			{
				System.out.println("This control.activity shouldn't be excluded because it is been referenced.");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
