/*
**************************************************
* SPemf - SPEM processes through EMF
* Project: Spemf
* Package: control.step
* Class: RetrieveStep.java
* Author: Thiago
* Date: 10/02/2006
* Class description: 
**************************************************
*/

package control.step;

import org.eclipse.emf.ecore.resource.Resource;

import control.activity.RetrieveActivity;



public class RetrieveStep
{
	public void retrieveStep(Resource resource, int index)
	{
		RetrieveActivity retrieve = new RetrieveActivity();
		retrieve.retrieveActivityStep(resource, index);
	}
}
