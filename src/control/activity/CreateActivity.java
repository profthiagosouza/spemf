/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.activity
* Class: CreateActivity.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.activity;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

import control.processRole.RetrieveProcessRole;
import control.util.Keyboard;
import model.spem.Activity;
import model.spem.Process;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.impl.Spem2FactoryImpl;

public class CreateActivity {
	/**
	 * Method used to create a control.activity
	 * 
	 * @param resource
	 */
	public void createActivity(Resource resource) {
		Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
		Process process = fac.createProcess();
		process = (Process) resource.getContents().get(0);
		Activity activity = fac.createActivity();
		System.out.println("Inform the name of the Activity: ");
		activity.setName(Keyboard.readString());
		boolean need = true;
		while (need == true) {
			System.out.println("Do you need to associate to a ProcessRole? [Y] Yes [N] No");
			char opAc = Keyboard.readChar();
			if ((opAc == 'Y') || (opAc == 'y')) {
				RetrieveProcessRole retrieveRoles = new RetrieveProcessRole();
				retrieveRoles.retrieveProcessRole(resource);
				System.out.println("Inform the index of the ProcessRole: ");
				int indexRole = Keyboard.readInt();
				ProcessRole processRole = fac.createProcessRole();
				processRole = (ProcessRole) resource.getEObject("//@ProcessRole." + indexRole);
				activity.getAssistants().add(processRole);
				processRole.getActivities().add(activity);// testar
			} else {
				need = false;
			}
		}

		process.getActivity().add(activity);
		resource.getContents().add(process);

		try {
			resource.save(null);
			System.out.println("Activity created with success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
