/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.processRole
* Class: RetrieveProcessRole.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.processRole;

import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;


public class RetrieveProcessRole
{
	public void retrieveProcessRole(Resource resource)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		ProcessRole processRole = fac.createProcessRole();
		System.out.println("List of ProcessRoles:\n");
		try
		{
			for (int i=0; ; i++)
			{
				processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + i);	
				System.out.println("Index: " + i + " | Name: " + processRole.getName());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("\n##### End of the list #####");
		}		
	}
}
