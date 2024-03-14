package exposeRust;

import Model.Model;
import View.View;
import ViewModel.ViewModel;

public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		
		ViewModel viewModel = new ViewModel(model);
		
		View view = new View(viewModel);
		
		view.displayData(viewModel.getData());
		
		view.changeData(665);
		
		
	}

}
