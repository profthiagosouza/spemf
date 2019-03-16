/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.workProduct
* Class: CreateWorkProduct.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.workProduct;

import java.io.IOException;

import model.spem.Process;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.WorkProduct;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import control.processRole.RetrieveProcessRole;
import control.util.Keyboard;



public class CreateWorkProduct
{
	public void createWorkProduct(Resource resource)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		Process process = fac.createProcess();
		process = (Process) resource.getContents().get(0);
		WorkProduct workProduct = fac.createWorkProduct();
		System.out.println("Inform the name of the WorkProduct: ");
		workProduct.setName(Keyboard.readString());
		System.out.println("Do you need to associate to a ProcessRole? [Y] Yes [N] No" );
		char opWp = Keyboard.readChar();
		if ((opWp == 'Y') || (opWp == 'y'))
		{
			RetrieveProcessRole retrieveRoles = new RetrieveProcessRole();
			retrieveRoles.retrieveProcessRole(resource);
			System.out.println("Inform the index of the ProcessRole: ");
			int indexRole = Keyboard.readInt();
			ProcessRole processRole = fac.createProcessRole();
			processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + indexRole);	
			workProduct.setResponsibleRoles(processRole);
		}
		process.getWorkProduct().add(workProduct);
		
		try
		{
			resource.save(null);
			System.out.println("WorkProduct created with success!");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
