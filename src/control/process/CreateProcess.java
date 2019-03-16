/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.process
* Class: CreateProcess.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.process;

import java.io.IOException;

import model.spem.Activity;
import model.spem.Process;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.Step;
import model.spem.WorkProduct;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import control.activity.RetrieveActivity;
import control.processRole.RetrieveProcessRole;
import control.util.Keyboard;


public class CreateProcess
{
	public void createProcess(Resource resource)
	{
		try
		{
			Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
			
			String processName;
			System.out.println("Inform the name of the control.process: ");
			Process process = fac.createProcess();
			process.setName(Keyboard.readString());
			processName = process.getName();
			resource.setURI(URI.createURI("file:/c:/" + processName + ".xml"));
			boolean save = false;
			
			while (save == false)
			{
				System.out.println("Which the operation do you want execute?");
				System.out.println("[1] Create WorkProduct [2] Create ProcessRole [3] Create Activity [4] Create Step [5] Save [6] Return");
				int op = Keyboard.readInt();
				
				if (op == 1)
				{
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
				}
				else if (op == 2)
				{
					ProcessRole processRole = fac.createProcessRole();
					System.out.println("Inform the name of the ProcessRole: ");
					processRole.setName(Keyboard.readString());
					boolean need = true;
					while (need == true)
					{
						System.out.println("Do you need to associate to a Activity? [Y] Yes [N] No" );
						char opPr = Keyboard.readChar();
						if ((opPr == 'Y') || (opPr == 'y'))
						{
							RetrieveActivity retrieveActivities = new RetrieveActivity();
							retrieveActivities.retrieveActivity(resource);
							System.out.println("Inform the index of the Activity: ");
							int indexActivity = Keyboard.readInt();
							Activity activity = fac.createActivity();
							activity = (Activity) resource.getEObject("//@Activity." + indexActivity);	
							processRole.getActivities().add(activity);
							activity.getAssistants().add(processRole);//testar
						}
						else
						{
							need = false;
						}					
					}

					process.getProcessRole().add(processRole);
					resource.getContents().add(process);
					resource.save(null);
				}
				else if (op == 3)
				{
					Activity activity = fac.createActivity();
					System.out.println("Inform the name of the Activity: ");
					activity.setName(Keyboard.readString());
					boolean need = true;
					while (need == true)
					{
						System.out.println("Do you need to associate to a ProcessRole? [Y] Yes [N] No" );
						char opAc = Keyboard.readChar();
						if ((opAc == 'Y') || (opAc == 'y'))
						{
							RetrieveProcessRole retrieveRoles = new RetrieveProcessRole();
							retrieveRoles.retrieveProcessRole(resource);
							System.out.println("Inform the index of the ProcessRole: ");
							int indexRole = Keyboard.readInt();
							ProcessRole processRole = fac.createProcessRole();
							processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + indexRole);		
							activity.getAssistants().add(processRole);
							processRole.getActivities().add(activity);//testar
						}
						else
						{
							need = false;
						}	
					}

					process.getActivity().add(activity);
					resource.getContents().add(process);
					resource.save(null);
				}
				else if (op == 4)
				{
					RetrieveActivity retrieveActivities = new RetrieveActivity();
					retrieveActivities.retrieveActivity(resource);
					Activity activity = fac.createActivity();
					System.out.println("Inform the index of the Activity: ");
					int indexActivity = Keyboard.readInt();
					activity = (Activity) resource.getEObject("//@Activity." + indexActivity);
					retrieveActivities.retrieveActivityStep(resource, indexActivity);
					System.out.println("Inform the name of the new Step: ");
					String stepName = Keyboard.readString();
					Step step = fac.createStep();
					step.setName(stepName);
					activity.getSteps().add(step);
					resource.getContents().add(process);
					resource.save(null);
				}
				else if (op == 5)
				{
					resource.getContents().add(process);
					resource.save(null);
					save = true;
					System.out.println("Process created with success!");
				}
				else if (op == 6)
				{
					return;
				}
				else
				{
					System.out.println("Inform a valid option!");
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}