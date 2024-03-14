package exposeRust;

public class View {
	private ViewModel viewModel;
	
	public View(ViewModel viewModel) {
		this.viewModel = viewModel;
	}
	
	public void displayData(int data) {
		System.out.println("Donnée affichées dans la vue : " + data);
	}


}
