package exercise_1.views.menus;

import com.liche.utils.console.command_menu.Command;

import exercise_1.controllers.StoreController;
import exercise_1.views.Message;

public class AddFlowerCommand extends Command {
	
	private StoreController storeController;
	
	public AddFlowerCommand (StoreController storeController) {
		super(Message.ADD_FLOWER_COMMAND_TITLE.toString());
		this.storeController = storeController;
	}

	@Override
	public void execute() {
		

	}

	@Override
	public boolean isActive() {
		return true;
	}

}