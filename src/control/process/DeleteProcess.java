/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.process
* Class: DeleteProcess.java
* Author: Thiago
* Date: 28/01/2006
* Class description: 
**************************************************
*/

package control.process;

import model.spem.Process;
import model.spem.Spem2Factory;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;


public class DeleteProcess
{	
	/**
	 * Method used to delete a control.process
	 * @param resource
	 */
	public void deleteProcess(Resource resource)
	{
		RetrieveProcess retrieveProcess = new RetrieveProcess();
		retrieveProcess.retrieveProcess(resource);
		System.out.println("\nTrying to delete a control.process...\n");
		
		try
		{
			Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
			Process process = fac.createProcess();
			process = (Process) resource.getContents().get(0);
			resource.getContents().remove(process);
			resource.save(null);
		}
		catch (IndexOutOfBoundsException e)
		{
			if (retrieveProcess.ioError != true)
			{
				System.out.println("Process excluded with success!");
			}
			else
			{
				System.out.println("Process doesn't exist!");
			}
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}