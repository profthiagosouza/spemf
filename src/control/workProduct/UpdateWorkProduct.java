/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.workProduct
* Class: UpdateWorkProduct.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.workProduct;

import java.io.IOException;

import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.WorkProduct;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import control.processRole.RetrieveProcessRole;
import control.util.Keyboard;


public class UpdateWorkProduct
{
	public void updateWorkProduct(Resource resource, int index)
	{
		try
		{
			Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
			WorkProduct workProduct = fac.createWorkProduct();
			workProduct = (WorkProduct) resource.getEObject("//@WorkProduct." + index);	
			
			System.out.println("Which the operation do you want execute?");
			System.out.println("[1] Update the name [2] Change the ProcessRole [3] Delete the Process Role [4] Return");
			int op = Keyboard.readInt();
			
			if (op == 1)
			{
				System.out.println("Inform the name of the product: ");
				String nameProduct = Keyboard.readString();
				workProduct.setName(nameProduct);
			}
			else if (op == 2)
			{
				RetrieveProcessRole processRoles = new RetrieveProcessRole();
				processRoles.retrieveProcessRole(resource);
				System.out.println("Inform the index of the ProcessRole: ");
				int indexRole = Keyboard.readInt();
				ProcessRole processRole = fac.createProcessRole();
				processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + indexRole);	
				workProduct.setResponsibleRoles(processRole);
				processRole.getWorkProducts().add(workProduct);
			}
			else if (op == 3)
			{
				ProcessRole processRole = fac.createProcessRole();
				System.out.println("ProcessRoles of this WorkProduct: \n");
				for (int i=0; i < processRole.getWorkProducts().size(); i++)
				{
					processRole = (ProcessRole) workProduct.getResponsibleRoles();
					System.out.println("Index " + i + " | " + "ProcessRole " + processRole.getName());
				}
				workProduct.setResponsibleRoles(null);
				processRole.getWorkProducts().remove(workProduct);
				resource.save(null);
			}
			else if (op == 4)
			{
				return;
			}
			else 
			{
				System.out.println("Inform a valid option!");
			}
						
			resource.save(null);
			System.out.println("WorkProduct updated!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
