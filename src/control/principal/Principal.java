/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.principal
* Class: Principal.java
* Author: Thiago
* Date: 28/01/2006
* Class description: 
**************************************************
*/

package control.principal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import control.process.CreateProcess;
import control.process.DeleteProcess;
import control.process.RetrieveProcess;
import control.process.UpdateProcess;
import control.util.Keyboard;


public class Principal
{	
	private static Resource resource;
	/**
	 * Main method of the application to choose the operation that the user wants to execute
	 * (Create, retrieve, update and delete control.process, and exit of the application) 
	 * @param args
	 */
	public static void main(String[] args)
	{		
		System.out.println("SPemf: EMF-based SPEM processes");		
		byte choice = 0;

		while (choice != 5)
		{
			resource = new XMLResourceImpl(URI.createURI(""));
			System.out.println("\nWhich operation do you want to execute?");
			System.out.println("[1] Create control.process, [2] Retrieve control.process, [3] Update control.process, [4] Delete control.process, [5] Exit");
			choice = Keyboard.readByte();

			if (choice == 1)
			{
				CreateProcess createProcess = new CreateProcess();
				createProcess.createProcess(resource);
			}
			else if (choice == 2)
			{
				RetrieveProcess retrieveProcess = new RetrieveProcess();
				retrieveProcess.retrieveProcess(resource);
			}
			else if (choice == 3)
			{
				UpdateProcess updateProcess = new UpdateProcess();
				updateProcess.updateProcess(resource);
				
			}
			else if (choice == 4)
			{
				DeleteProcess deleteProcess = new DeleteProcess();
				deleteProcess.deleteProcess(resource);
			}
			else if (choice == 5)
			{				
				System.out.println("Application finished");
				resource = null;
				System.exit(1);
			}
			else
			{
				System.out.println("Inform a valid option!");
			}
		}	
	}	
}