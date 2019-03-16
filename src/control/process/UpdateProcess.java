/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.process
* Class: UpdateProcess.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.process;

import org.eclipse.emf.ecore.resource.Resource;

import control.activity.CreateActivity;
import control.activity.DeleteActivity;
import control.activity.RetrieveActivity;
import control.activity.UpdateActivity;
import control.processRole.CreateProcessRole;
import control.processRole.DeleteProcessRole;
import control.processRole.RetrieveProcessRole;
import control.processRole.UpdateProcessRole;
import control.step.CreateStep;
import control.step.DeleteStep;
import control.step.UpdateStep;
import control.util.Keyboard;
import control.workProduct.CreateWorkProduct;
import control.workProduct.DeleteWorkProduct;
import control.workProduct.RetrieveWorkProduct;
import control.workProduct.UpdateWorkProduct;


public class UpdateProcess
{	
	public void updateProcess(Resource resource)	
	{
		System.out.println("\nTrying to alter a control.process...\n");
		RetrieveProcess retrieveProcess = new RetrieveProcess();
		retrieveProcess.retrieveProcess(resource);
		
		byte choice = 0;
		while (choice != 17)
		{
			System.out.println("\nWhich operation do you want to execute?");
			System.out.println("[1] Create WorkProduct, [2] Retrieve WorkProducts, [3] Update WorkProduct, [4] Delete WorkProduct");
			System.out.println("[5] Create ProcessRole, [6] Retrieve ProcessRoles, [7] Update ProcessRole, [8] Delete ProcessRole");
			System.out.println("[9] Create Activity, [10] Retrieve Activities, [11] Update Activity, [12] Delete Activity");
			System.out.println("[13] Create Step, [14] Retrieve Steps, [15] Update Step, [16] Delete Step, [17] Main Menu");
			
			choice = Keyboard.readByte();
			
			if (choice == 1)
			{
				CreateWorkProduct createWorkProduct = new CreateWorkProduct();
				createWorkProduct.createWorkProduct(resource);	
			}
			
			else if (choice == 2)
			{
				RetrieveWorkProduct retrieveWorkProduct = new RetrieveWorkProduct();
				retrieveWorkProduct.retrieveWorkProduct(resource);	
			}
			
			else if (choice == 3)
			{
				RetrieveWorkProduct retrieveWorkProduct = new RetrieveWorkProduct();
				retrieveWorkProduct.retrieveWorkProduct(resource);
				System.out.println("\nInform the index of the WorkProduct");
				int i = (Keyboard.readInt());
				UpdateWorkProduct updateWorkProduct = new UpdateWorkProduct();
				updateWorkProduct.updateWorkProduct(resource, i);	
			}
			
			else if (choice == 4)
			{
				RetrieveWorkProduct retrieveWorkProduct = new RetrieveWorkProduct();
				retrieveWorkProduct.retrieveWorkProduct(resource);
				System.out.println("\nInform the index of the WorkProduct");
				int i = (Keyboard.readInt());
				DeleteWorkProduct deleteWorkProduct = new DeleteWorkProduct();
				deleteWorkProduct.deleteWorkProduct(resource, i);	
			}
			
			else if (choice == 5)
			{
				CreateProcessRole createProcessRole = new CreateProcessRole();
				createProcessRole.createProcessRole(resource);
			}
			
			else if (choice == 6)
			{
				RetrieveProcessRole retrieveProcessRole = new RetrieveProcessRole();
				retrieveProcessRole.retrieveProcessRole(resource);
			}
			
			else if (choice == 7)
			{
				RetrieveProcessRole retrieveProcessRole = new RetrieveProcessRole();
				retrieveProcessRole.retrieveProcessRole(resource);
				System.out.println("\nInform the index of the ProcessRole");
				int i = (Keyboard.readInt());
				UpdateProcessRole updateProcessRole = new UpdateProcessRole();
				updateProcessRole.updateProcessRole(resource, i);
			}
			
			else if (choice == 8)
			{
				RetrieveProcessRole retrieveProcessRole = new RetrieveProcessRole();
				retrieveProcessRole.retrieveProcessRole(resource);
				System.out.println("\nInform the index of the ProcessRole");
				int i = (Keyboard.readInt());
				DeleteProcessRole deleteProcessRole = new DeleteProcessRole();
				deleteProcessRole.deleteProcessRole(resource, i);
			}
			
			else if (choice == 9)
			{
				CreateActivity createActivity = new CreateActivity();
				createActivity.createActivity(resource);
			}
			
			else if (choice == 10)
			{
				RetrieveActivity retrieveActivity = new RetrieveActivity();
				retrieveActivity.retrieveActivity(resource);
			}
			
			else if (choice == 11)
			{
				RetrieveActivity retrieveActivity = new RetrieveActivity();
				retrieveActivity.retrieveActivity(resource);
				System.out.println("\nInform the index of the Activity");
				int i = (Keyboard.readInt());
				UpdateActivity updateActivity = new UpdateActivity();
				updateActivity.updateActivity(resource, i);
			}
			
			else if (choice == 12)
			{
				RetrieveActivity retrieveActivity = new RetrieveActivity();
				retrieveActivity.retrieveActivity(resource);
				System.out.println("\nInform the index of the Activity");
				int i = (Keyboard.readInt());
				DeleteActivity deleteActivity = new DeleteActivity();
				deleteActivity.deleteActivity(resource, i);
			}
			
			else if (choice == 13)
			{
				CreateStep createStep = new CreateStep();
				createStep.createStep(resource);
			}
			
			else if (choice == 14)
			{
				RetrieveActivity retrieveActivity = new RetrieveActivity();
				retrieveActivity.retrieveActivity(resource);
				System.out.println("\nInform the index of the Activity");
				int i = (Keyboard.readInt());
				retrieveActivity.retrieveActivityStep(resource, i);
			}
			
			else if (choice == 15)
			{
				UpdateStep updateStep = new UpdateStep();
				updateStep.updateStep(resource);
			}
			
			else if (choice == 16)
			{
				DeleteStep deleteStep = new DeleteStep();
				deleteStep.deleteStep(resource);
			}
			
			else if (choice == 17)
			{				
				resource = null;
				return;
			}
			else
			{
				System.out.println("Inform a valid option!");
			}
		}
	}

}

