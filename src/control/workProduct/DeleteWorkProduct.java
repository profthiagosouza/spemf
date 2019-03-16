/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.workProduct
* Class: DeleteWorkProduct.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.workProduct;

import java.io.IOException;

import model.spem.Process;
import model.spem.WorkProduct;

import org.eclipse.emf.ecore.resource.Resource;


public class DeleteWorkProduct
{
	public void deleteWorkProduct(Resource resource, int index)
	{
		try
		{	
			Process process = (Process) resource.getContents().get(0);
			WorkProduct workProduct = (WorkProduct) resource.getEObject("//@WorkProduct." + index);	

			if (workProduct.getResponsibleRoles() == null)
			{
				process.getWorkProduct().remove(workProduct);
				resource.save(null);
				System.out.println("WorkProduct deleted!");
			}
			else
			{
				System.out.println("This work product shouldn't be excluded because it is been referenced.");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
