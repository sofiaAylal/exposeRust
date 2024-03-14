package exposeRust;

public class ViewModel {
	private Model model;
	
	public ViewModel(Model model) {
		this.model = model;
	}
	
	public void updateData(int data) {
		model.setData(data);
	}
	
	public int getData() {
		return model.getData();
	}

}
