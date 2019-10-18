package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object args) {
		// TODO Auto-generated method stub
		DMComponent dm = (DMComponent) args; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting list of Integer values from the system:\n"); 
		String listName = io.getInput("\nEnter name of the list to be deleted: "); 
		dm.deleteList(listName); 
	}

}
 