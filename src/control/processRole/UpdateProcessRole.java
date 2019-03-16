/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.processRole
* Class: UpdateProcessRole.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.processRole;

import java.io.IOException;

import model.spem.Activity;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.WorkProduct;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import control.activity.RetrieveActivity;
import control.util.Keyboard;
import control.workProduct.RetrieveWorkProduct;


public class UpdateProcessRole
{
	public void updateProcessRole(Resource resource, int index)
	{
		try
		{
			Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
			ProcessRole processRole = fac.createProcessRole();
			processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + index);	
			
			System.out.println("Which the operation do you want execute?");
			System.out.println("[1] Update the name [2] Include WorkProduct [3] Delete WorkProduct [4] Include Activity [5] Delete Activity [6] Return");
			int op = Keyboard.readInt();
			
			if (op == 1)
			{
				System.out.println("Inform the name of the control.process role: ");
				String nameRole = Keyboard.readString();
				processRole.setName(nameRole);
			}
			else if (op == 2)
			{
				RetrieveWorkProduct workProducts = new RetrieveWorkProduct();
				workProducts.retrieveWorkProduct(resource);
				System.out.println("Inform the index of the WorkProduct: ");
				int indexProduct = Keyboard.readInt();
				WorkProduct workProduct = fac.createWorkProduct();
				workProduct = (WorkProduct) resource.getEObject("//@WorkProduct." + indexProduct);	
				processRole.getWorkProducts().add(workProduct);
				workProduct.setResponsibleRoles(processRole);
				resource.save(null);
				System.out.println("WorkProducts of this ProcessRole");
				for (int i=0; i < processRole.getWorkProducts().size(); i++)
				{
					workProduct = (WorkProduct) processRole.getWorkProducts().get(i);
					System.out.println("Index " + i + " | " + "WorkProduct " + workProduct.getName());
				}
			}
			else if (op == 3)
			{
				WorkProduct workProduct = fac.createWorkProduct();
				System.out.println("WorkProducts of this ProcessRole: \n");
				for (int i=0; i < processRole.getWorkProducts().size(); i++)
				{
					workProduct = (WorkProduct) processRole.getWorkProducts().get(i);
					System.out.println("Index " + i + " | " + "WorkProduct " + workProduct.getName());
				}
				System.out.println("\nInform the index of the WorkProduct: ");
				int indexProduct = Keyboard.readInt();
				workProduct = (WorkProduct) resource.getEObject("//@WorkProduct." + indexProduct);	
				processRole.getWorkProducts().remove(workProduct);
				workProduct.setResponsibleRoles(null);
			}
			else if (op == 4)
			{
				RetrieveActivity activities = new RetrieveActivity();
				activities.retrieveActivity(resource);
				System.out.println("Inform the index of the Activity: ");
				int indexActivity = Keyboard.readInt();
				Activity activity = fac.createActivity();
				activity = (Activity) resource.getEObject("//@Activity." + indexActivity);	
				processRole.getActivities().add(activity);
				activity.getAssistants().add(processRole);
				resource.save(null);
				for (int i=0; i < processRole.getActivities().size(); i++)
				{
					activity = (Activity) processRole.getActivities().get(i);
					System.out.println("Index " + i + " | " + "Activity " + activity.getName());
				}
			}
			else if (op == 5)
			{
				Activity activity = fac.createActivity();
				System.out.println("Activities of this ProcessRole: \n");
				for (int i=0; i < processRole.getActivities().size(); i++)
				{
					activity = (Activity) processRole.getActivities().get(i);
					System.out.println("Index " + i + " | " + "Activity " + activity.getName());
				}
				System.out.println("\nInform the index of the Activity: ");
				int indexActivity = Keyboard.readInt();

				activity = (Activity) resource.getEObject("//@Activity." + indexActivity);	
				processRole.getActivities().remove(activity);
				activity.getAssistants().remove(processRole);
			}
			else if (op == 6)
			{
				return;
			}
			else 
			{
				System.out.println("Inform a valid option!");
			}
						
			resource.save(null);
			System.out.println("\nProcessRole updated!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
