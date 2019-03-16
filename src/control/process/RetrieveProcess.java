/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.process
* Class: RetrieveProcess2.java
* Author: Thiago
* Date: 28/01/2006
* Class description: 
**************************************************
*/

package control.process;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import model.spem.Activity;
import model.spem.Process;
import model.spem.ProcessRole;
import model.spem.Spem2Factory;
import model.spem.Spem2Package;
import model.spem.Step;
import model.spem.WorkProduct;
import model.spem.impl.Spem2FactoryImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import control.util.Keyboard;


public class RetrieveProcess
{
	static boolean ioError = false;
	
	/**
	 * Method used to retrieve a control.process
	 * @param resource
	 */
	public void retrieveProcess(Resource resource)
	{
		String processName;
		System.out.println("Inform the name of the control.process: ");
		processName = (Keyboard.readString());
		System.out.println("\nTrying to consult control.process...\n");		
		resource.setURI(URI.createURI("file:/c:/" + processName + ".xml"));
		
		try
		{
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(Spem2Package.eINSTANCE);
			Map options = new HashMap();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);	
			resource.load(options);
			
			Spem2Factory fac = Spem2FactoryImpl.eINSTANCE;
			Process process = fac.createProcess();
			process = (Process) resource.getContents().get(0);
			System.out.println("Process name: " + process.getName() + "\n");
				
			for (int a=0; a < process.getActivity().size(); a++)
			{
				Activity activity = fac.createActivity();
				activity = (Activity) resource.getEObject("//@Activity." + a);
				System.out.println("\tActivity " + a + ": " + activity.getName());
				
				System.out.println("\n\t\t-- List of Steps --");
				for (int s=0; s < activity.getSteps().size(); s++)
				{
					Step step = fac.createStep();
					step = (Step) activity.getSteps().get(s);
					System.out.println("\t\tStep " + s + ": " + step.getName());
				}

				System.out.println("\n\t\t-- List of ProcessRoles --");
				ProcessRole processRole = fac.createProcessRole();
				for (int r=0; r < activity.getAssistants().size(); r++)
				{
					processRole = (ProcessRole) activity.getAssistants().get(r);
					System.out.println("\t\tProcess Role " + r + ": " + processRole.getName());
/*					if(control.processRole.getWorkProducts().size() > 0)
						System.out.println("\n\t\t-- List of WorkProducts --");
					for (int p=0; p < control.processRole.getWorkProducts().size(); p++)
					{
						WorkProduct control.workProduct = (WorkProduct)control.processRole.getWorkProducts().get(p);
						System.out.println("\t\tWorkProduct " + p + ": " + control.workProduct.getName());
					}*/
				}
				
/*					//EList listRoles = (EList) control.activity.getAssistants();
					WorkProduct control.workProduct = fac.createWorkProduct();

					for(int i=0; i < control.activity.getAssistants().size(); i++)
					{
						control.processRole = (ProcessRole) control.activity.getAssistants().get(p);
						control.workProduct = (WorkProduct) control.processRole.getWorkProducts().get(i);
						System.out.println("\t\tWorkProduct " + i + ": " + control.workProduct.getName());
					}*/
				System.out.println("\n");
			}
			System.out.println("\t-- List of WorkProducts --");
			for (int w=0; w < process.getWorkProduct().size(); w++)
			{
				WorkProduct workProduct = (WorkProduct)process.getWorkProduct().get(w);
				System.out.println("\t\tWorkProduct " + w + ": " + workProduct.getName());
			}
		}
		catch (IOException e)
		{
			System.out.println("The system cannot find the specified control.process (" + processName + ")");
			ioError = true;
		}
	}
}