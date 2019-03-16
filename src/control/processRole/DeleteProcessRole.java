/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.processRole
* Class: DeleteProcessRole.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.processRole;

import java.io.IOException;

import model.spem.Process;
import model.spem.ProcessRole;

import org.eclipse.emf.ecore.resource.Resource;


public class DeleteProcessRole
{
	public void deleteProcessRole(Resource resource, int index)
	{
		try
		{
			Process process = (Process) resource.getContents().get(0);
			ProcessRole processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + index);	
			
			if (processRole.getActivities().isEmpty() && processRole.getWorkProducts().isEmpty())
			{
				process.getProcessRole().remove(processRole);
				resource.save(null);
				System.out.println("ProcessRole deleted!");
			}
			else
			{
				System.out.println("This role shouldn't be excluded because it is been referenced.");
			}

		}	
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
