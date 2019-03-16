/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.workProduct
* Class: RetrieveWorkProduct.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.workProduct;

import model.spem.Spem2Factory;
import model.spem.WorkProduct;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;



public class RetrieveWorkProduct
{
	public void retrieveWorkProduct(Resource resource)
	{
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		WorkProduct workProduct = fac.createWorkProduct();
		System.out.println("List of WorkProducts:\n");
		try
		{
			for (int i=0; ; i++)
			{
				workProduct = (WorkProduct) resource.getEObject("//@WorkProduct." + i);	
				System.out.println("Index: " + i + " | Name: " + workProduct.getName());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("\n##### End of the list #####");
		}
	}
}
